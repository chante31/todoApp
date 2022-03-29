/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rtcl.todolistcontroller;

import fr.rtcl.dto.Task;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "State", urlPatterns = {"/state"})
public class State extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

 HttpSession session = request.getSession();

     List<Task> tasks = (List<Task>) session.getAttribute("tasks");
     Task mytask = null;
     for(Task task: tasks){
         
         if(task.getId()==Integer.parseInt(request.getParameter("id"))){
             mytask=task;
             break;
         }    
     }
     //je recupère la tache qui correspond à l'ID
     if(mytask!=null){
     mytask.setState(Boolean.parseBoolean(request.getParameter("state")));
     session.setAttribute("tasks", tasks);
     }
     
     
        RequestDispatcher dispatcher = request.getRequestDispatcher("todolist.jsp");
        dispatcher.forward(request, response);
    }

}
