<%-- 
    Document   : todolist
    Created on : 25 mars 2022, 14:49:57
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="textcenter">
            <form method="post" action="todo.jsp">
                <button type="submit" class="btn btn-dark">Add new task</button>

            </form>
        </div>
        <div class="textcenter">
            <form method="post" action="remove">
                <button type="submit" class="btn btn-dark" name="remove">Clear All task</button>
            </form>
        </div>
        <div class="textcenter">
            <table >
                <thead>
                    <tr>
                        <th>task number</th>
                        <th>Title</th>

                        <th>Actions</th>
                        <th>State</th>
                    </tr>
                </thead>
                <tbody>
                    </div>

                    <c:forEach var="task" items="${tasks}">

                        <tr <c:if test="${task.isStated()}">
                                class="strikeout" 

                            </c:if>>

                            <td><c:out value="${task.getId()}" /></td>
                            <td><c:out value="${task.getTitle()}" /></td>
                            <td><a href="detailcontrol?id=<c:out value="${task.getId()}" />">details</a>
                                <a href="removeElement?id=<c:out value="${task.getId()}" />">remove</a>
                            </td>

                            <td>
                                <input type="checkbox" id="checkbox-<c:out value="${task.getId()}" />" onclick="isChecked(<c:out value="${task.getId()}" />)" 

                                       <c:if test="${task.isStated()}">
                                           checked 

                                       </c:if>>                  
                            </td>

                        </tr>
                    </c:forEach>
                </tbody>
            </table>

            <script type="text/javascript" src="js/state.js"></script>

    </body>
</html>
