<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body bgcolor="aliceblue">

	<form action="doValidateAgain" method="post"
		style="width: 500px; margin: 100px; padding: 10px; border: 1px solid black; border-radius: 20px; box-shadow: 0 0 10px black">
		<h1>Add Team</h1>
		<pre>
		<h2>Team ID:</h2>
		<input type="text" name="t_id" placeholder="id"
				style="background-color: lightyellow; color: blue; font-size: 18pt"><br /> 
		
		<h2>Team Name:</h2>
		<input type="text" name="t_name" placeholder="name"
				style="background-color: lightyellow; color: blue; font-size: 18pt"><br /> 
		
		<h2>Test Ranking:</h2>
		<input type="text" name="t_rank" placeholder="test rank"
				style="background-color: lightyellow; color: blue; font-size: 18pt"><br /> 
		
		<h2>ODI Ranking:</h2>
		<input type="text" name="o_rank" placeholder="odi rank"
				style="background-color: lightyellow; color: blue; font-size: 18pt"><br /> 
		
		<h2>T20 Ranking:</h2>
		<input type="text" name="t2_rank" placeholder="t20 rank"
				style="background-color: lightyellow; color: blue; font-size: 18pt"><br /> 
				
		<input type="submit" value="Add" />
		</pre>
	</form>
</body>
</html>