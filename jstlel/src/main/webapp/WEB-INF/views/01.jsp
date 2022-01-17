<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EL TEST</h1>
	

	<h4>value</h4>
	${ival}<br/> 
	${lval}<br/>
	${fval}<br/>
	${bval}<br/>
	${sval}
	
	<h4>object</h4>
	---${obj}---<br/>
	${user.no}<br/>
	${user.name}
	
	<h4>map</h4>
	${m.ival}<br/> 
	${m.lval}<br/>
	${m.fval}<br/>
	${m.bval}
	
	<h4>+-/%</h4>
	${3*4+6/2 }<br/>
	${ival + 10 }
	
	<h4>==, <, >, !=</h4>
	${ival == 10 } <br/>
	${ival < 5 } <br/>
	${obj == null }
	${empty obj} <br/> <!-- null X => empty O -->
	${obj != null }
	${not empty obj}
	
	
	<h4>&&, ||</h4>
	${ival == 10 && lval <100 } <br/>
	${ival == 10 || lval <100 } 

	<h4>request parameter</h4>
	---${param.a + 10 }--- <br/>
	---${param.email }---
		
</body>
</html>