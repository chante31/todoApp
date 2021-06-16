<%-- 
    Document   : accueil
    Created on : 7 juin 2021, 15:11:53
    Author     : vincent
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Collections, java.util.*, fr.ldnr.app.modele.* " %>
<%! Competiteurs competiteurs; %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="menu.jsp" %>

        <h1>Bienvenue sur l'application !</h1>
        <section>
            <h2>Equipes engagés</h2>
            <%-- Récupération des équipes : --%>
            <jsp:useBean id="All" class="fr.ldnr.app.modele.Pays" scope="page" >
                <jsp:setProperty name="All" property="nomPays" value="Allemagne"/>
                <jsp:setProperty name="All" property="urlDrapeau" value="img/flags/allemagne.png"/>
            </jsp:useBean>
            <jsp:useBean id="Fra" class="fr.ldnr.app.modele.Pays" scope="page" >
                <jsp:setProperty name="Fra" property="nomPays" value="France"/>
                <jsp:setProperty name="Fra" property="urlDrapeau" value="img/flags/france.png"/>
            </jsp:useBean>
            <jsp:useBean id="Hon" class="fr.ldnr.app.modele.Pays" scope="page" >
                <jsp:setProperty name="Hon" property="nomPays" value="Hongrie"/>
                <jsp:setProperty name="Hon" property="urlDrapeau" value="img/flags/hongrie.png"/>
            </jsp:useBean>
            
            
            <% 
                ArrayList<Pays> liste = new ArrayList<>();
                liste.add(Hon);
                liste.add(All);
                liste.add(Fra);
                Collections.sort(liste);
                
                competiteurs = (Competiteurs) application.getAttribute("competiteurs");
                Collections.sort(competiteurs.getList());
            %>
            
            

            <ol>
                <p>Liste écrite en dur</p>
                <li><img src="img/flags/allemagne.png" alt="drapeau de l'All"/>Allemagne</li>
                <li><img src="img/flags/france.png" alt="drapeau de la France"/>France</li>
                <li><img src="img/flags/hongrie.png" alt="drapeau de la hongrie"/>Hongrie</li>
                
                <p>Liste écrite a partir d'objets crée en dur</p>
                <li><img src="${All.urlDrapeau}" alt="drapeau de l'${All.nomPays}"/>${All.nomPays}</li>
                <li><img src="${Fra.urlDrapeau}" alt="drapeau de la ${Fra.nomPays}"/>${Fra.nomPays}</li>
                <li><img src="${Hon.urlDrapeau}" alt="drapeau de la ${Hon.nomPays}"/>${Hon.nomPays}</li>
                
                <p>Liste crée avec boucle for</p>
                <% for (Pays p : liste) {%>
                    <li><img src="<%=p.getUrlDrapeau()%>" alt="drapeau de <%=p.getNomPays()%>"/><%=p.getNomPays()%></li>
                <% }%>
                
                <p>Liste crée avec JSTL et EL "c:forEach" et "c:url"</p>
                <c:forEach items="${competiteurs.getList()}" var="pays">
                    <li><img src="<c:url value="${pays.urlDrapeau}"/>" alt="drapeau : ${pays.nomPays}" >${pays.nomPays}</li>
                </c:forEach>
            </ol>
        </section>
    </body>
</html>
