package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.AccountService;
import models.User;

/**
 *
 * @author fricardo
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String logout = request.getParameter("logout");
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        
        if(logout != null){
            session.invalidate();
            request.setAttribute("note", "You have successfully logged out"); 
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);       
        } else if (user != null){
            response.sendRedirect("home");
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       HttpSession session = request.getSession();
       
       if(username == null || username.equals("") || password == null || password.equals("")) {
           request.setAttribute("note", "User and/or Password are invalid");
       }
       
       AccountService asuser = new AccountService();
       User user = asuser.login(username, password);
       session = request.getSession();
       
       if(user != null) {
           session.setAttribute("user", user);
           response.sendRedirect("home");
       } else {
           request.setAttribute("note", "User and/or Password are invalid"); 
           getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
       }
       
       
    }
}
