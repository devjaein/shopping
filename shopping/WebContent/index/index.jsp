<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>


</head>
<body>
	<form action="join.so" method="post">
		<input type="text" placeholder="아이디" name="id" id="login_but" required />
		<br /> <br />
		<input type="password" placeholder="비밀번호" name="password" id="login_but" required /> 
		<br /> <br />
		<input type="text" placeholder="이름" name="name" id="login_but" required /> 
		<br /> <br />
    	<label><input type="radio" name="gender" value="man"> 남자</label>
    	<label><input type="radio" name="gender" value="woman"> 여자</label>		
    	<br /> <br />
		<input type="text" placeholder="이메일" name="email" id="login_but" required /> 
		<br /> <br />
		<input type="text" placeholder="핸드폰 번호" name="phone" id="login_but" required /> 
		<br /> <br />
		<input type="text" placeholder="주소" name="address" id="login_but" required /> 
		<br /> <br />
		<p>
			<input type="submit" value="회원가입" id="signup"><br /> <br />
		</p>
	</form>
</body>
</html>