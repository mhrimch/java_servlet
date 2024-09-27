package com.mohammed.hrimch.hrservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "secondServlet", value = "/secondServlet")
public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet------------------>");
        HttpSession httpSession = req.getSession(true);
        // Annahme: req ist das HttpServletRequest-Objekt
        Cookie[] cookies = req.getCookies(); // Array von Cookies abrufen

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                // Cookie-Name und -Wert ausgeben
                System.out.println("Cookie Name: " + cookie.getName());
                System.out.println("Cookie Value: " + cookie.getValue());
            }
        } else {
            System.out.println("Keine Cookies gefunden");
        }


        System.out.println( cookies.toString());

        Date createTime = new Date(httpSession.getCreationTime());
        Date lastAccess = new Date(httpSession.getLastAccessedTime());
        String name = (String) httpSession.getAttribute("name");
        PrintWriter out = resp.getWriter();
        out.println("Hello From SecondServlet "+ createTime+ "  "+ lastAccess+ " "+ name+ " sessionID "+ httpSession.getId());
    }
}
