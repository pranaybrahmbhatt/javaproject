<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Us</title>
    </head>
    <style>
        #about
        {
            display: inline;
            height:200px;
            width: 200px;
        }
    </style>
    <body>
   <jsp:include page="Header.jsp" />
        <div id="about">
            <img src="Images\i-hospital.gif" height="200px" width="300px">
            <img src="Images\s6.jpeg" height="200px" width="300px">
        </div>
        <div>
            <h4>A quick glance at Bombay Hospital and Medical Research Centre.</h4>
            <ul>
                <li>Specialized team of doctors.</li>
                <li>4 buildings with 5,00,000 sq. ft.built up area</li>
                <li>Total number of beds: 725</li>  
                <li>Critical care and recovery area: 141 beds</li>
                <li>24 operation theatres</li>
                <li>2500 full-time employees</li>
            </ul>
        </div>
        <div>
            <h4>Department of Orthopaedics</h4>
            <ul>
                <li>Complete hip/knee/shoulder/elbow replacements done</li>
                <li>5 dedicated operation theatres</li>
                <li>Spinal corrective surgeries performed</li>
                <li>Trauma care centre</li>
                <li>Equipped with Ortho navigation system and C-Arm</li>
            </ul>
        </div>
   <jsp:include page="Footer.jsp" />
    </body>
</html>
