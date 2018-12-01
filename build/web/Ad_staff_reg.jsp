<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Doctor</title>
    </head>
    <body>
        <jsp:include page="Header.jsp" />
       
        <form method="post" action="Ad_staff_reg">
            <table>
                <tr>
                    <td>Enter Staff ID</tr>
                    <td><input type="text" name="sid"></tr>
                </tr>
                <tr>
                    <td><input type="submit" value="View Details">
                </tr>
            </table>
             
        <jsp:include page="Footer.jsp" />
    </body>
</html>

