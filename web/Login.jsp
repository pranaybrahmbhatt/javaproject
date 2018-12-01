<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        
    </head>
    <body style="background-color: white">
          <jsp:include page="Header.jsp"/>
            
        <table>
            <tr>
                <td><a href="Doctorlogin.jsp"> <img src="Images\physician-icon-png-10.png"height="40%" width="40%"></a><br>
                    <a href="Doctorlogin.jsp"> Doctor Login:</a></td>
                <td><a href="Adminlogin.jsp"> <img src="Images\circle-flat-general-51851bd79-512.png" height="20%" width="20%"></a><br>
                    <a href="Adminlogin.jsp">Admin Login:  </a></td>  
                <td><a href="Stafflogin.jsp"> <img src="Images\Staff.png" height="20%" width="20%"></a><br>
                    <a href="Stafflogin.jsp">Staff Login:</a></td>
            </tr>
        </table>

          <jsp:include page="Footer.jsp"/>
        </body> 
</html>
