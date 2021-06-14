<%-- 
    Document   : LoginSuccess
    Created on : 8 juin 2021, 16:49:14
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
        //allow access only if session exists
            String userName = (String) session.getAttribute("userName");
            String userLogin = null;
            String sessionID = null;
            
//            // Récupération des cookies JSESSIONID QUI CHANGE À CHANGE CONNEXION
//            
//            Cookie[] cookies = request.getCookies();
//            if (cookies != null) {
//                for (Cookie cookie : cookies) {
//                    if (cookie.getName().equals("userLogin")) {
//                        userLogin = cookie.getValue();
//                    }
//                    if (cookie.getName().equals("JSESSIONID")) {
//                        sessionID = cookie.getValue();
//                    }
//                 
//                }
//            }
//        %>

<!--     <h3>Bienvenue <%=userName%></h3>
        <p>Votre ID de session est <%=sessionID%></p>    
        <p>Vous êtes connecté avec l'identifiant <%=userLogin%></p>
<a href="CheckoutPage">Sortir tranquillement du site</a>
        -->
        <form action="LogoutServlet" method="post">
            <input type="submit" value="Déconnexion immédiate" >
        </form>
    </body>
    
</html>
