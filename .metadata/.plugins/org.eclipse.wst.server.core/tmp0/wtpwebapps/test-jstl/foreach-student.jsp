<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <%@ page import = "jstl.Student , java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%
			List<Student> vada = new ArrayList<>();
	
	vada.add(new Student("Amruta","public",false));
	vada.add(new Student("Marry", "me" , true));
	vada.add(new Student("Lady", "Haha",true));
		
	pageContext.setAttribute("myStudents" , vada);
	%>
<body>
			<table border="1">
			
			<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gold Customer</th>
			</tr>
			
			<c:forEach var="tempStudent" items="${myStudents}">
			
			<tr>
			<td>${tempStudent.firstName}</td>
			<td>${tempStudent.lastName}</td>
			<td>${tempStudent.goldCustomer}</td>
			</tr>
			
			</c:forEach>
			
			</table>
</body>
</html>