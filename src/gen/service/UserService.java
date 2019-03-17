package gen.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import gen.dao.UserMapper;
import gen.model.User;
import gen.model.UserExample;
import pr.util.MyBatisSqlSessionFactory;

public class UserService {

	public UserService() {
		// TODO Auto-generated constructor stub

	}

	public List<User> findBestbuyallSame(UserExample example) {
		List<User> users;
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			UserMapper employeeMapper = sqlSession.getMapper(UserMapper.class);
			users = employeeMapper.selectByExample(example);
		} finally {// If sqlSession is not closed //then database Connection associated this
					// sqlSession will not be returned to pool //and application may run out of
					// connections. sqlSession.close(); } }
			sqlSession.close();
		}
		return users;
	}

	public int updateBestbuyallSame(User record) {
		int flag = 0;
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			UserMapper employeeMapper = sqlSession.getMapper(UserMapper.class);
			flag = employeeMapper.updateByPrimaryKeySelective(record);
			sqlSession.commit();
		} finally {// If sqlSession is not closed //then database Connection associated this
					// sqlSession will not be returned to pool //and application may run out of
					// connections. sqlSession.close(); } }
			sqlSession.close();
		}
		return flag;
	}

	public void createEmployee(User employee) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			UserMapper employeeMapper = sqlSession.getMapper(UserMapper.class);
			employeeMapper.insertSelective(employee);
			sqlSession.commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sqlSession.close();
		}
	}

	public int deleteEmployee(int id) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		int row = -1;
		try {
			UserMapper employeeMapper = sqlSession.getMapper(UserMapper.class);
			row = employeeMapper.deleteByPrimaryKey(id);
			sqlSession.commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sqlSession.close();
		}
		return row;
	}

}
