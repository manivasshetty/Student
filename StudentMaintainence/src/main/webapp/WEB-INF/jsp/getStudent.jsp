<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="/getStudent">
<lable>Enter student id:</lable>
<input type="number" id="id" name="id" required>
<input type="submit" value="search">


</form>
${errmsg }
</body>
</html>