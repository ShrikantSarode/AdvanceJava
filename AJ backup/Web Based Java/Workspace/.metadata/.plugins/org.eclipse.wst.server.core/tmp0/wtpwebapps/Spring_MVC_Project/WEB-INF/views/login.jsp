<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body bgcolor="aliceblue">
	
	<form action="doValidateAgain" method="post" style="width: 500px; margin: 100px; padding: 10px; border: 1px solid black; border-radius: 20px; box-shadow: 0 0 10px black">
		<h1>Login Form</h1>
		<pre>
		<h2>User Name:</h2>
		<input type="text" name="uid" placeholder="username"
				style="background-color: lightyellow; color: blue; font-size: 18pt" ><br /> 
		
		<h2>Password:</h2>
		<input type="password" name="pwd" placeholder="password"
				style="background-color: lightyellow; color: blue; font-size: 18pt"><br /> 
				<input type="submit" value="Login" />
		</pre>
	</form>
</body>
</html>