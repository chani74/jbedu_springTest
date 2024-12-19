<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 가입 정보 확인</h2>
	
	<hr>
	1안으로 받기 
	<hr>
	아이디 :  ${mid} <br><br> 
	비밀번호 :  ${mpw} <br><br> 
	이름 :  ${mname} <br><br> 
	이메일 :  ${memail} <br><br> 

	<hr>
	2안으로 받기 
	<hr>
	아이디 :  ${memberDto.mid} <br><br> 
	비밀번호 :  ${memberDto.mpw} <br><br> 
	이름 :  ${memberDto.mname} <br><br> 
	이메일 :  ${memberDto.memail} <br><br> 


</body>
</html>