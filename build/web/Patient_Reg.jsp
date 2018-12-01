<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Registration</title>
        <style>
            td
            {
                font-size: 20px;
            }
        </style>
    </head>
    <body>
        
        <form method="post" action="InsertPatient">
            <jsp:include page="Header.jsp"/>
        <h3>Patient Registration</h3>
            <table border="0">
                <tbody>
                    <tr>
                        <td>Enter Name</td>
                        <td><input type="text" name="usrna" size="20"></td>
                    </tr>
                    
                    <tr>
                        <td>Enter Address</td>
                        <td><input type="text" name="addr" size="20"></td>
                    </tr>
                    <tr>
                        <td>Enter Contact</td>
                        <td><input type="text" name="con" size="20"/></td>
                    </tr>
                    <tr>
                        <td>Enter Email id</td>
                        <td><input type="email" name="em" size="20"/></td>
                    </tr>
                    <tr>
                        <td>Gender</td>
                        <td><input type="radio" name="gen" value="male" size="20"/>Male
                        <input type="radio" name="gen" value="female" size="20"/>Female</td>
                        
                    </tr>
                    <tr>
                        <td>Problem</td>
                        <td><input type="text" name="prob" size="20"></td>
                    </tr>
                    <tr>
                        <td>Age</td>
                        <td><input type="number"  name="age" size="20"></td>
                    </tr>
                </tbody>
            </table>
            <input type="reset" value="Reset" name="reset" />
            <input type="submit" value="Submit" name="submit" />
              <jsp:include page="Footer.jsp"/>
        </form>
        
      
    </body>
</html>
