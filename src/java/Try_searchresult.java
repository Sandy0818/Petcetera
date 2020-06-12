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
public class Try_searchresult extends HttpServlet {

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
            response.setContentType("text/html");
   // PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>All Employees</title>");
    
    Connection conn = null;
    Statement stmt = null;
    
    Class.forName("org.apache.derby.jdbc.ClientDriver");
                
    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Petcetera ", "Sandhya", "Sandhya");
        
    stmt = conn.createStatement();
    
    String query = "select * from BIRD_PRODUCTS";
    
    ResultSet rs = stmt.executeQuery(query);
    
    while(rs.next())
    {
        out.println("<style>"
    + ".container {\n" +
"  padding: 20px;\n" +
"  padding-top: 100px;\n" +
"  text-align: center;\n" +
"}\n" +
".container .product {\n" +
"  position: relative;\n" +
"  overflow: hidden;\n" +
"  width: 200px;\n" +
"  height: 240px;\n" +
"  display: inline-block;\n" +
"  border-radius: 4px;\n" +
"  background-color: rgba(255, 255, 255, 0.45);\n" +
"  margin: 20px;\n" +
"  padding: 15px;\n" +
"}\n" +
".container .product img {\n" +
"  position: relative;\n" +
"  top: -15px;\n" +
"  left: -15px;\n" +
"  transition: all .2s ease;\n" +
"  -webkit-clip-path: polygon(0 100%, 0 0, 100% 0, 100% 70%);\n" +
"          clip-path: polygon(0 100%, 0 0, 100% 0, 100% 70%);\n" +
"  border-top-right-radius: 4px;\n" +
"  border-top-left-radius: 4px;\n" +
"}\n" +
".container .product img:hover {\n" +
"  -webkit-clip-path: polygon(0 100%, 0 0, 100% 0, 100% 100%);\n" +
"          clip-path: polygon(0 100%, 0 0, 100% 0, 100% 100%);\n" +
"  -webkit-transform: scale(1.1);\n" +
"          transform: scale(1.1);\n" +
"}\n" +
".container .product h2 {\n" +
"  text-align: left;\n" +
"  color: #fff;\n" +
"  font-size: 14px;\n" +
"  font-weight: bold;\n" +
"  margin-bottom: 4px;\n" +
"}\n" +
".container .product .description {\n" +
"  text-align: left;\n" +
"  font-size: 11px;\n" +
"  color: #fff;\n" +
"  max-height: 23px;\n" +
"  overflow: hidden;\n" +
"}\n" +
".container .product .price {\n" +
"  text-align: right;\n" +
"  font-size: 18px;\n" +
"  color: #fff;\n" +
"  margin-top: 6px;\n" +
"}\n" +
".container .product .btn {\n" +
"  position: absolute;\n" +
"  font-size: 11px;\n" +
"  font-weight: bold;\n" +
"  float: right;\n" +
"  padding: 10px;\n" +
"  border: 2px solid #00fefe;\n" +
"  border-radius: 20px;\n" +
"  bottom: 10px;\n" +
"  right: 10px;\n" +
"  color: #00fefe;\n" +
"  cursor: pointer;\n" +
"  overflow: hidden;\n" +
"  transition: all .2s ease;\n" +
"}\n" +
".container .product .btn.ok {\n" +
"  background-color: rgba(0, 254, 254, 0.4);\n" +
"  color: #fff;\n" +
"}\n" +
".container .product .btn.ok:after {\n" +
"  content: \"\\e080\";\n" +
"  color: #fff;\n" +
"}\n" +
".container .product .btn:hover {\n" +
"  padding-right: 25px;\n" +
"}\n" +
".container .product .btn:hover:after {\n" +
"  margin-left: 5px;\n" +
"}\n" +
".container .product .btn:after {\n" +
"  font-family: 'simple-line-icons';\n" +
"  content: \"\\e095\";\n" +
"  transition: all .2s ease;\n" +
"  position: absolute;\n" +
"  color: #00fefe;\n" +
"  margin-left: 30px;\n" +
"  transition: all .2s ease;\n" +
"}</style></head>");
    out.println("<body>");
    out.println("<center><h1>All Products</h1>");
        
        String name = rs.getString("PRODUCT_NAME");
        int price = 1999;
        String desc = "aaa bbb ccc";
        String cat = rs.getString("CATEGORY");
        
        out.println("<div class='container'>");
        out.println("<div class='product' padding: 20px;\n" +
                    "padding-top: 100px;\n" +
                    "text-align: center;>\n");
        out.println("<img src='https://placeimg.com/200/100' position: relative;\n" +
                    "top: -15px;\n" +
                    "left: -15px;\n" +
                    "transition: all .2s ease;\n" +
                    "-webkit-clip-path: polygon(0 100%, 0 0, 100% 0, 100% 70%);\n" +
                    "clip-path: polygon(0 100%, 0 0, 100% 0, 100% 70%);\n" +
                    "border-top-right-radius: 4px;\n" +
                    "border-top-left-radius: 4px;>\n");
        out.println("<h2 class='header' text-align: left;\n" +
                    "color: #fff;\n" +
                    "font-size: 14px;\n" +
                    "font-weight: bold;\n" +
                    "margin-bottom: 4px;>"+ name + "</h2>\n");
        out.println("<p class='description' text-align: left;\n" +
                    "font-size: 11px;\n" +
                    "color: #fff;\n" +
                    "max-height: 23px;\n" +
                    "overflow: hidden;>" + desc + "</p>\n");
        out.println("<p class='price' text-align: right;\n" +
                    "font-size: 18px;\n" +
                    "color: #fff;\n" +
                    "margin-top: 6px;>"+ price + "</p>\n" +
                    "</div></div>");
    }
    
    out.println("</body></html>");
    
    } catch (SQLException ex) {
        Logger.getLogger(Try_searchresult.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Try_searchresult.class.getName()).log(Level.SEVERE, null, ex);
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
