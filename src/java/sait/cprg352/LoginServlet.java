/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 729347
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").
                forward(request, response);

    }
    
    public boolean isNumeric(String s) {  
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO
                
        // retrieves fname and lname from the form
        String userName = request.getParameter("uname");
        String passWord = request.getParameter("pword");
        
        // validation
        if (userName == null || userName.isEmpty() ||
                passWord == null || passWord.isEmpty()) {
            // set error message            
            // repopulate the JSP values with first name and last name
            request.setAttribute("username", userName);
            request.setAttribute("password", passWord);
            request.setAttribute("errorMessage", "Both values are required!");
            
            // forward the request back to index.jsp
            getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
            // stop other execution of code
            return;
        }
        
        if (userName.equalsIgnoreCase("adam") && passWord.equals("password") || userName.equalsIgnoreCase("betty") &&
                passWord.equals("password")) {
            // set the attributes for the JSP
            request.setAttribute("username", userName);
            request.setAttribute("password", passWord);
            
            getServletContext().getRequestDispatcher("/WEB-INF/loggedIn.jsp").
                    forward(request, response);
            
            return;
        }
        
        if (!userName.equals("adam") || !userName.equals("betty") &&
                !passWord.equals("password")) {
            request.setAttribute("errorMessage", "Invalid username or password!");
            
            // set the attributes for the JSP
            request.setAttribute("username", userName);
            request.setAttribute("password", passWord);

            getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").
                    forward(request, response);
            
            return;
        }
    }
}
