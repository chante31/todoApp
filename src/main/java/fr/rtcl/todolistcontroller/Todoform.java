/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rtcl.todolistcontroller;

import fr.rtcl.dto.Task;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.rtcl.dto.Task;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "Todoform", urlPatterns = {"/todoform"})
public class Todoform extends HttpServlet {

    List< Task> tasks = new ArrayList<>();
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // PrintWriter out =response.getWriter();
        HttpSession session = request.getSession();
        Integer currentId=(Integer)session.getAttribute("currentId");
        if(currentId==null){
           currentId=1;
        }
        
        String title = request.getParameter("title");
        //assert title !=null;
        String description = request.getParameter("description");
        Task task = new Task(currentId, title, description, false);

        currentId++;
       session.setAttribute("currentId", currentId);
        List<Task> tasks = (List<Task>) session.getAttribute("tasks");
        if (tasks == null) {
            tasks = new ArrayList<Task>();

        }
        tasks.add(0, task);
        session.setAttribute("tasks", tasks);
        session.setAttribute("currentId", currentId);
        session.setAttribute("id", task.getId());
        session.setAttribute("title", title);
        session.setAttribute("description", description);

        request.setAttribute("id", task.getId());
        request.setAttribute("title", title);
        request.setAttribute("description", description);
        request.setAttribute("etat", false);
        request.getSession().setAttribute("tasks", tasks);

        request.setAttribute("tasks", tasks);

        RequestDispatcher dispatcher = request.getRequestDispatcher("todolist.jsp");
        dispatcher.forward(request, response);

    }

}
