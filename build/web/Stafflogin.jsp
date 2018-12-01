<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<!DOCTYPE html>
<html>
    <head>
        <title>Staff login</title>
    </head>
   <style>
 body
{
margin:0;
padding:0;
background-size:cover;
font-family:sans-serif;


}
.aloginBox
{
position:absolute;
top:60%;
left:50%;
transform:translate(-50%,-50%);
width:350px;
height:450px;
padding:80px 40px;
box-sizing:border-box;
background:rgba(0,0,0,.5);
}

h2
{
margin:0;
padding:0 0 10px;
color:#4d88ff;
text-align:center;
}

.aloginBox input
{
width:100%;
margin-bottom:20px;
}
.aloginBox input[type="text"],
.aloginBox input[type="password"]
{
border:none;
border-bottom:1px solid #fff;
background:transparent;
outline:none;
height:40px;
color:#fff;
font-size:16px;
}
::placeholder
{
color:rgba(255,255,255,.5);
}
.aloginBox input[type="submit"]
{
border:none;
outline:none;
height:40px;
color:#fff;
font-size:16px;
background:#4d88ff;
cursor:pointer;
border-radius:20px;
}

.aloginBox input[type="submit"]:hover
{
background:aqua;
color:#262626;
}


.aloginBox a
{
color:#fff;
font-size:14px;
font-weight:bold;
text-decoration:none;


}
.aloginBox input[type="checkbox"]
{
    
margin:0;
padding:0;

}

  </style>
    <script>
function display() {
    var x = document.getElementById("pa");
    if (x.type === "password") {
        x.type = "text";
    } else {
        x.type = "password";
    }
}
</script>
  </head>
    <body>
<div class="aloginBox"a>
        <h2>Staff Login</h2>
        <form action="Staff_Welcome" method="post">
		<table>
			<tr>
				<td>Username</td> 
				<td><input type="text" name="nm" placeholder="Enter name"></td>
			</tr>
			<tr>
				<td>Password</td> 
				<td><input type="password" name="pw" placeholder="Enter password" id="pa"></td>
			</tr>
			<tr>
				<td><input type="Submit" value="Login" /></td>
				<td>Show password<input type="checkbox" onclick="display()"></td>
			</tr>
                        <td><a href="Staff_reg.jsp">Create Account?</a><td></tr>
		</table>
	</form>
    </div>
    </body>
</html>
        