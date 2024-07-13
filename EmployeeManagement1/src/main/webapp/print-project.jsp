<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
       
        <!-- fontawesome -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">

	<style>
	
	h2{
            font-family: 'Montserrat', sans-serif;
            color: #fff;
            background-color: #62daea;
            text-align: center;
            padding: 2%;
        }
        
        a{
        margin-left:5%;
        }
	
	</style>


</head>
<body>
	<h2>Print Project List</h2>
	
	<div class="container">
	
	<form action="ProjectControllerServlet" method="POST">
	
	<input type="hidden" name="command" value="LIST"/>
	
		<input type="hidden" name="Id" value="${THE_PROJECT.id}"/>
		
		<div class="form-group">
                <label for="projectName" class="text-info">Project Name	 : ${THE_PROJECT.projectName}</label><br>
            </div>
            
          <div class="form-group">
                <label for="clientName" class="text-info">Client Name	 : ${THE_PROJECT.clientName}</label><br>
            </div>  
		
			<div class="form-group">
                <label for="clientEmail" class="text-info">Client Email  : ${THE_PROJECT.clientEmail}</label><br>
            </div>
            
            <div class="form-group">
                <label for="budget" class="text-info">Budget    : ${THE_PROJECT.budget}</label><br>
            </div>
		
			<div class="form-group">
                <label for="shortProjectInfo" class="text-info">ShortProjectInfo   : ${THE_PROJECT.shortProjectInfo}</label><br>
            </div>
            
            <div class="form-group">
                <label for="clientPhoneNo" class="text-info">ClientPhoneNo   : ${THE_PROJECT.clientPhoneNo}</label><br>
            </div>
            
            <div class="form-group">
                <label for="status" class="text-info">Status: ${THE_PROJECT.status}</label><br>
            </div>
		
			<input type="submit" value="PRINT" class="btn btn-info" onclick="window.print()"/>
		
			<a href="ProjectControllerServlet">Back to List</a>
	</form>
</div>
	
	
	<!-- Script js -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
    integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
    crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
    integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
    crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
    integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
    crossorigin="anonymous"></script>
	
</body>
</html>