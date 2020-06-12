/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @Author: Sandhya Padmanabhuni
 */
public class SigninServlet extends HttpServlet 
{
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String name = request.getParameter("name");
            String addr = request.getParameter("address");
            String phn = request.getParameter("number");
            String email = request.getParameter("email");
            String password = request.getParameter("psw");
            
            int phone = Integer.parseInt(phn);
            
            PrintWriter writer = response.getWriter();
            
            String htmlRespone = "<html>";
            htmlRespone += "<h2>Your username is: " + name + "<br/>";      
            htmlRespone += "Your password is: " + password + "</h2>";
            htmlRespone += "<h2>Your address is: " + addr + "<br/>";      
            htmlRespone += "Your phn is: " + phone + "</h2>";
            htmlRespone += "<h2>Your email is: " + email + "</h2>";
            htmlRespone += "</html>";
            
            //writer.println(htmlRespone);
                       
            Class.forName("org.apache.derby.jdbc.ClientDriver");
                
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Petcetera ", "Sandhya", "Sandhya");
        
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into CUSTOMER(FULL_NAME, ADDRESS, PHONE_NO, EMAIL, PASSWORD) values ('"+name+"', '"+addr+"', "+phone+", '"+email+"', '"+password+"')");
            
            System.out.println("Data inserted into table");
            
            //htmlRespone = "<html> <h2>Data entered into table</h2> </html>";
           /* htmlRespone = "<html>\n" +
                            "<head>\n" +
                            "<style>\n" +
                            ".button {\n" +
                            "    background-color: rgb(197, 49, 86);\n" +
                            "    border: none;\n" +
                            "    color: white;\n" +
                            "    padding: 15px 32px;\n" +
                            "    text-align: center;\n" +
                            "    text-decoration: none;\n" +
                            "    display: inline-block;\n" +
                            "    font-size: 16px;\n" +
                            "    margin: 4px 2px;\n" +
                            "    cursor: pointer;\n" +
                            "}\n" +
                            "</style>\n" +
                            "</head>";*/
            htmlRespone = "<body style=\"background-color: rgb(24, 151, 173);\">";
            htmlRespone += "<div style=\"padding: 100px 425px;\"><h1 style=\"font:ariel; text-align: center;\">You have successfully signed up!!</h1></div>";
            htmlRespone += "<div style=\"padding-left:550px;\"><a href = \"home_page.html\"><button style = \"background-color: rgb(197, 49, 86); text-align: center;color: white; width: 250px; height: 75px; font-size: 20px;\"><b>BACK TO HOME</b></button></a></div></body></html>";
            writer.println(htmlRespone);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(SigninServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SigninServlet.class.getName()).log(Level.SEVERE, null, ex);
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
