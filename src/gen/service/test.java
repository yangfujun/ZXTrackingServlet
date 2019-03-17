package gen.service;

import java.util.ArrayList;
import java.util.List;

import gen.model.User;
import gen.model.UserExample;

/**
 * @Filename: test.java
 * @author Yang E-mail: yangfujun2006@hotmail.com
 * @Copyright: Copyright (c) 2017
 * @version created time：2019年1月10日 下午3:41:21
 * @version 1.0
 */
public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserService();
		/*
		 * DispachExample dispachExample=new DispachExample();
		 * gen.model.DispachExample.Criteria criteria=dispachExample.createCriteria();
		 * criteria.andInviceidEqualTo(barCode.getInvoiceCode()).andStatusNotEqualTo(
		 * "done");
		 */
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(1);

		List<User> user = new ArrayList<>();
		user = userService.findBestbuyallSame(example);
		System.out.println(user);

	}

}
