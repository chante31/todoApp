<%-- 
    Document   : planning
    Created on : 11 juin 2021, 16:26:01
    Author     : stag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css"/>
        <title>Planning</title>
    </head>
    <body>
        <%@ include file="menu.jsp" %>
        <h1>Hello Planning!</h1>
        <%-- Récupération des matchs : --%>
        <jsp:useBean id="All" class="fr.ldnr.app.modele.Pays" scope="page" >
            <jsp:setProperty name="All" property="nomPays" value="Allemagne"/>
            <jsp:setProperty name="All" property="urlDrapeau" value="img/flags/allemagne.png"/>
        </jsp:useBean>
        <jsp:useBean id="Fra" class="fr.ldnr.app.modele.Pays" scope="page" >
            <jsp:setProperty name="Fra" property="nomPays" value="France"/>
            <jsp:setProperty name="Fra" property="urlDrapeau" value="img/flags/france.png"/>
        </jsp:useBean>
        <jsp:useBean id="m1" class="fr.ldnr.app.modele.Match" scope="page" >
            <jsp:setProperty name="m1" property="pays1" param="All"/>
            <jsp:setProperty name="m1" property="scorePays1" value="1"/>
            <jsp:setProperty name="m1" property="pays2" param="Fra"/>
            <jsp:setProperty name="m1" property="scorePays2" value="3"/>
        </jsp:useBean>

        <ol>
            <li>
                <p>Match écrit en dur</p>
                <ul>
                    <li>Match : m1, Date : null</li>
                    <li><img src="img/flags/allemagne.png" alt="drapeau de l'All"/>Allemagne : 1</li>
                    <li><img src="img/flags/france.png" alt="drapeau de la France"/>France : 3</li>
                </ul>
            </li>
            <li>
                <p>Match écrit a partir d'objet crée en dur</p>
                <ul>
                    <li>Match : m1?, Date : ${m1.dateMatch}</li>
                    <li><img src="${m1.pays1.urlDrapeau}" alt="drapeau : ${m1.pays1.nomPays}"/>${m1.pays1.nomPays} : ${m1.scorePays1}</li>
                    <li><img src="${m1.pays2.urlDrapeau}" alt="drapeau : ${m1.pays2.nomPays}"/>${m1.pays2.nomPays} : ${m1.scorePays2}</li>
                </ul>
            </li>   
            <li>
                <p>Match écrit a partir d'un objet recu du context</p>
                <ul>
                    <li>Match : matchTest, Date : ${matchTest.dateMatch}</li>
                    <li><img src="<c:url value="${matchTest.pays1.urlDrapeau}"/>" alt="drapeau : ${matchTest.pays1.nomPays}"/>${matchTest.pays1.nomPays} : ${matchTest.scorePays1}</li>
                    <li><img src="<c:url value="${matchTest.pays2.urlDrapeau}"/>" alt="drapeau : ${matchTest.pays2.nomPays}"/>${matchTest.pays2.nomPays} : ${matchTest.scorePays2}</li>
                </ul>
            </li>
            
            <li>
                <p>Liste de match crée avec JSTL et EL "c:forEach" et "c:url" recu depuis le context"</p>
                <c:forEach items="${tournoi.getList()}" var="match">
                    <ul>
                        <li>Match : match n°i, Date : ${match.dateMatch}</li>
                        
                        <li><img src="<c:url value="${match.pays1.urlDrapeau}"/>" alt="drapeau : ${match.pays1.nomPays}"/>${match.pays1.nomPays} : ${match.scorePays1}</li>
                        <li><img src="<c:url value="${match.pays2.urlDrapeau}"/>" alt="drapeau : ${match.pays2.nomPays}"/>${match.pays2.nomPays} : ${match.scorePays2}</li>
                    </ul>
                </c:forEach>
            </li>
        </ol>
    </body>
</html>
