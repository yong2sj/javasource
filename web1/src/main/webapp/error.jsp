<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
    <!-- isErrorPage를 쓴 이유 -> 밑에 exception 문구를 쓰기위해서 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>에러가 발생했습니다. 페이지가 복구 중에 있습니다.</p>
<%=exception.getMessage() %>
</body>
</html>