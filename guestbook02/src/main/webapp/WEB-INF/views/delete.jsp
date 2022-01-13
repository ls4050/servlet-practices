<%@page import="com.poscoict.guestbook.dao.GuestbookDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");

String password = request.getParameter("password");
String no = request.getParameter("id");

new GuestbookDao().delete(no, password);

response.sendRedirect("/guestbook01");
%>
