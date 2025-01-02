<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.time.LocalDate"%>
<!DOCTYPE html>
<html>
<body>
	<%--Including the resource : color.html --%>
	<%@include file="color.html"%>
	<%--Using a declaration section to declare a variable and define a method --%>
	<%!int val = 7;

	public String sayWelcome(String name) {
		String message = "Welcome! " + name;
		return message;
	}%>
	<%--Showing HELLO using h1 heading 5 times --%>
	<%--Starting a 'for' loop using Scriptle --%>
	<%
	for (int a = 1; a <= 5; a++) {
	%>
	<h1>Hello!!!</h1>
	<%
	}
	%>
	<%--Fetching a value of variable: val using expression --%>
	<h2>
		Val=<%=val%></h2>
	<h2>
		Square of val=<%=(val * val)%></h2>
	<%--Invoking the method: sayWelcome() using expression --%>
	<h2>
		Reply from method is
		<%=sayWelcome("Dipali")%></h2>
	<%--Creating a LocalDate object for system date --%>
	<%
	LocalDate today = LocalDate.now();
	%>
	<h2>
		Today's date is
		<%=today%></h2>
</body>
</html>