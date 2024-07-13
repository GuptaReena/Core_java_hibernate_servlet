<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:set var="theLocale" value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}" scope="session"/>

<fmt:setLocale value="${theLocale}"/>

<fmt:setBundle basename="i18n.resource.mylabels"/>

<!DOCTYPE html>
<html>
<head>
<link href='https://fonts.googleapis.com/css?family=Open+Sans:700,600' rel='stylesheet' type='text/css'>

<link href='css/login_style.css' rel='stylesheet' type='text/css'>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="StudentControllerServlet">
<input type="hidden" name="command" value="SIGNUP">

<div class="box">
<small><a href="signup1.jsp?theLocale=en_US">English (US)</a>
|
<a href="signup1.jsp?theLocale=es_ES">Spanish (ES)</a>
|
<a href="signup1.jsp?theLocale=de_DE">German (DE)</a>
|
<a href="signup1.jsp?theLocale=ma_MA">Marathi (MA)</a>
</small><br>

<hr>

<h1><fmt:message key="label.welcome"></fmt:message></h1>
<input type="text" name="firstName"  placeholder="<fmt:message key="label.firstname"/>" class="email" /><br>

<input type="text" name="lastName" placeholder="<fmt:message key="label.lastname"/>" class="email" />


<input type="email"   placeholder="<fmt:message key="label.email"/>" class="email" /><br>

<input type="password"  placeholder="<fmt:message key="label.password"/>" class="email" />
  
<input type = "submit" value = "<fmt:message key="label.signup"/>" class = "btn"> <!-- End Btn -->

<h6>Selected Locale : ${theLocale}</h6>

</div> <!-- End Box -->
  
</form>


</body>
</html>