package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public final class Dog_005fResults_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"master.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"hp_dropdown.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            @import url(https://fonts.googleapis.com/css?family=Nunito:400,300,700);\n");
      out.write("* {\n");
      out.write("  -webkit-font-smoothing: antialiased;\n");
      out.write("  -moz-osx-font-smoothing: grayscale;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background-color: #4facaf;\n");
      out.write("  font-family: 'Nunito', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  padding: 20px;\n");
      out.write("  padding-top: 100px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write(".container .product {\n");
      out.write("  position: relative;\n");
      out.write("  overflow: hidden;\n");
      out.write("  width: 275px;\n");
      out.write("  height: 300px;\n");
      out.write("  display: inline-block;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  background-color: rgba(255, 255, 255, 0.45);\n");
      out.write("  margin: 20px;\n");
      out.write("  padding: 15px;\n");
      out.write("}\n");
      out.write(".container .product img {\n");
      out.write("  position: relative;\n");
      out.write("  top: -15px;\n");
      out.write("  left: -15px;\n");
      out.write("  transition: all .2s ease;\n");
      out.write("  -webkit-clip-path: polygon(0 100%, 0 0, 100% 0, 100% 70%);\n");
      out.write("          clip-path: polygon(0 100%, 0 0, 100% 0, 100% 70%);\n");
      out.write("  border-top-right-radius: 4px;\n");
      out.write("  border-top-left-radius: 4px;\n");
      out.write("}\n");
      out.write(".container .product img:hover {\n");
      out.write("  -webkit-clip-path: polygon(0 100%, 0 0, 100% 0, 100% 100%);\n");
      out.write("          clip-path: polygon(0 100%, 0 0, 100% 0, 100% 100%);\n");
      out.write("  -webkit-transform: scale(1.1);\n");
      out.write("          transform: scale(1.1);\n");
      out.write("}\n");
      out.write(".container .product h2 {\n");
      out.write("  text-align: left;\n");
      out.write("  color: #fff;\n");
      out.write("  font-size: 14px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  margin-bottom: 4px;\n");
      out.write("}\n");
      out.write(".container .product .description {\n");
      out.write("  text-align: left;\n");
      out.write("  font-size: 11px;\n");
      out.write("  color: #fff;\n");
      out.write("  max-height: 23px;\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write(".container .product .price {\n");
      out.write("  text-align: left;\n");
      out.write("  font-size: 18px;\n");
      out.write("  color: #fff;\n");
      out.write("  margin-top: 6px;\n");
      out.write("}\n");
      out.write(".container .product .btn {\n");
      out.write("  position: absolute;\n");
      out.write("  font-size: 11px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  float: right;\n");
      out.write("  padding: 10px;\n");
      out.write("  border: 2px solid #00fefe;\n");
      out.write("  border-radius: 20px;\n");
      out.write("  bottom: 10px;\n");
      out.write("  right: 10px;\n");
      out.write("  color: #00fefe;\n");
      out.write("  cursor: pointer;\n");
      out.write("  overflow: hidden;\n");
      out.write("  transition: all .2s ease;\n");
      out.write("}\n");
      out.write(".container .product .btn.ok {\n");
      out.write("  background-color: rgba(0, 254, 254, 0.4);\n");
      out.write("  color: #fff;\n");
      out.write("}\n");
      out.write(".container .product .btn.ok:after {\n");
      out.write("  content: \"\\e080\";\n");
      out.write("  color: #fff;\n");
      out.write("}\n");
      out.write(".container .product .btn:hover {\n");
      out.write("  padding-right: 25px;\n");
      out.write("}\n");
      out.write(".container .product .btn:hover:after {\n");
      out.write("  margin-left: 5px;\n");
      out.write("}\n");
      out.write(".container .product .btn:after {\n");
      out.write("  font-family: 'simple-line-icons';\n");
      out.write("  content: \"\\e095\";\n");
      out.write("  transition: all .2s ease;\n");
      out.write("  position: absolute;\n");
      out.write("  color: #00fefe;\n");
      out.write("  margin-left: 30px;\n");
      out.write("  transition: all .2s ease;\n");
      out.write("}\n");
      out.write(".container .product .quickview {\n");
      out.write("  position: absolute;\n");
      out.write("  bottom: 20px;\n");
      out.write("  font-size: 11px;\n");
      out.write("  color: #fff;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write(".container .product .quickview:before {\n");
      out.write("  font-family: 'simple-line-icons';\n");
      out.write("  content: \"\\e05d\";\n");
      out.write("  margin-right: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".quickviewContainer {\n");
      out.write("  position: fixed;\n");
      out.write("  height: 100vh;\n");
      out.write("  width: 400px;\n");
      out.write("  background: rgba(0, 0, 0, 0.9);\n");
      out.write("  top: 70px;\n");
      out.write("  right: -100%;\n");
      out.write("  transition: all .3s ease;\n");
      out.write("  padding: 30px;\n");
      out.write("  color: #fff;\n");
      out.write("}\n");
      out.write(".quickviewContainer .close {\n");
      out.write("  height: 20px;\n");
      out.write("  width: 20px;\n");
      out.write("  float: right;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write(".quickviewContainer .close:before, .quickviewContainer .close:after {\n");
      out.write("  content: \"\";\n");
      out.write("  position: absolute;\n");
      out.write("  width: 20px;\n");
      out.write("  height: 2px;\n");
      out.write("  background-color: #ffF;\n");
      out.write("  -webkit-transform: rotate(45deg);\n");
      out.write("          transform: rotate(45deg);\n");
      out.write("}\n");
      out.write(".quickviewContainer .close:after {\n");
      out.write("  -webkit-transform: rotate(-45deg);\n");
      out.write("          transform: rotate(-45deg);\n");
      out.write("}\n");
      out.write(".quickviewContainer .headline {\n");
      out.write("  margin-bottom: 30px;\n");
      out.write("  font-size: 18px;\n");
      out.write("}\n");
      out.write(".quickviewContainer .description {\n");
      out.write("  font-size: 12px;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("}\n");
      out.write(".quickviewContainer img {\n");
      out.write("  display: inline-block;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  margin: 5px;\n");
      out.write("}\n");
      out.write(".quickviewContainer.active {\n");
      out.write("  right: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("  .navbar {\n");
      out.write("  width : 100%;\n");
      out.write("  overflow: hidden;\n");
      out.write("  background: #333;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a {\n");
      out.write("    float: left;\n");
      out.write("    font-size: 16px;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("    float: left;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown .dropbtn {\n");
      out.write("    cursor: pointer;\n");
      out.write("    font-size: 16px;\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    background-color: inherit;\n");
      out.write("    font-family: inherit;\n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a:hover, .dropdown:hover .dropbtn, .dropbtn:focus {\n");
      out.write("    background-color: rgb(80, 97, 102);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    float: none;\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {\n");
      out.write("    background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".show {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write(".search{\n");
      out.write("  display: block;\n");
      out.write("  width : 260px;\n");
      out.write("  margin : 0 auto;\n");
      out.write("}\n");
      out.write("input,#sbutton{\n");
      out.write("  vertical-align: middle;\n");
      out.write("  padding : 14px 16px;\n");
      out.write("  float:left;\n");
      out.write("}\n");
      out.write("#sbutton{\n");
      out.write("  border : 2px solid rgba(0,0,0,0);\n");
      out.write("  cursor : pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".order\n");
      out.write("{\n");
      out.write("    background-color: green;\n");
      out.write("    color: white;\n");
      out.write("    padding: 15px 20px;\n");
      out.write("    margin: 8px 0px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 25%;\n");
      out.write("    opacity: 0.9;\n");
      out.write("    position: absolute;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"trial3.js\"></script>\n");
      out.write("      \n");
      out.write("    <div class=\"navbar\">\n");
      out.write("            <a href=\"home_page.html\">Home</a>\n");
      out.write("      \n");
      out.write("            <div class=\"dropdown\">\n");
      out.write("                <button class=\"dropbtn\" onclick=\"myFunction()\">Menu\n");
      out.write("                </button>\n");
      out.write("            \n");
      out.write("                <div class=\"dropdown-content\" id=\"myDropdown\">\n");
      out.write("                <a href=\"Cat_Results.jsp\">Cat</a>\n");
      out.write("                <a href=\"Dog_Results.jsp\">Dog</a>\n");
      out.write("                <a href=\"Fish_Results.jsp\">Fish</a>\n");
      out.write("                <a href=\"Horse_Results.jsp\">Horse</a>\n");
      out.write("                <a href=\"Bird_Results.jsp\">Birds</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"search\">\n");
      out.write("                <input type=\"text\" name=\"query\" placeholder=\"Search\">\n");
      out.write("                <button type=\"button\" name=\"searchq\" id=\"sbutton\"><i class=\"fas fa-search\"></i></button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("            <i class=\"fa fa-shopping-cart\" style=\"font-size:35px; color: white; float: right; direction: ltr; margin-right: 10px; margin-top: 7px\"></i>\n");
      out.write("            <a href=\"login.html\" style=\"position: relative; float: right;\">Login</a>\n");
      out.write("            <a href=\"Sign_up2.html\" style=\"position: relative; float: right;\">Sign up</a>\n");
      out.write("  \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <form name=\"formname\" action=\"addtocart_Dog\" method=\"get\">\n");
      out.write("  \n");
      out.write("        \n");
      out.write("  <div class='container'>\n");
      out.write("      ");

          //String table_name = request.getElementById("name").value;
    Connection conn = null;
    Statement stmt = null;
    
    Class.forName("org.apache.derby.jdbc.ClientDriver");
                
    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Petcetera ", "Sandhya", "Sandhya");
        
    stmt = conn.createStatement();
    
    String query = "select * from DOG_PRODUCTS";
    
    ResultSet rs = stmt.executeQuery(query);
        
    while(rs.next())
    {
        String pname = rs.getString("NAME");
        int price = rs.getInt("PRICE");
        String descr = rs.getString("DESCRIPTION");
        String pid = rs.getString("ID");
        
      out.write("\n");
      out.write("        <div class='product'>\n");
      out.write("      <img src='https://placeimg.com/200/100'>\n");
      out.write("      <h2 class='header'>");
out.print(pname);
      out.write("</h2>\n");
      out.write("      <!--<p>");
out.print(pid);
      out.write("</p>-->\n");
      out.write("      <p class='description'>");
out.print(descr);
      out.write("</p>\n");
      out.write("      <p class='price'>");
out.print(price);
      out.write("</p>\n");
      out.write("      <!--<input type=\"hidden\" name=\"order\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"");
      out.print(pid);
      out.write("\">\n");
      out.write("      <div class='btn'><input type=\"submit\" name=\"\" value=\"Add to cart\" onclick=\"MyFunc(pid)\"></div>-->\n");
      out.write("      \n");
      out.write("      <p><input type=\"checkbox\" name=\"order\" value=\"");
      out.print(pid);
      out.write("\">ORDER</p>\n");
      out.write("    </div>\n");
      out.write("      ");

          }
      
      out.write("\n");
      out.write("      \n");
      out.write("      <input class=\"order\" type=\"submit\" value=\"ADD TO CART\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("        </form>\n");
      out.write("      \n");
      out.write("      <script>\n");
      out.write("          function MyFunc(pid)\n");
      out.write("          {\n");
      out.write("              var x = document.getElementsByTagName(\"input\")[1].getAttribute(\"name\"); \n");
      out.write("              document.formname.key.value = x;\n");
      out.write("              document.formname.submit();\n");
      out.write("          }\n");
      out.write("      </script>\n");
      out.write("  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
