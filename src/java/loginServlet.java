/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sandhya
 */
public class loginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //@WebServlet("/loginServlet")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String htmlResponse;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            boolean flag = false;
            
            String username = request.getParameter("email");
            String password = request.getParameter("password");
         
            System.out.println("username: " + username);
            System.out.println("password: " + password);
 
        // do some processing here...
         
        // get response writer
            PrintWriter writer = response.getWriter();
         
        // build HTML code
            String htmlRespone = "<html>";
            htmlRespone += "<h2>Your username is: " + username + "<br/>";      
            htmlRespone += "Your password is: " + password + "</h2>";    
            htmlRespone += "</html>";
         
        // return response
            //writer.println(htmlRespone);
            
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Petcetera ", "Sandhya", "Sandhya");
                
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from CUSTOMER");
                
                while(rs.next() && !flag)
                {
                    String t_email = rs.getString("EMAIL");
                    String t_pword = rs.getString("PASSWORD");
                    
                    if(t_email.equals(username) && t_pword.equals(password))
                        flag = true;
                }
                
                if(flag)
                {
                    htmlRespone = "<html><body style=\"background-color: rgb(24, 151, 173);\"><H1 style=\"padding-top: 100px; padding-left:500px;\">ACCESS GRANTED</H1>";
                    htmlRespone += "<div style=\"padding-left: 520px;\"><a href = \"home_page.html\"><button style=\"background-color: rgb(197, 49, 86); width:250px; height:75px; font-size:20px; color:white;\"><b>BACK TO HOME</b></button></a></div></body></html>";
                }
                else
                    htmlRespone = "<html> <h2>Access denied</h2> </html>";
            
            System.out.println("Data inserted into table");
            
            //htmlRespone = "<html> <h2>Data entered into table</h2> </html>";
            writer.println(htmlRespone);
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
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
