package gen.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Filename: LoginServlet.java
 * @author Yang E-mail: yangfujun2006@hotmail.com
 * @Copyright: Copyright (c) 2017
 * @version created time：2019年1月11日 下午2:32:20
 * @version 1.0
 */
public class LogoutServlet extends HttpServlet {

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
		System.out.println("test in logoutServlet");
		req.getSession().invalidate();
		resp.sendRedirect("login2.jsp");

	}

}
