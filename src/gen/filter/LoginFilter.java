package gen.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Filename: LoginFilter.java
 * @author Yang E-mail: yangfujun2006@hotmail.com
 * @Copyright: Copyright (c) 2017
 * @version created time：2019年1月30日 下午1:34:16
 * @version 1.0
 */
public class LoginFilter implements Filter {

	public LoginFilter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request2 = (HttpServletRequest) request;
		HttpSession session = request2.getSession();
		Object object = session.getAttribute("currentUser");
		String pathString = request2.getServletPath();

		if (object == null && pathString.indexOf("login") < 0) {
			request2.getRequestDispatcher("/htm/login2.jsp").forward(request, response);
		} else {
			chain.doFilter(request, response);
		}

	}

}
