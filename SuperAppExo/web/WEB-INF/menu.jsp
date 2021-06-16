<%-- 
    Document   : menu
    Created on : 7 juin 2021, 15:13:01
    Author     : vincent
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav>
            <ul>
                <li><a href="<c:url value="accueil"/>"">Accueil</a></li>
                <li><a href="<c:url value="profil"/>">Profil</a></li>
                <li><a href="<c:url value="planning"/>">Planning</a></li>
                <li><a href="<c:url value="apropos"/>"">A propos</a></li>
                    <%    
                    if (!session.isNew()) {%>
                <li><a href="<c:url value="LogoutServlet"/>">Se déconnecter</a></li>
                    <%} else {%>
                <li><a href="<c:url value="login"/>"">Se connecter</a></li>
                    <%  } %>
            </ul>
        </nav>
    </body>
</html>
