<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:set var="theLocale" value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}" scope="session"/>

<fmt:setLocale value="${theLocale}"/>

<fmt:setBundle basename="i18n.resources.mylabels"/>

<!DOCTYPE html>
<html>
<head>
<link href='https://fonts.googleapis.com/css?family=Open+Sans:700,600' rel='stylesheet' type='text/css'>

<link href='css/login.css' rel='stylesheet' type='text/css'>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="index.html">
<div class="box">
<small><a href="loginis18n.jsp?theLocale=en_US">English (US)</a>
|
<a href="loginis18n.jsp?theLocale=es_ES">Spanish (ES)</a>
|
<a href="loginis18n.jsp?theLocale=de_DE">German (DE)</a>
|
<a href="loginis18n.jsp?theLocale=ma_MA">Marathi (MA)</a>
</small><br>

<hr>

<h1><fmt:message key="label.welcome"></fmt:message></h1>

<input type="email" name="email"  placeholder="<fmt:message key="label.email"/>" class="email" /><br>

<input type="password" name="password" placeholder="<fmt:message key="label.password"/>" class="email" />
  
<a href="#"><div class="btn"><fmt:message key="label.signin"/></div></a> <!-- End Btn -->

<h6>Selected Locale : ${theLocale}</h6>

</div> <!-- End Box -->
  
</form>


</body>
</html>