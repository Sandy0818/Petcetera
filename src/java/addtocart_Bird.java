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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sandhya
 */
public class addtocart_Bird extends HttpServlet {

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
            String order[] = request.getParameterValues("order");
            
            String htmlRespone = "Product id = ";
            
            for(int i=0; i<order.length; i++)
                htmlRespone  += order[i] + " ";
                        
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
                
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Petcetera ", "Sandhya", "Sandhya");
            
            PrintWriter writer = response.getWriter();
            //writer.println(order.length);
            //writer.println(htmlRespone);
        
            Statement stmt = con.createStatement();
            ResultSet rs;
            //rs = stmt.executeQuery("select * from PRODUCTS");
            
            boolean order_found = false;
            
            for(int i=0; i<order.length; i++)
            {
                order_found = false;
                
                rs = stmt.executeQuery("select * from BIRD_PRODUCT");
                while(rs.next())
                {
                    String pname = rs.getString("PRODUCT_NAME");
                    float price = rs.getFloat("PRICE");
                    String pid = rs.getString("ID");

                    if(pid.equals(order[i]))
                    {
                        stmt.executeUpdate("insert into ORDERS(PRODUCT_ID, NAME, PRICE) values ('"+pid+"', '"+pname+"', "+price+")");
                        //writer.println("<br>" + htmlRespone);
                        htmlRespone = "Data entered into table";
                        //writer.println("<br>" + htmlRespone);
                        order_found = true;
                    }
                    
                    if(order_found)
                        break;
                }            
                //htmlRespone = "Data entered into table";
                //writer.println(htmlRespone);
            }
            if(order_found)
            {
                htmlRespone = "<body style=\"background-color: rgb(24, 151, 173);\">";
                htmlRespone += "<div style=\"padding: 100px 400px;\"><h3 style=\"font:ariel; text-align: center;\">Items successfully added to cart!!</h3></div>";
                String button1 = "<div style=\"padding-left:550px;\"><a href= ";
                String button2 = "><button style = \"background-color: rgb(197, 49, 86); text-align: center; color: white; width: 250px; height: 75px; font-size: 20px;\"><b>Back to Home</b></button></a></div>";
                writer.print("<h1>" + htmlRespone + "</h1>");
                writer.print("<br>" + button1 + "\"home_page.html\"" + button2);
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addtocart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addtocart.class.getName()).log(Level.SEVERE, null, ex);
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
