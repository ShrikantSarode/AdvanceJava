<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<%--Obtaining user name from session scope against the name : loggedInUser --%>
	<%
	Object loggedInUserName = session.getAttribute("loggedInUser");
	%>
	<h1 style="background-color: skyblue; color: black;">
		Hey
		<%=loggedInUserName%>, Congratulations !!! You are IN.
	</h1>

</body>
</html>