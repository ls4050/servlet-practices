<%@page import="com.poscoict.emaillist.dao.EmaillistDao"%>
<%@page import="com.poscoict.emaillist.vo.EmaillistVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
	String firstname = request.getParameter("fn");
	String lastname = request.getParameter("ln");
	String email = request.getParameter("email");
	
	EmaillistVo vo = new EmaillistVo();
	vo.setFirstName(firstname);
	vo.setLastName(lastname);
	vo.setEmail(email);
	
	new EmaillistDao().insert(vo);
	
	response.sendRedirect("/emaillist01");
%>