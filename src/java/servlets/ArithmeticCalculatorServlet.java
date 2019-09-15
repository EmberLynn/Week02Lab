/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 738634
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

  

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
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        
        if(first == null || first.equals("") || second == null || second.equals(""))
        {
            String denied = "You must enter something";
            request.setAttribute("calcResults", denied);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        
        try
        {
            int num1 = Integer.parseInt(first);
            int num2 = Integer.parseInt(second);
            
            String addButton = request.getParameter("add");
            String subButton = request.getParameter("sub");
            String multiButton = request.getParameter("multi");
            String modButton = request.getParameter("mod");
            int results;
            
            
            if(addButton != null)
            {
                results = num1 + num2;
            }
            else if(subButton != null)
            {
                results = num1 - num2; 
            }
            else if(multiButton != null)
            {
                results = num1 * num2;
            }
            else
            {
                results = num1 % num2;
            }
            
            request.setAttribute("calcResults", results);
        }
        catch(NumberFormatException n)
        {
            String denied = "You must enter a digit";
            request.setAttribute("calcResults", denied);
        }
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }



}
