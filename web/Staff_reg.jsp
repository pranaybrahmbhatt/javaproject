<%-- 
    Document   : Staff_reg
    Created on : Nov 29, 2018, 3:39:13 PM
    Author     : Lavi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="E:\Study material\Html\library file\jquery-1.8.3.js"></script>
        <script type="text/javascript">
function Validate() {
       
        var password;
        password= document.getElementById("Password1").value;
       
        var confirm_password;
        confirm_password = document.getElementById("Confirm_Password1").value;
        if(password!=confirm_password)
        {
            alert("Pasword Mismatch");
            document.getElementById('submit').disabled = true;
            return false;
        }
        else
        {
             document.getElementById('submit').disabled = false;
            return true;
        }

    }
</script>
    </head>
    <body>
        <jsp:include page="Header.jsp" />
        <h3>Staff Registration</h3>
         <form method="post" action="Staff_reg">
            <table border="0">
                
                <tbody>
                    <tr>
                        <td>Enter Name</td>
                        <td><input type="text" name="Name" size="20"></td>
                    </tr>
                    
                    <tr>
                        <td>Enter Address</td>
                        <td><input type="text" name="Address" size="20"></td>
                    </tr>
                    <tr>
                        <td>Enter Contact</td>
                        <td><input type="tel" name="Contact" size="20"/></td>
                    </tr>
                    
                    <tr>
                        <td>Role</td>
                        <td><input type="text" name="Role" size="20"></td>
                    </tr>
                    <tr>
                        <td>Age</td>
                        <td><input type="number"  name="Age" size="20"></td>
                    </tr>
                    <tr>
                        <td>Gender</td>
                        <td><input type="text" name="Gender" size="20"/></td>
                    </tr>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="User_Name" size="20"/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" id="Password1" name="Password" size="20"/></td>
                    </tr>                    
                    <tr>
                        <td>Confirm Password</td>
                        <td><input type="password" id="Confirm_Password1" name="Confirm_Password" size="20" onblur="Validate()"/></td>
                        <td><span id='message'></span></td>
                    </tr>
                </tbody>
            </table>
                
            <input type="reset" value="Reset" name="reset" />
            <input type="submit" value="Submit" name="submit" id="submit" disabled/>
        </form>
         <jsp:include page="Footer.jsp" />
    </body>
</html>

