<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>JSTL(forEach Tag) test</h4>
	
	<!-- pageContext에 저장하는 코드 -->
	<c:set var="count" value="${fn:length(list) }"/>
	
	<!-- 이름으로 저장해서 EL로 불러오는것이 가능 -->
	<c:forEach items="${list }" var = "vo" varStatus="status">
		[${count-status.index}][${status.index }:${status.count }]${vo.no } : ${vo.name } <br/>
	</c:forEach>
</body>
</html>