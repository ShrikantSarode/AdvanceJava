<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Person Created</title>
</head>
<body>
	<%-- Instantiating a Java bean: Person --%>
	<jsp:useBean id="personObj" class="example.bean.Person" scope="session" />

	<%-- Getting values from the request and setting them to the Person bean --%>
	<jsp:setProperty name="personObj" property="name" />
	<jsp:setProperty name="personObj" property="age" />
	<jsp:setProperty name="personObj" property="weight" />

	<h1>Person Created Successfully!!</h1>
	<h2>
		To view, please <a href="show_person.jsp">Click Here</a>
	</h2>
</body>
</html>
