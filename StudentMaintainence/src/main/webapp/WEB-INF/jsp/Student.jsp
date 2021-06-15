<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  

  <table border="1">
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Age</th>
    <th>Standard</th>
  </tr>
  
  
    <c:forEach items="${students}" var="student" >
  <tr>
    <td>${student.id }</td>
    <td>${student.name }</td>
    <td>${student.age }</td>
    <td>${student.std }</td>
  
  </tr>
  
  </c:forEach>
</table>

  
  
</body>
</html>