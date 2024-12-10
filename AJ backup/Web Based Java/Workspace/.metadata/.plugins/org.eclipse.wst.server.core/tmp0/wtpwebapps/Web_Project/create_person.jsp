<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<%--Instantiating a Java bean: Person --%>
	<jsp:useBean id="personObj" class="example.bean.Person" scope="session" />
	<%--Setting the values of the properties of the bran --%>
	<jsp:setProperty property="*" name="personObj" />
	<h1>Person created sucessfully.</h1>
	<h1>
		To view, please <a href="show_person.jsp">click here</a>!
	</h1>
</body>
</html>