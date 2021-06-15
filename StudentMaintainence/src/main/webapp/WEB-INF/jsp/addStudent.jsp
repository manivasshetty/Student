<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/addStudent">
<lable>Enter student name:</lable>
<input type="text" id="name" name="name" required>

<lable>Enter student age:</lable>
<input type="number" id="age" name="age" required min="5" max="16">
<lable>Enter student standard:</lable>
<input type="number" id="std" name="std" required>
<input type="submit">
</form>
</body>
</html>