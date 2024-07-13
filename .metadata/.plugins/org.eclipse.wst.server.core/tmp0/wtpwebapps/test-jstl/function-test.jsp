<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     
     <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<c:set var="data" value="Hii Reena welcome to Rst forum" />
		
		Length of the string <b>${data}</b>: ${fn:length(data)}
		
		<br><br>
		
		UpperCase version of the string <b>${data}</b>: ${fn:toUpperCase(data)}
		
		<br><br>
		
		Does the string <b>${data}</b> Start with <b>Hii</b>: ${fn:startsWith(data,"Hii")}
		
</body>
</html>