<%-- 
    Document   : index
    Created on : 15-Sep-2017, 9:18:01 AM
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
        <h1>Login</h1>
        <div>
            <form action="login" method="POST">
                Username: <input type="text" name="uname" value="${username}"><br>
                Password: <input type="password" name="pword" value="${password}"><br>
                <input type="submit" value="Login">
            </form>
        </div>
        ${errorMessage}
        ${logOutMessage}
    </body>
</html>
