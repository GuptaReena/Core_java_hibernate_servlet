<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 

<c:set var="theLocale" value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}" scope="session"/>

<fmt:setLocale value="${theLocale}"/>

<fmt:setBundle basename="i18n.resources.mylabels"/>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
    <title>Hello, world!</title>
  </head>
  <body>
    

    <section class="form  my-4 mx-5">
        <div class="container">
            <div class="row no-gutters">
                <div class="col-lg-5 col1">
                    <h1 class="heading"><fmt:message key="label.welcome"></fmt:message></h1>
                    <p class="parg1"><fmt:message key="label.parg1"></fmt:message>Lorem ipsum dolor sit amet consectetur, adipisicing elit.\
                         Rem natus facere sapiente quo, eveniet adipisci nesciunt quae officia, 
                         impedit dolor reiciendis ipsum vitae. Tempora odio consequatur libero. 
                         Facilis, culpa iure!</p>
                </div>

                <div class="col-lg-7 col">
                    <h1 class="login"><fmt:message key="label.login"></fmt:message></h1>
                    <h4 class="sign1"><fmt:message key="label.signin"></fmt:message></h4>

                    <div class="dropdown">
                    
                        <button class="btn btn-info dropdown-toggle" type="button" id="dropdownM" 
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                          <fmt:message key="label.btn"></fmt:message>
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownM">
                          <a class="dropdown-item" href="login.jsp?theLocale=en_US">English (US)</a>
                          <a class="dropdown-item" href="login.jsp?theLocale=de_DE">German (DE)</a>
                          <a class="dropdown-item" href="login.jsp?theLocale=es_ES">Spanish (ES)</a>
                        </div>
                    </div>

                    <form action= "StudentControllerServlet" method="GET" >
                    <input type="hidden" name="command" value="LOGIN">
                        <div class="form-row">
                            <div class="col-lg-7 col">
                                <input type="email" name="email"  placeholder="<fmt:message key="label.email"></fmt:message>" class="form-control">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="col-lg-7 col">
                                <input type="password" name="password" placeholder="<fmt:message key="label.pass"></fmt:message>" class="form-control">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="col-lg-7 col">
                                <input type = "submit" value = "<fmt:message key="label.signin"/>"  class="btn1">
                            </div>
                        </div>

                        <a href="#" class="link"> <fmt:message key="label.link"></fmt:message> </a>
                        <p class="p1"> <fmt:message key="label.msg"></fmt:message> <a href="#"> <fmt:message key="label.r1"></fmt:message>  </a></p>
                    </form>
                </div>
            </div>
        </div>

    </section>


    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
   
  </body>
</html>