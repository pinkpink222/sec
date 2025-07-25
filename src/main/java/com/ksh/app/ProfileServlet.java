package com.ksh.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("name");
        if (userName == null || userName.isEmpty()) {
            userName = "손님";
        }
        request.setAttribute("displayUserName", userName);
        request.getRequestDispatcher("/welcome.jsp").forward(request, response);
    }
}
