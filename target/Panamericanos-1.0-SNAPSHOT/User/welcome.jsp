<%-- 
    Document   : welcome
    Created on : 28/04/2019, 02:44:52 AM
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Patronsitos</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 
    <!-- CSS File -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
    <div id="mongoDbServlet" class="container">
        <h2 align="center" class="text-success">Welcome user!</h2>
        <%=request.getSession().getAttribute("user")%>
    </div>
</body>
</html>