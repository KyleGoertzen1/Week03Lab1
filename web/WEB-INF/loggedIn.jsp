<%-- 
    Document   : helloWorldJSP
    Created on : 15-Sep-2017, 8:59:59 AM
    Author     : awarsyle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Database Login</title>
    </head>
    <body>
        <h1>Main Page</h1>
        <p>Hello, ${user.firstName} <a href="MainPageServlet">Logout</a></p>
    </body>
</html>
