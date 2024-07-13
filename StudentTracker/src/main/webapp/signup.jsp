<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 

<c:set var="theLocale" value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}" scope="session"/>

<fmt:setLocale value="${theLocale}"/>

<fmt:setBundle basename="i18n.resources.mylabels"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=\, initial-scale=1.0">
    <title>SignUp</title>
    
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

	<!-- Css link -->
    <link rel="stylesheet" href="css/style.css">

</head>
<body>
    
    
        <form action="StudentControllerServlet" method="GET">
        <input type="hidden" name="command" value="SIGNUP">
            <div class="container1">
                <h1 class="sign-h1"><fmt:message key="label.signup"></fmt:message></h1>
                <P  class="sign-p"><fmt:message key="label.pp"></fmt:message></P>
                <hr>
                
                <div class="dropdown">
                    
                        <button class="btn btn-info dropdown-toggle" type="button" id="dropdownM" 
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                          <fmt:message key="label.btn"></fmt:message>
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownM">
                          <a class="dropdown-item" href="signup.jsp?theLocale=en_US">English (US)</a>
                          <a class="dropdown-item" href="signup.jsp?theLocale=de_DE">German (DE)</a>
                          <a class="dropdown-item" href="signup.jsp?theLocale=es_ES">Spanish (ES)</a>
                        </div>
                    </div>
                
				<label for= "firstName"> <fmt:message key="label.f1"></fmt:message> </label>
				<input type="text" class="text" placeholder="Enter First Name" name="firstName" required>
				
				<label for= "lastName"><fmt:message key="label.f2"></fmt:message></label>
				<input type="text" class="text" placeholder="Enter last Name" name="lastName" required>
				
                <label for="email"> <fmt:message key="label.e1"></fmt:message></label>
                <input type="email" class="text" placeholder="Enter Email" name="email" required>

                <label for="psw"> <fmt:message key="label.pw1"></fmt:message></label>
                <input type="password" class="text" placeholder="Enter Password" name="password" required>


                <label>
                    <input type="checkbox" checked="checked" name="remember"> <fmt:message key="label.rm"></fmt:message>
                </label>

                <div class="clearfix">
                    <input type = "submit" value = "<fmt:message key="label.signup"/>" class="cancelbtn btn2">
                    <input type = "submit" value = "<fmt:message key="label.cancel"/>" class="signupbtn btn2">
                </div>

            </div>
        </form>
    
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


</body>
</html>