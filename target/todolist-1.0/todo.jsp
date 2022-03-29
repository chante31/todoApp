<%-- 
    Document   : todo
    Created on : 24 mars 2022, 23:05:37
    Author     : Admin
--%>


<!DOCTYPE html>
<html>
    <head>
        
     <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
     <link rel="stylesheet" href="css/style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="textcenter">
             <h1>Add a new task</h1>
        <form action="todoform" method="post">
           <div class="form-group">
                <label for="name">Title :</label>
                <input type="text" id="title" name="title" required>
           </div>
           <div class="form-group">

                <label for="name">Description :</label>
                <input type="text" id="description" name="description"><br>
           </div>
                
                <div class="btn btn-dark">
                    <button type="submit">Save</button>
                       <a href="todolist.jsp"><input type="button" value="Cancel" /></a>
   
                </div>
            </form>
        </div>
    </body>
</html>
