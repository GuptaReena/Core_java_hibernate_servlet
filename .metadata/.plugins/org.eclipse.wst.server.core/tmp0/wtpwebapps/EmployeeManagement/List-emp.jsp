<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<!-- Bootstrap cdn -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    
    <!-- fontawesome -->
    <link rel="stylesheet" href="css/all.css">
    <style>
    	
        thead{
         background-color: #18a1b4;
         color: #fff;   
        }

        .btn-info{
            margin-left: 3%;
            margin-bottom: 1% ;
            margin-top: 1%;
        }

        h2{
            font-family: 'Montserrat', sans-serif;
            color: #fff;
            background-color: #62daea;
            text-align: center;
            padding: 2%;
        }

        .row{
            padding-right: 5%;
            margin-left: 40%;
            margin-right: 3%;
        }
        
        input {
			background-color: #18a1b4;
			border: none;
			color: #fff;
		}

    </style>

</head>
<body>
	<div id="wrapper">
		<div id="header"></div>
			<h2>Rythy Company</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
            <div class="row">
				<span class="btn btn-info">
					<i class="fas fa-user-plus"></i>
					<input type="button" value="Add emp" onclick="window.location.href='add-emp-form.jsp'; return false"
						class="add-emp-button" /></span>
				<span class="btn btn-info">
					<i class="fas fa-hand-point-left"></i>
					<input type="button" value="Back" onclick="window.location.href='admin.jsp'; return false"
						class="emphome" /></span>
				<span class="btn btn-info">
					<i class="fas fa-print"></i>
					<input type="button" value="Print" onclick="window.print()" class="print" /></span>
			</div>
			<table class="table table-hover">
			<thead class="thead">
				<tr>
					
					<th>Employee Id</th>
					<th>EmployeeName</th>
					<th>Gender</th>
					<th>Email</th>
					<th>Phone Number</th>
					<th>Salary</th>
					<th>Designation</th>
					<th>City</th>
					<th>Action</th>	
				</tr>
			</thead>	
				
				<c:forEach var="tempEmployee" items="${EMPLOYEE_LIST}">
				
				<c:url var="templink" value="EmployeeControllerServelet">
				<c:param name="command" value="LOAD"></c:param>
				<c:param name="empId" value="${tempEmployee.id}"></c:param>
				</c:url>
				
				<c:url var="deletelink" value="EmployeeControllerServelet">
				<c:param name="command" value="DELETE"></c:param>
				<c:param name="empId" value="${tempEmployee.id}"></c:param>
				</c:url>
				
				<c:url var="printlink" value="EmployeeControllerServelet">
				<c:param name="command" value="LPRINT"></c:param>
				<c:param name="empId" value="${tempEmployee.id}"></c:param>
				</c:url>
				
				<tr>
					
					<td>${tempEmployee.empid}</td>
					<td>${tempEmployee.employeeName}</td>
					<td>${tempEmployee.gender}</td>
					<td>${tempEmployee.email}</td>
					<td>${tempEmployee.phoneNumber}</td>
					<td>${tempEmployee.salary}</td>
					<td>${tempEmployee.designation}</td>
					<td>${tempEmployee.city}</td>
						
					<td><a href="${templink}" class="btn btn-info"><i class="fas fa-edit"></i> Update</a>
					
						
						<a href="${deletelink}" class="btn btn-info"
						onclick="if(!(confirm('Are you sure you want to delete this employee?')))return false">
						<i class="fas fa-trash-alt"></i> Delete</a>
						
						<a href="${printlink}" class="btn btn-info" onclick="print-emp-form"><i class="fas fa-print"></i> Print</a>
						
						</td>
				</tr>
				
				</c:forEach>
			</table>
			
			
		</div>
	</div>
	<!-- Script js -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> 
</body>
</html>