<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri=" http://java.sun.com/jsp/jstl/core" %>
<c:set var="user" value="${userVO}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>귀하가 입력하신 정보는 아래와 같습니다.</h2>
	<ul>
		<li>${userid}</li>
		<li>${name}</li>
		<li>${gender}</li>
		<li>${city}</li>
	</ul>
</body>
</html>