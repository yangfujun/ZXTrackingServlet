package gen.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import gen.model.User;
import gen.model.UserExample;
import gen.model.UserExample.Criteria;
import gen.service.UserService;

/**
 * @Filename: LoginServlet.java
 * @author Yang E-mail: yangfujun2006@hotmail.com
 * @Copyright: Copyright (c) 2017
 * @version created time：2019年1月11日 下午2:32:20
 * @version 1.0
 */
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String userNameString = req.getParameter("userName");
		String passwordString = req.getParameter("password");

		UserService userService = new UserService();
		UserExample userExample = new UserExample();
		List<User> users = new ArrayList<User>();

		Criteria criteria = userExample.createCriteria();
		criteria.andUserNameEqualTo(userNameString);
		criteria.andPasswordEqualTo(passwordString);

		users = userService.findBestbuyallSame(userExample);
		if (users.size() == 0) {
			System.out.println("no");
			req.setAttribute("error", "UserName or password is not right");
			req.setAttribute("userName", userNameString);
			req.setAttribute("password", passwordString);
			req.getRequestDispatcher("/htm/login2.jsp").forward(req, resp);

		} else {
			System.out.println("Yes" + "size: " + users.size());
			System.out.println(users);
			HttpSession session = req.getSession();
			session.setAttribute("currentUser", users.get(0));
			resp.sendRedirect("home.jsp");
		}

	}

}
