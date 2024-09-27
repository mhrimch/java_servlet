package com.mohammed.hrimch.hrservlet;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        // Hello
        // message =request.getParameter("name");
        //PrintWriter out = response.getWriter();
        //out.println("<html><body>");
        //out.println("<h1>" + message + "</h1>");
        //out.println("</body></html>");

        //RequestDispatcher requestDispatcher = request.getRequestDispatcher("/secondServlet");
        //requestDispatcher.forward(request,response);

        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("name", "Mohammed Hrimch");
        Cookie cookie = new Cookie("user", "mhrimch");

        System.out.println("getCookies.....");
        Cookie[] cookies = request.getCookies();

        for (Cookie c: cookies){
            c.toString();
        }


        response.addCookie(cookie);
        response.sendRedirect("secondServlet");

    }

    public void destroy() {
    }
}