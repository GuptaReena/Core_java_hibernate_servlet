<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <!-- fonaswome -->
    <link rel="stylesheet" href="css/all.css">

    <!-- Bootstrap cdn -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <!-- google fonts -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">
    <style>
        .container {
            margin: 0;
            padding: 0;
            background-color:#fff;
            overflow: hidden;
        }

        .text{
       	padding-right:30%;
        background-color:#fff;
            color:#18a1b4;
        }

        .container-fluid {
            padding-top: 5%;
            padding-left: 10%;
            /* overflow-y: hidden; */
        }

        h1 {
            font-family: 'Montserrat', sans-serif;
            color: #fff;
            background-color: #62daea;
            text-align: center;
            padding: 2%;
             padding-left: 36%;
        }

        h2 {
            padding: 2% 0 0 3%;
        }

        h5,
        h6 {
            text-align: center;
        }
        
        .btnl{
            margin-left: 50%;
        }

        .btn {
            /* background-color: #81b214; */
            border-radius: 15px;
            border: none;
            opacity: 1;
            transform: scale(1.15);
            transition: transform 0.5s, opacity 0.5s;
            color: #fff;
        }

        .btn:hover {
            box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);
            transition: 0.5s ease;
            transform: scale(1.03);
            opacity: 1.5;
            color: #fff;
        }

        .btn4 {
            background-color: #81b214;
            color: #fff;
        }

        .btn3 {
            background-color: #18a1b4;
            color: #fff;
        }

        .btn2 {
            background-color: red;
            color: #fff;
        }

        .btn1 {
            background-color: #f7ea00;
            color: #fff;
        }


        .update {
            background-color: #f7ea00;
            border: none;
        }

        .delete {
            background-color: red;
            border: none;
        }

        .add {
            background-color: #81b214;
            border: none;
        }

        .list {
            background-color: #18a1b4;
            border: none;
        }

        .row {
            padding-bottom: 10%;
        }
    </style>

</head>

<body>

    <h1>Welcome to Rythy
    	<a href="emphome.jsp" type="button" class="btn btn-info btnl">Logout</a>
    </h1>

    <div class="container-fluid">
        <div class="row">
            <div class="container">
            <center>
                <h1 class="text">
                    Employee Details
                </h1>
                </center>
            </div>
            <div class="col-lg-3">
                <a href="EmployeeControllerServelet" class="btn btn3">
                    <div class="card list">
                        <div class="card-body">
                            <h5 class="card-title">EMPLOYEE LIST</h5>
                            <h6 class="sub-title"><i class="fas fa-user-tie fa-3x"></i></h6>
                            <p>You can View Employee</p>
                        </div>
                    </div>
                </a>
            </div>

            <div class="col-lg-3">
                <a href="add-emp-form.jsp" class="btn btn4">
                    <div class="card add">
                        <div class="card-body">
                            <h5 class="card-title">ADD EMPLOYEE</h5>
                            <h6 class="sub-title"><i class="fas fa-user-plus fa-3x"></i></h6>
                            <p>You can Add Employee</p>
                        </div>
                    </div>
                </a>
            </div>

            <div class="col-lg-3">
                <a href="EmployeeControllerServelet" class="btn btn1">
                    <div class="card update">
                        <div class="card-body">
                            <h5 class="card-title">UPDATE EMPLOYEE</h5>
                            <h6 class="sub-title"><i class="fas fa-user-edit fa-3x"></i></h6>
                            <p>You can Update Employee</p>
                        </div>
                    </div>
                </a>
            </div>

            <div class="col-lg-3">
                <a href="EmployeeControllerServelet" class="btn btn2">
                    <div class="card delete">
                        <div class="card-body">
                            <h5 class="card-title">DELETE EMPLOYEE</h5>
                            <h6 class="sub-title"><i class="fas fa-user-minus fa-3x"></i></h6>
                            <p>You can Delete Employee</p>
                        </div>
                    </div>
                </a>
            </div>
        </div>

        <div class="row">
            <div class="container">
                <h1 class="text">
                    Project Details
                </h1>
            </div>
            <div class="col-lg-3">
                <a href="ProjectControllerServlet" class="btn btn3">
                    <div class="card list">
                        <div class="card-body">
                            <h5 class="card-title">ROJECT LIST</h5>
                            <h6 class="sub-title"><i class="fas fa-user-tie fa-3x"></i></h6>
                            <p>You can View Project</p>
                        </div>
                    </div>
                </a>
            </div>

            <div class="col-lg-3">
                <a href="add-project.jsp" class="btn btn4">
                    <div class="card add">
                        <div class="card-body">
                            <h5 class="card-title">ADD PROJECT</h5>
                            <h6 class="sub-title"><i class="fas fa-user-plus fa-3x"></i></h6>
                            <p>You can Add Project</p>
                        </div>
                    </div>
                </a>
            </div>

            <div class="col-lg-3">
                <a href="ProjectControllerServlet" class="btn btn1">
                    <div class="card update">
                        <div class="card-body">
                            <h5 class="card-title">UPDATE PROJECT</h5>
                            <h6 class="sub-title"><i class="fas fa-user-edit fa-3x"></i></h6>
                            <p>You can Update Project</p>
                        </div>
                    </div>
                </a>
            </div>

            <div class="col-lg-3">
                <a href="ProjectControllerServlet" class="btn btn2">
                    <div class="card delete">
                        <div class="card-body">
                            <h5 class="card-title">DELETE PROJECT</h5>
                            <h6 class="sub-title"><i class="fas fa-user-minus fa-3x"></i></h6>
                            <p>You can Delete Project</p>
                        </div>
                    </div>
                </a>
            </div>
        </div>
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