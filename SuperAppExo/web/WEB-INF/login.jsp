<%-- 
    Document   : login
    Created on : 8 juin 2021, 16:14:30
    Author     : stag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="LoginServlet" method="post">
            Username: <input type="text" name="login">
            <br>
            Password: <input type="password" name="pwd">
            <br>
            <input type="submit" value="Connexion">
        </form>
    </body>
</html>
