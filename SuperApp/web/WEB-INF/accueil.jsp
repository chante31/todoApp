<%-- 
    Document   : accueil
    Created on : 7 juin 2021, 15:11:53
    Author     : vincent
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="fr.ldnr.app.modele.*"
         import="java.util.*"
         import="java.util.stream.Collectors"
         %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%!
    Competiteurs competiteurs;
    Pays pays;
    List<Pays> listePays;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="/SuperApp/css/style.css">
    </head>
    <body>
        <%@ include file="menu.jsp" %>

        <h1>Pays Engagé</h1>  
        
        
      <h1>La bonne méthode JSTL et EL</h1>
            <div><table>   
                    <c:forEach items="${competiteurs.paysL}" var="pays">
                        <tr>
                            <td><img src="/SuperApp/${pays.drapeauUrl}"></td>
<!--                        // Cooolections.sort > objet Comparez to Obj2  > compare to il a été re
                        // coolection sort ca fait pas que trier > modifie la liste 

for (liste)
el1liste (france)  
    france.drapeauURL 
    france.nom
el2liste(Allemagne)
    allemagne.drapeauURL
    allemagne.nom

pays l > liste
pays 1 > drapeauUrl / nom 
pays 2 
    -->
                            <td>${pays.nom}</td>
                            
                        </tr>
                    </c:forEach>
          
                </table></div>
                    

                </table>               
            </div>

                    
                    
                    
                    
                    
                  
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
            
    </body>
</html>
