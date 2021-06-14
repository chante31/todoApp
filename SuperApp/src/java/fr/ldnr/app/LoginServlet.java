package fr.ldnr.app;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    // iniformation sur le user qui peut se connecter
    private final String userID = "admin";
    private final String password = "123";
    private final String userName = "Gaston Lagaffe";

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        // get request parameters for userID and password
        String loginName = request.getParameter("login");
        String loginPwd = request.getParameter("pwd");

        // Il faudra aussi vérifier les données qui viennent de l'extérieur
        if (userID.equals(loginName) && password.equals(loginPwd)) {

            // Session , expiration au bout de 20 sec.
            HttpSession session = request.getSession();
            session.setAttribute("userName", userName);
            session.setMaxInactiveInterval(20);

            Cookie userCookie = new Cookie("userLogin", loginName);
            userCookie.setMaxAge(1 * 10);
            response.addCookie(userCookie);

            // Client side redirect
            response.sendRedirect("/SuperApp/accueil");
        } else {

            // Server side redirect
            try (PrintWriter out = response.getWriter()) {
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
                out.println("<font color=red>Les informations fournies sont incorrectes (essayez "
                    + userID + "/" + password + ").</font>");
                rd.include(request, response);
            }
        }

    }

}
