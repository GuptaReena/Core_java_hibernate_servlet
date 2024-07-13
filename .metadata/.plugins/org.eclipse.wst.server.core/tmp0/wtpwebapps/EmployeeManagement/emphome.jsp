<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Management</title>

    <!-- Bootstrap cdn -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <!-- google font link -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Bitter:wght@800&family=Krona+One&display=swap"
        rel="stylesheet">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">


    <!-- grid css -->
    <link rel="stylesheet" href="grid/grid.css">

    <!-- fontawesome -->
    <link rel="stylesheet" href="css/all.css">

    <!-- css link -->
    <link rel="stylesheet" href="css/style.css">



</head>

<body>

    <!-- header -->

    <section id="title" class="title">
        <div class="container-fluid">
            <nav class="navbar navbar-expand-lg fixed-top">
                <a class="navbar-brand" href="#">Rythy</a>
                <button class="navbar-toggler custom-toggler" type="btn" data-toggle="collapse" data-target="#collapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="collapse">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a href="#about" class="nav-link">ABOUT</a>
                        </li>
                        <li class="nav-item">
                            <a href="#services" class="nav-link">OUR COMPANY</a>
                        </li>
                        <li class="nav-item">
                            <a href="#contact" class="nav-link">CONTACT</a>
                        </li>
                    </ul>
                    <a href="login.jsp"> <button type="button" class="btn btn-outline-light btn1 btn-lg">AdminLogin</button></a>
                </div>
            </nav>

            <!-- header content -->
            <div class="row">
                <div class="col-lg-6">
                    <h1>Welcome to Rythy</h1>
                    <!-- <p>Employee Management System</p> -->
                </div>

                <div class="col-lg-6">
                    <img class="title-img" src="img/img2.png" alt="headerimg">
                </div>
            </div>

        </div>
    </section>


    <section id="about">
        <h2>Our Company</h2>
        <div class="line"></div>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. <br>Lorem ipsum dolor sit amet consectetur,
            adipisicing elit. Odit doloribus maiores necessitatibus molestias earum facere,
            ex quia adipisci voluptatem. Obcaecati reprehenderit molestiae tempore impedit quasi,
            distinctio neque eligendi nisi pariatur.</p>
    </section>


    <section id="services">
        <div class="container-fluid">
            <h2>What we do</h2>
            <div class="row">
                <div class="col-lg-4">
                    <div class="card">
                        <div class="card-body">
                            <i class="fab fa-java fa-3x  icon"></i>
                            <h3 class="card-title">JavaProgramming</h3>
                            <h4 class="card-subtitle">web software</h4>
                            <p class="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit.
                            </p>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4">
                    <div class="card">
                        <div class="card-body">
                            <img src="img/icons8-web-design-64.png" class="img-icon" alt="icon">
                            <h3 class="card-title">Full Stack</h3>
                            <h4 class="card-subtitle">Responsive web Designing</h4>
                            <p class="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit.
                            </p>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4">
                    <div class="card">
                        <div class="card-body">
                            <i class="fas fa-code fa-3x icon"></i>
                            <h3 class="card-title">Web Designing</h3>
                            <h4 class="card-subtitle">Frame Work</h4>
                            <p class="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit.
                            </p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-4">
                    <div class="card">
                        <div class="card-body">
                            <i class="fas fa-database fa-3x icon"></i>
                            <h3 class="card-title">Data Base</h3>
                            <h4 class="card-subtitle">Backend</h4>
                            <p class="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit.
                            </p>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4">
                    <div class="card">
                        <div class="card-body">
                            <i class="fab fa-android fa-3x icon"></i>
                            <h3 class="card-title">Android Development</h3>
                            <h4 class="card-subtitle">Mobile App</h4>
                            <p class="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit.
                            </p>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4">
                    <div class="card">
                        <div class="card-body">
                            <i class="fas fa-network-wired fa-3x icon"></i>
                            <h3 class="card-title">CCNA</h3>
                            <h4 class="card-subtitle">Networking</h4>
                            <p class="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit.
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>


    <section id="contact">
        <div class="container-fluid">
            <h2>Get in touch</h2>

            <div class="row">
                <div class="col-md-6">
                    <center>
                    <form action="">
                        <input type="text" class="form-control" placeholder="Name" required>
                        <br>
                        <input type="text" class="form-control" placeholder="Subject" required>
                        <br>
                        <input type="text" class="form-control" placeholder="Email" required>
                        <br>
                        <textarea name="message" id="message" cols="30" rows="6" placeholder="Message" required></textarea>
                        <br>
                        <br>
                        <button type="submit" class="btn btn-info " >Send Message</button>
                    </center>
                    </form>
                </div>

                <div class="col-md-1"></div>

                <div class="col-md-5 contact1">
                    <br>
                    <p class="contact-p"><i class="fa fa-map-marker contact-icon"></i> &nbsp;&nbsp; 23 main street Matunga In front of railway station</p>
                    <p class="contact-p"><i class="fa fa-phone contact-icon"></i> &nbsp;&nbsp; 012-235-24810</p>
                    <p class="contact-p"><i class="fa fa-envelope contact-icon"></i> &nbsp;&nbsp; rythy@2021.com</p>
                    <hr>
                </div>
            </div>

            <div class="row footer">
                <div class="col-md-4 media">
                    <i class="fab fa-facebook-f c-icon"></i>
                    <i class="fab fa-instagram c-icon"></i>
                    <i class="fab fa-twitter c-icon"></i>
                    <i class="fab fa-google-plus-g c-icon"></i>
                    <i class="fab fa-youtube c-icon"></i>
                </div>
                <p class="fotter">@copyright by Ryhty</p>
            </div>
        </div>
    </section>
    

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