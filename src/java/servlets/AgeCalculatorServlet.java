/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 738634
 */
public class AgeCalculatorServlet extends HttpServlet{


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
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
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
            throws ServletException, IOException{
        
        
        String age = request.getParameter("age");
       
        if(age == null || age.equals(""))
            {
                String denied = "You must enter something.";
                request.setAttribute("ageResults", denied);
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            }
        
        try
        {
            int nextAge = Integer.parseInt(age)+1;
            String results = "Your age next birthday will be "+nextAge;
            request.setAttribute("ageResults", results);
        }
        catch(NumberFormatException n)
        {
            String denied = "You must enter an age.";
            request.setAttribute("ageResults", denied);
        }
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
      
    }
}
