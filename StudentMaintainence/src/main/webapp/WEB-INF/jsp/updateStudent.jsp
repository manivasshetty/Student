<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/updateStudent">
<lable>Enter student id:</lable>
<input type="number" id="id" name="id" required>

<lable>Enter student name:</lable>
<input type="text" id="name" required name="name" >

<lable>Enter student age:</lable>
<input type="number" id="age" name="age" required min="5" max="16">
<lable>Enter student standard:</lable>
<input type="number" id="std" name="std" required  placeholder="enter std">
<input type="submit" value="update">
</form>
</body>
</html>