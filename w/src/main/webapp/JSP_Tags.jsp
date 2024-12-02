<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.time.LocalDate"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--Including the resourse: color.html --%>
	<%@ include file="color.html"%>

	<%--Using a declaration section to declare a variable and define a method --%>
	<%!int val = 7;

	public String sayWelcome(String name) {
		String message = "Welcome " + name;
		return message;
	}%>
	<%--Showing HELLO using h1 heading 5 times --%>
	<%--Starting a 'for' loop using Scriptlet--%>
	<%
	for (int a = 1; a <= 5; a++) {
	%>
	<h1>HELLO</h1>

	<%
	}
	%>
	<%--Fetching the value of variable : val using expression --%>
	<h2>
		Val=
		<%=val%></h2>
	<h2>
		Square of Val =
		<%=(val * val)%></h2>

	<%--Invoking the method:sayWelcome() using expression --%>

	<h2>
		Reply from method is
		<%=sayWelcome("James")%></h2>

	<%--Creating a LocalDate object for system date --%>
	<%
	LocalDate today = LocalDate.now();
	%>
	<h2>
		Today's date is <%= today%></h2>








</body>
</html>





















