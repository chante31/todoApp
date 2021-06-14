<%-- 
    Document   : CheckoutPage
    Created on : 9 juin 2021, 08:30:54
    Author     : stag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         
        <%
            String userName = (String) session.getAttribute("userName");
        %>
        <h3>Au revoir <%=userName%></h3>
        <p>Nous sommes heureux de vous avoir compté parmi nous
            et espérons vous revoir sur notre site très prochainement.</p>
        <br>
        <!-- clien avec logoutservlet pour nous ra-->
        <form action="LogoutServlet" method="post">
            <input type="submit" value="Déconnexion" >
        </form>
    </body>
    
</html>
