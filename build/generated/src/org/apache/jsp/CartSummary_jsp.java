package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class CartSummary_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Page Title</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!--<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"Style_checkout.css\">-->\n");
      out.write("    <style>\n");
      out.write("        *\n");
      out.write("{\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row {\n");
      out.write("    display: -ms-flexbox; /* IE10 */\n");
      out.write("    display: flex;\n");
      out.write("    -ms-flex-wrap: wrap; /* IE10 */\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("    margin: 0 -16px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .col-25 {\n");
      out.write("    -ms-flex: 25%; /* IE10 */\n");
      out.write("    flex: 25%;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .col-50 {\n");
      out.write("    -ms-flex: 50%; /* IE10 */\n");
      out.write("    flex: 50%;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .col-75 {\n");
      out.write("    -ms-flex: 75%; /* IE10 */\n");
      out.write("    flex: 75%;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .col-25,\n");
      out.write("  .col-50,\n");
      out.write("  .col-75 {\n");
      out.write("    padding: 0 16px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .container {\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("    padding: 5px 20px 15px 20px;\n");
      out.write("    border: 1px solid lightgrey;\n");
      out.write("    border-radius: 3px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  input[type=text] {\n");
      out.write("    width: 100%;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    padding: 12px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 3px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  label {\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    display: block;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .icon-container {\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    padding: 7px 0;\n");
      out.write("    font-size: 24px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .btn {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 12px;\n");
      out.write("    margin: 10px 0;\n");
      out.write("    border: none;\n");
      out.write("    width: 50%;\n");
      out.write("    border-radius: 3px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    font-size: 17px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .btn:hover {\n");
      out.write("    background-color: #45a049;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  span.price {\n");
      out.write("    float: right;\n");
      out.write("    color: grey;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  /* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (and change the direction - make the \"cart\" column go on top) */\n");
      out.write("  @media (max-width: 800px) {\n");
      out.write("    .row {\n");
      out.write("      flex-direction: column-reverse;\n");
      out.write("    }\n");
      out.write("    .col-25 {\n");
      out.write("      margin-bottom: 20px;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("    </style>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-50\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <form action=\"\">\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">    <!--Changed-->\n");
      out.write("                            <h3>Billing Address</h3>\n");
      out.write("\n");
      out.write("                            <label for=\"fname\"><i class=\"fa fa-user\"></i>Full Name</label>\n");
      out.write("                            <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"full name\">\n");
      out.write("\n");
      out.write("                            <label for=\"email\"><i class=\"fa fa-envolope\"></i>Email</label>\n");
      out.write("                            <input type=\"text\" id=\"email\" placeholder=\"Email\">\n");
      out.write("\n");
      out.write("                            <label for=\"adr\"><i class=\"fa fa-address-card-o\"></i>Address</label>\n");
      out.write("                            <input type=\"text\" id=\"adr\" name=\"address\" placeholder=\"Enter Address\">\n");
      out.write("\n");
      out.write("                            <label for=\"city\"><i class=\"fa fa-institutions\"></i>City</label>\n");
      out.write("                            <input type=\"text\" id=\"city\" name=\"city\" placeholder=\"Enter City\">\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-50\">\n");
      out.write("                                    <label for=\"state\">State</label>\n");
      out.write("                                    <input type=\"text\" id=\"state\" name=\"state\" placeholder=\"Enter State\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-50\">\n");
      out.write("                                    <label for=\"pin\">PIN</label>\n");
      out.write("                                    <input type=\"text\" id=\"pin\" name=\"pin\" placeholder=\"Enter PIN\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div  class=\"col-25\">\n");
      out.write("                            <h3>Payment</h3>\n");
      out.write("                            <label for=\"fname\">Accepted Cards</label>\n");
      out.write("                            <div class=\"icon-container\">\n");
      out.write("                                <i class=\"fa fa-cc-visa\" style=\"color:navy\"></i>\n");
      out.write("                                <i class=\"fa fa-cc-mastercard\" style=\"color:red\"></i>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <label for=\"cname\">Name on Card</label>\n");
      out.write("                            <input type=\"text\" id=\"cname\" name=\"cardname\" placeholder=\"Enter Name\">\n");
      out.write("\n");
      out.write("                            <label for=\"ccnum\">Credit Card Number</label>\n");
      out.write("                            <input type=\"text\" id=\"ccnum\" name=\"cardnumber\" placeholder=\"Enter Cardnumber\">\n");
      out.write("\n");
      out.write("                            <label for=\"expmonth\">Exp Month</label>\n");
      out.write("                            <input type=\"text\" id=\"expmonth\" name=\"expmonth\" placeholder=\"Enter Expiry Month\">\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-50\">\n");
      out.write("                                    <label for=\"expyr\">Exp Year</label>\n");
      out.write("                                    <input type=\"text\" id=\"expyr\" name=\"expyr\" placeholder=\"Enter Expiry Year\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-50\">\n");
      out.write("                                    <label for=\"cvv\">CVV</label>\n");
      out.write("                                    <input type=\"text\" id=\"cvv\" name=\"cvv\" placeholder=\"Enter CVV\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <label>\n");
      out.write("                        <input type=\"checkbox\" checked=\"checked\" name=\"sameadr\">Shipping address same as billing                        \n");
      out.write("                    </label>          \n");
      out.write("                    \n");
      out.write("                    <input type=\"submit\" value=\"Continue to checkout\" class=\"btn\">\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");

                    Connection con;
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    con = DriverManager.getConnection("jdbc:derby://localhost:1527/Petcetera", "Sandhya", "Sandhya");
                    
                    Statement stmt = con.createStatement();
                    String query = "select count(*) from orders";
                    //ResultSet rs = new ResultSet("TYPE_SCROLL_INSENSITIVE");
                    ResultSet rs = stmt.executeQuery(query);
                    int cnt = 0;
                    //cnt = rs.getInt("rowcount");
                    //rs.last();
                    //int cnt = rs.getRow();
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-25\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h4>\n");
      out.write("                    Cart\n");
      out.write("                    <span class=\"price\" style=\"color:black\">\n");
      out.write("                        <i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("                        <b>");
out.println(cnt);
      out.write("</b><!--Item count-->\n");
      out.write("                    </span>\n");
      out.write("                </h4>\n");
      out.write("                \n");
      out.write("                ");

                    /*Connection con;
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    con = DriverManager.getConnection("jdbc:derby://localhost:1527/Petcetera", "Sandhya", "Sandhya");*/
                    
                    //Statement stmt = con.createStatement();
                    query = "select * from orders";
                    rs = stmt.executeQuery(query);
                    
                    //int cnt = 0;
                    float total=0;
                    
                    while(rs.next())
                    {
                        String p_name = rs.getString("NAME");
                        float price = rs.getFloat("PRICE");
                        cnt++;
                        total += price;
                    
                    
                
      out.write("\n");
      out.write("                <!--List of items-->\n");
      out.write("                <p>");
out.println(p_name);
      out.write("<span class=\"price\">");
out.println(price);
      out.write("/-</span></p>\n");
      out.write("                <!--<p>Product 2 Name<span class=\"price\">499/-</span></p>\n");
      out.write("                <p>Product 3 Name<span class=\"price\">999/-</span></p>-->\n");
      out.write("                \n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("                <hr>\n");
      out.write("                <p>Total<span class=\"price\" style=\"color:black\"><b>");
out.println(total);
      out.write("/-</b></span></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
