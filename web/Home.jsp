<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
         <meta name="viewport" content="width=device-width, initial-scale=1">
         <meta charset="utf-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <jsp:include page="Header.jsp" />
         
<div class="container">
  <h2>A quick glance at Bombay Hospital</h2>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img src="Images\S1.jpg" alt="Hospital Entrance" style="width:100%; height:500px;">
        <div class="carousel-caption">
          <h3>Hospital Entrance</h3>
          <p>Only one of its kind in the private sector</p>
        </div>
      </div>

      <div class="item">
        <img src="Images\S2.jpg" alt="Hospital" style="width:100%; height:500px;">
        <div class="carousel-caption">
          <h3>General Ward</h3>
          <p>Critical care and recovery area</p>
        </div>
      </div>
    
      <div class="item">
        <img src="Images\S3.jpg" alt="Hospital" style="width:100%; height:500px;">
        <div class="carousel-caption">
          <h3>Operation Theatre</h3>
          <p>10 dedicated operation theatres</p>
        </div>
      </div>
        
        <div class="item">
        <img src="Images\S4.jpg" alt="Hospital" style="width:100%; height:500px;">
        <div class="carousel-caption">
          <h3>CT scan</h3>
          <p>Detect and monitor diseases and conditions such as cancer, heart disease, lung nodules and liver masses</p>
        </div>
      </div>
  
        <div class="item">
        <img src="Images\S5.jpg" alt="Hospital" style="width:100%; height:500px;">
        <div class="carousel-caption">
          <h3>Coronary Artery Bypass Grafting Complex</h3>
          <p>200 skilled resident doctors</p>
        </div>
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
        <br>
        <jsp:include page="Footer.jsp" />
    </body>
</html>
