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
        body {
            padding: 0;
            margin: 0;
            height: 100vh;
            /* background-color: #62daea; */
        }

        .container {
            width: 50%;
            height: 50%;
            border: 1px solid black;
        }

        .form-group {
            margin-left: 37%;
            width: 30%;
            height: 20%;
        }

        .btn {
            overflow-y: hidden;
            text-align: center;
            margin-left: 40%;
            width: 10%;
            margin-bottom: 1.5%;
        }

        a{
            margin-top: 2%;
            margin-left: 10%;
        }

        h2{
            font-family: 'Montserrat', sans-serif;
            color: #fff;
            background-color: #62daea;
            text-align: center;
            padding: 2%;
        }
    </style>
</head>

<body>

    <div class="container-fluid">
        <!-- <div id="login-row" class="row justify-content-center align-items-center">
            <div id="login-column" class="col-md-6"> -->
                <h2>Update Employee</h2>
	
                <form action="EmployeeControllerServelet" method="GET">
                
                    <input type="hidden" name="empId" value="${THE_EMPLOYEE.id}"/>
                    
                    <input type="hidden" name="command" value="UPDATE"/>

                    <div class="form-group">
                        <label for="Employee Id" class="text-info">Employee Id:</label><br>
                        <input type="text" name="empid" id="empid" value="${THE_EMPLOYEE.empid}" class="form-control">
                    </div>

                    <div class="form-group">
                        <label for="employeeName" class="text-info">Employee Name:</label><br>
                        <input type="text" name="employeeName" id="employeeName" value="${THE_EMPLOYEE.employeeName}" class="form-control">
                    </div>
        
                    <div class="form-group">
                        <label for="gender" class="text-info">Gender:</label><br>
                        <input type="text" name="gender" id="gender" value="${THE_EMPLOYEE.gender}" class="form-control">
                    </div>
        
                    <div class="form-group">
                        <label for="gender" class="text-info">PhoneNumber:</label><br>
                        <input type="text" name="phoneNumber" id="phoneNumber" value="${THE_EMPLOYEE.phoneNumber}" class="form-control">
                    </div>
        
                    <div class="form-group">
                        <label for="email" class="text-info">Email:</label><br>
                        <input type="text" name="email" id="email" value="${THE_EMPLOYEE.email}" class="form-control">
                    </div>
        
                    <div class="form-group">
                        <label for="salary" class="text-info">Salary:</label><br>
                        <input type="text" name="salary" id="salary" value="${THE_EMPLOYEE.salary}" class="form-control">
                    </div>
        
                    <div class="form-group">
                        <label for="salary" class="text-info">Designation:</label><br>
                        <input type="text" name="designation" id="designation" value="${THE_EMPLOYEE.designation}" class="form-control">
                    </div>
        
                    <div class="form-group">
                        <label for="city" class="text-info">City:</label><br>
                        <input type="text" name="city" id="city" value="${THE_EMPLOYEE.city}" class="form-control">
                    </div>
        
                    <input type="submit" name="submit" class="btn btn-info btn-md" value="save">
        
                    <a href="EmployeeControllerServelet">Back to List</a>
        
                
                </form>
                
                <!-- <a href="ProjectControllerServlet">Back to List</a> -->
                
    </div>
    <!-- </div>
    </div> -->
</body>
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

</html>