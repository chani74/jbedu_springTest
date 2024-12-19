<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>checkid</title>
</head>
<body>
	<h2>checkid.jsp</h2>
	<hr>
	
	<!-- jstl if else -->
	<c:choose>
		<c:when test="${idcheck eq 'memberOk' }">
			<h2>${loginid }님 로그인 성공 </h2>
		</c:when>
		<c:otherwise>
			<h2> 로그인 실패 </h2>
		</c:otherwise>
	</c:choose>
</body>
</html>