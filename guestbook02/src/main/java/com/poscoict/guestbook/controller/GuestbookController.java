package com.poscoict.guestbook.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poscoict.guestbook.dao.GuestbookDao;
import com.poscoict.guestbook.vo.GuestbookVo;

public class GuestbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String actionName = request.getParameter("a");
		if ("add".equals(actionName)) {
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String message = request.getParameter("message");

			GuestbookVo vo = new GuestbookVo();
			vo.setName(name);
			vo.setPassword(password);
			vo.setMessage(message);

			new GuestbookDao().insert(vo);
//			request.getRequestDispatcher(request.getContextPath() + "/gb");
			response.sendRedirect(request.getContextPath()+"/gb");

		} else if ("delete".equals(actionName)) {
			String password = request.getParameter("password");
			String no = request.getParameter("id");

			new GuestbookDao().delete(no, password);
			request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);

		} else if ("deleteform".equals(actionName)) {
			String no = request.getParameter("no");
			request.setAttribute("no", no);
			request.getRequestDispatcher("WEB-INF/views/deleteform.jsp").forward(request, response);
		} else {
			List<GuestbookVo> list = new GuestbookDao().findAll();
			request.setAttribute("list", list);

			request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
