<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- HTML 주석이 가능하다 -->
<%-- jsp에서 새로 나온 주석이다 --%>
<%
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date date = new Date();
	
	// 브라우저에 자바 값을 출력
	out.print(sdf.format(date));
	
%>

<%=sdf.format(date) %>
</body>
</html>