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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "remove", urlPatterns = {"/remove"})
public class remove extends HttpServlet {
Todoform todoform=new Todoform();

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
       HttpSession session = request.getSession();   
     session.setAttribute("currentId",1);
       session.setAttribute("tasks", new ArrayList<Task>());
   RequestDispatcher dispatcher = request.getRequestDispatcher("todolist.jsp");
        dispatcher.forward(request, response);
  
    }


   

}
