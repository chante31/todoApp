<%-- 
    Document   : profil
    Created on : 7 juin 2021, 15:26:50
    Author     : vincent
--%>

<%@ page import="fr.ldnr.app.modele.Profil" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="/css/style.css">
    </head>
    <body>
        <%@ include file="menu.jsp" %>

        <!-- POST au final, GET pendant le POST -->
        <form method="GET" action="modifierprofil">
            <div>Nom: <input type="text" name="nom"
                             placeholder="Smith"
                             value="<%= Profil.getProfil().getNom() %>">
            </div>
            <div>prénom: <input type="text" name="prenom"
                             placeholder="Smith"
                             value="<%= Profil.getProfil().getPrenom() %>">
                             </div>
            <div>Email: <input type="text" name="email"
                             placeholder="g.lagaffe@dupuis.com"
                             value="<%= Profil.getProfil().getEmail() %>">
            </div>
            <input type="submit" value="Modifier">
        </form>


        <%= Profil.getProfil() %>
    </body>
</html>
