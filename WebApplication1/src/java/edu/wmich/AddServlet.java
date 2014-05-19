/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wmich;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author malyshka
 */
@WebServlet(name = "AddServlet", urlPatterns = {"/Add","/add"})
public class AddServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        //added, create new sessions and keep existing
        HttpSession session = request.getSession(true);
        try (PrintWriter out = response.getWriter()) {
            
            if (request.getParameter("page") == null || request.getParameter("page").equals("page1")) {

                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Add Servlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<form action=\"/WebApplication1/add\" method=\"GET\">");
                out.println("Number 1: <input type=\"text\" name=\"num1\"/>");
                out.println("<input type=\"hidden\" name=\"page\" value=\"page2\"/>");
                out.println("<input type=\"submit\" name=\"btn1\" value=\">>\"/>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");
            }
            else if(request.getParameter("page").equals("page2")){
                //keeps the first number that was submitted to server
                session.setAttribute("num1",request.getParameter("num1"));
                
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Add Servlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<form action=\"/WebApplication1/add\" method=\"GET\">");
                out.println("Number 2: <input type=\"text\" name=\"num2\"/>");
                out.println("<input type=\"hidden\" name=\"page\" value=\"page3\"/>");
                out.println("<input type=\"submit\" name=\"btn2\" value=\">>\"/>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");
            }
            else if(request.getParameter("page").equals("page3")){
                session.setAttribute("num2",request.getParameter("num2"));
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Add Servlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<form action=\"/WebApplication1/add\" method=\"GET\">");
                int val1 = Integer.parseInt(session.getAttribute("num1").toString());
                int val2 = Integer.parseInt(session.getAttribute("num2").toString());
                int result = val1 + val2;
                out.println("Result: <input readonly type=\"text\" name=\"num3\"/value\""+result+"\":>");
                out.println("<input type=\"hidden\" name=\"page\" value=\"page1\"/>");
                out.println("<input type=\"submit\" name=\"btn3\" value=\"<<\"/>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");
            }
        }
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
