<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Person Entry Page</title>
<style>
/* Basic styling for the form */
form {
	width: 300px;
	margin: 0 auto;
}

input {
	width: 100%;
	padding: 8px;
	margin: 8px 0;
	border: 1px solid #ccc;
	border-radius: 4px;
}

h1 {
	text-align: center;
}
</style>
</head>
<body>

	<h1>Person Entry Page</h1>

	<form action="create_person.jsp" method="post">
		<input type="text" name="name" placeholder="Name" /> <input
			type="text" name="age" placeholder="Age" /> <input type="text"
			name="weight" placeholder="Weight" /> <input type="submit"
			value="Create" />
	</form>

</body>
</html>
