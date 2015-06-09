
<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="rt" tagdir="/WEB-INF/tags" %>


<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Truck on Rent</title>
    <meta name="description" content=""/>
    <meta name="keywords" content=""/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Yesteryear">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <!--<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">-->

    <script src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false&libraries=places"></script>
    <script type="text/javascript">
        function initialize() {
            var address = (document.getElementById('from-location'));
            var autocomplete = new google.maps.places.Autocomplete(address);
            autocomplete.setTypes(['geocode']);
            google.maps.event.addListener(autocomplete, 'place_changed', function() {
                var place = autocomplete.getPlace();
                if (!place.geometry) {
                    return;
                }

                var address = '';
                if (place.address_components) {
                    address = [
                        (place.address_components[0] && place.address_components[0].short_name || ''),
                        (place.address_components[1] && place.address_components[1].short_name || ''),
                        (place.address_components[2] && place.address_components[2].short_name || '')
                    ].join(' ');
                }
            });
        }
        google.maps.event.addDomListener(window, 'load', initialize);
    </script>
</head>
<body>
<header class="nav-head nav-home">
        <div class="container">
            <div class="row">
                <div class="logo-wrap left-nav-align">
                    <a href="#" class="truckon-rent-logo">TruckOn Rent<!--<img src="img/logo-white.png" alt="Move On Logo">--></a>
                </div>
                <div class="right-nav-align">
                    <nav class="site-navigation">
                        <ul>
                            <li><a>ABOUT</a></li>
                            <li><a>BOOK</a></li>
                            <li><a>LOGIN</a></li>
                            <li><a>REGISTER</a></li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
</header>
<section class="head">
        <div class="texture-overlay"></div>
        <div class="container">

            <div class="row">
                <div class="col-md-7">
                    <h1 class="animated fadeInDown">Truck on rent, makes your shifting easier &amp; better.</h1>
                    <a href="#about" class="learn-btn animated fadeInUp">Learn more <i class="fa fa-arrow-down"></i></a>
                </div>
                <div class="col-md-5 book-container animated fadeInDown">
                    <input id="from-location" type="text" value="" class="input-control" placeholder="Pick up location"/>
                    <input id="to-location" type="text" value="" class="input-control" placeholder="Drop location"/>
                    <a href="#" class="use-btn ">Book it now</a>
                </div>
            </div>
        </div>
</section>
<section class="features-list" id="features">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="col-md-4 feature-1 wp2">
                    <div class="feature-icon">
                        <i class="fa fa-desktop"></i>
                    </div>
                    <div class="feature-content">
                        <h1>Fast</h1>

                        <p>Instant and easy section of .</p>
                        <a href="#" class="read-more-btn">Read More <i class="fa fa-chevron-circle-right"></i></a>
                    </div>
                </div>
                <div class="col-md-4 feature-2 wp2 delay-05s">
                    <div class="feature-icon">
                        <i class="fa fa-flash"></i>
                    </div>
                    <div class="feature-content">
                        <h1>Safe &amp; Secure</h1>

                        <p>Trusted and verified drivers and real-time tracking.</p>
                        <a href="#" class="read-more-btn">Read More <i class="fa fa-chevron-circle-right"></i></a>
                    </div>
                </div>
                <div class="col-md-4 feature-3 wp2 delay-1s">
                    <div class="feature-icon">
                        <i class="fa fa-heart"></i>
                    </div>
                    <div class="feature-content">
                        <h1>Hassle Free</h1>

                        <p>Moving goods is as easy as ordering a cab! Fixed prices. Pay for the time you use. </p>
                        <a href="#" class="read-more-btn">Read More <i class="fa fa-chevron-circle-right"></i></a>
                    </div>
                </div>

            </div>
        </div>
    </div>
</section>
<section class="showcase">
    <div class="showcase-wrap">
        <div class="texture-overlay"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-9">
                    <h1>REACH YOUR DESTINATION 100% SURE AND SAFE</h1>
                    <h4>We will take care of your cargo or your passenger and deliver them safe and on time</h4>
                    <a href="#" class="use-btn ">Book it now</a>
                </div>
            </div>
        </div>
    </div>
</section>
<section class="screenshots-intro">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1>Packed Full of Powerful Features</h1>

                <p>We will take care of your cargo or your passenger and deliver them safe and on time,
                    we will take care of your cargo or your passenger and deliver them safe and on time</p>
                </p>
            </div>
        </div>
    </div>
</section>

<footer class="footer">
  <rt:footer/>
</footer>
</body>
</html>