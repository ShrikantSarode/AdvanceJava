<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Person</title>
</head>
<body>
	<%-- Retrieve the Person object from session --%>
	<jsp:useBean id="personObj" class="example.bean.Person" scope="session" />

	<h1>Person Details</h1>
	<p>
		Name:
		<jsp:getProperty name="personObj" property="name" /></p>
	<p>
		Age:
		<jsp:getProperty name="personObj" property="age" /></p>
	<p>
		Weight:
		<jsp:getProperty name="personObj" property="weight" /></p>



</body>
</html>
