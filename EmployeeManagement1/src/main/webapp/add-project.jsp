
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

    <h2>Add Project</h2>

    <div class="container-fluid">
        <!-- <div id="login-row" class="row justify-content-center align-items-center">
            <div id="login-column" class="col-md-6"> -->
        <form action="ProjectControllerServlet" method="post">
            <input type="hidden" name="command" value="ADD">
            <div class="form-group">
                <label for="projectName" class="text-info">Project Name:</label><br>
                <input type="text" name="projectName" id="projectName" class="form-control">
            </div>

            <div class="form-group">
                <label for="clientName" class="text-info">Client Name:</label><br>
                <input type="text" name="clientName" id="clientName" class="form-control">
            </div>

            <div class="form-group">
                <label for="clientEmail" class="text-info">Client Email:</label><br>
                <input type="text" name="clientEmail" id="clientEmail" class="form-control">
            </div>

            <div class="form-group">
                <label for="budget" class="text-info">Budget:</label><br>
                <input type="text" name="budget" id="budget" class="form-control">
            </div>

            <div class="form-group">
                <label for="shortProjectInfo" class="text-info">ShortProjectInfo:</label><br>
                <input type="text" name="shortProjectInfo" id="shortProjectInfo" class="form-control">
            </div>

            <div class="form-group">
                <label for="clientPhoneNo" class="text-info">Client PhoneNo:</label><br>
                <input type="text" name="clientPhoneNo" id="salary" class="form-control">
            </div>

            <div class="form-group">
                <label for="status" class="text-info">Status:</label><br>
                <input type="text" name="status" id="status" class="form-control">
            </div>

            <input type="submit" name="submit" class="btn btn-info btn-md" value="save">

            <a href="ProjectControllerServlet">Back to List</a>

        </form>

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