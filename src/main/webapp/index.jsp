<%-- 
    Document   : index
    Created on : 28/04/2019, 02:42:24 AM
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>MongoDb Servlet Example</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 
    <!-- jQuery Files -->
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="resource/js/form_login.js"></script>
 
    <!-- CSS File -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
    <div id="mongoDbServlet" class="container">
        <h1 align="center" class="text-primary">MongoDb Jsp and Servlet Example</h1>
        <hr />
 
        <!------ MONGODB JSP & SERVLET EXAMPLE ------>
        <div id="login_form">
            <form id="user_login_form" name="loginForm" method="post" action="user?action=login">
                <!----- LOGIN FORM ------>
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                    <input type="text" class="form-control" id="email" placeholder="Enter email ..." name="email">
                </div>
                <div> </div>
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                    <input type="password" class="form-control" id="password" placeholder="Enter password ..." name="password">
                </div>
 
                <!----- SUBMIT BUTTON ------>
                <div> </div>
                <button id="submit_btn" type="submit" class="btn btn-primary">Confirm identity</button>
            </form>
        </div>
         
        <h4 id="errMsg" class="text-danger" align="center">${message}</h4>
    </div>
</body>
</html>