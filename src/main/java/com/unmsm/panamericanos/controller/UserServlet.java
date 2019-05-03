/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panamericanos.controller;

import com.unmsm.panamericanos.dao.UserDaoImpl;
import com.unmsm.panamericanos.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author diego
 */
public class UserServlet extends HttpServlet {
    UserDaoImpl userdao = new UserDaoImpl();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        switch(action) {
            case "login": login(request, response); break;
            case "register": register(request, response); break;
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String param1 = request.getParameter("email"), 
                param2 = request.getParameter("password");
 
        // Checking for null and empty values
        if(param1 == null || param2 == null || "".equals(param1) || "".equals(param2)) {
            request.setAttribute("message", "Please enter login email and password");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {
            User isUserFound = userdao.login(param1, param2);
            if(isUserFound != null) {               
                request.getSession().setAttribute("user", isUserFound);
                request.getRequestDispatcher("/User/welcome.jsp").forward(request, response);
            } else {
                request.setAttribute("message", "You are not an authorised user. Please check with administrator.");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }   
        }
    }
    
    private void register(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String email = "";
        String password = "";
        String name = "";
        String last_name = "";
        String photo = "";
        String message = "";
        try {
            userdao.insert(new User(email, password, name, last_name, photo));
            message = "registered user";
        } catch(Exception e) {
            message = "Error: " + e;
        }
        
        request.setAttribute("message", message);
        request.getRequestDispatcher("/User/welcome.jsp").forward(request, response);
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
