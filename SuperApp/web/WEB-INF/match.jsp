<%-- 
    Document   : match
    Created on : 16 juin 2021, 12:57:50
    Author     : stag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:forEach items="${rencontre.getList()}" var="match">
                    <ul>
                        <li>UEFA EURO 2020</li>
                        <li><img src="/SuperApp/${match.pays1.drapeauUrl}"/>" alt="drapeau : ${match.pays1.nom}"/>${match.pays1.nom} : ${match.scorePays1}</li>
                        <li><img src="/SuperApp/${match.pays2.drapeauUrl}"/>" alt="drapeau : ${match.pays2.nom}"/>${match.pays2.nom} : ${match.scorePays2}</li>
                    </ul>
                </c:forEach>
    </body>
</html>
