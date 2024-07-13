
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
	<h2>Print Employee List</h2>
	
	<div class="container">
	
	<form action="EmployeeControllerServelet" method="GET">
	
	<input type="hidden" name="command" value="LIST"/>
	
		<input type="hidden" name="Id" value="${THE_EMPLOYEE.id}"/>
		
		<div class="form-group">
                <label for="empid" class="text-info">Employee Id	 : ${THE_EMPLOYEE.empid}</label><br>
            </div>
            
          <div class="form-group">
                <label for="employeeName" class="text-info">Employee Name	 : ${THE_EMPLOYEE.employeeName}</label><br>
            </div>  
		
			<div class="form-group">
                <label for="gender" class="text-info">Gender  : ${THE_EMPLOYEE.gender}</label><br>
            </div>
            
            <div class="form-group">
                <label for="email" class="text-info">Email    : ${THE_EMPLOYEE.email}</label><br>
            </div>
		
			<div class="form-group">
                <label for="phoneNumber" class="text-info">PhoneNumber   : ${THE_EMPLOYEE.phoneNumber}</label><br>
            </div>
            
            <div class="form-group">
                <label for="salary" class="text-info">Salary   : ${THE_EMPLOYEE.salary}</label><br>
            </div>
            
            <div class="form-group">
                <label for="designation" class="text-info">Status: ${THE_EMPLOYEE.designation}</label><br>
            </div>
            
            <div class="form-group">
                <label for="city" class="text-info">City: ${THE_EMPLOYEE.city}</label><br>
            </div>
		
			<input type="submit" value="PRINT" class="btn btn-info" onclick="window.print()"/>
		
			<a href="EmployeeControllerServelet">Back to List</a>
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