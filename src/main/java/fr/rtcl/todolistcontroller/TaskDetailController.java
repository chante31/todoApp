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
@WebServlet(name = "TaskDetailController", urlPatterns = {"/detailcontrol"})
public class TaskDetailController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();

        List<Task> tasks = (List<Task>) session.getAttribute("tasks");
        Task mytask = null;
        for (Task task : tasks) {
            if (task.getId() == Integer.parseInt(request.getParameter("id"))) {
                mytask = task;
                break;
            }
        }
        if (mytask != null) {
            out.print("Titre :" + mytask.getTitle() + " <BR>");
            out.print("Description :" + mytask.getDescription() + " <br><br>");
        } else {
            out.print("l'élément n'existe pas");

        }
        out.println("<a href=\"todolist.jsp\">back to tasklist <a>");

    }

}
