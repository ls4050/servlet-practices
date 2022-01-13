package com.poscoict.emaillist02.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poscoict.emaillist.dao.EmaillistDao;
import com.poscoict.emaillist.vo.EmaillistVo;

public class EmaillistController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String actionName = request.getParameter("a");

		if ("form".equals(actionName)) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/form.jsp"); //객체를 리턴한 것 아직넘어간 것은 아니다.
			rd.forward(request, response);
		} else if ("add".equals(actionName)) {
			String firstname = request.getParameter("fn");
			String lastname = request.getParameter("ln");
			String email = request.getParameter("email");
			
			EmaillistVo vo = new EmaillistVo();
			vo.setFirstName(firstname);
			vo.setLastName(lastname);
			vo.setEmail(email);
			
			new EmaillistDao().insert(vo);
			
			response.sendRedirect(request.getContextPath() + "/el");
		} else {
			EmaillistDao dao = new EmaillistDao();
			List<EmaillistVo> list = dao.findAll();
			
			request.setAttribute("list", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/index.jsp"); //객체를 리턴한 것 아직넘어간 것은 아니다.
			rd.forward(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
