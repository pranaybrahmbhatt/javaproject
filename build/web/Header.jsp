<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="Style.css">
        <title></title>
    </head>
    <script>
        window.onscroll = function() {myFunction()};

        var navbar = document.getElementById("navbar");
        var sticky = navbar.offsetTop;

        function myFunction() {
        if (window.pageYOffset >= sticky) {
        navbar.classList.add("sticky")
        } else {
        navbar.classList.remove("sticky");
  }
}
</script>
    <body>
        <div id="header">
            <center> <img src="Images\logo.jpg"></center>
        </div>
           <div id="navbar">
               <a href="Home.jsp">Home</a>
               <a href="Patient_Reg.jsp">Patient Registration</a> 
               <a href="Login.jsp">Login</a>
               <a href="FAQ.jsp">FAQ's</a>
               <a href="AboutUS.jsp">About Us</a>
               <a href="ContactUs.jsp">Contact Us</a>
            </div>
        </body>
</html>
