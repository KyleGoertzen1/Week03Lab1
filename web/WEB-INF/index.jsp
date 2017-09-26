<%-- 
    Document   : index
    Created on : 15-Sep-2017, 9:18:01 AM
    Author     : awarsyle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />
<!DOCTYPE html>
<h1>Login</h1>
<div>
    <form action="login" method="POST">
        Username: <input type="text" name="uname" value="${user.firstName}"><br>
        Password: <input type="password" name="pword" value="${user.passWord}"><br>
        <input type="submit" value="Login">
    </form>
</div>
${errorMessage}
${logOutMessage}
<c:import url="/footer.html" />
