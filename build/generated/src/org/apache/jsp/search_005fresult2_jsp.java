package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public final class search_005fresult2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            @import url(https://fonts.googleapis.com/css?family=Nunito:400,300,700);\n");
      out.write("* {\n");
      out.write("  -webkit-font-smoothing: antialiased;\n");
      out.write("  -moz-osx-font-smoothing: grayscale;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background-color: #0b0b0b;\n");
      out.write("  font-family: 'Nunito', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav {\n");
      out.write("  position: fixed;\n");
      out.write("  z-index: 999;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 70px;\n");
      out.write("  background-color: #ffffff;\n");
      out.write("  line-height: 70px;\n");
      out.write("}\n");
      out.write("nav .mini {\n");
      out.write("  position: fixed;\n");
      out.write("  top: 80px;\n");
      out.write("  right: 10px;\n");
      out.write("  background: #FFF;\n");
      out.write("  padding: 40px;\n");
      out.write("  opacity: 0;\n");
      out.write("  visibility: hidden;\n");
      out.write("  transition: opacity .2s ease .2s;\n");
      out.write("}\n");
      out.write("nav .mini.visible {\n");
      out.write("  padding: 40px;\n");
      out.write("  opacity: 1;\n");
      out.write("  visibility: visible;\n");
      out.write("}\n");
      out.write("nav .mini .products {\n");
      out.write("  font-weight: bold;\n");
      out.write("  font-size: 14px;\n");
      out.write("}\n");
      out.write("nav .mini p {\n");
      out.write("  font-size: 11px;\n");
      out.write("  display: block;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  line-height: 20px;\n");
      out.write("}\n");
      out.write("nav .cart {\n");
      out.write("  position: relative;\n");
      out.write("  float: right;\n");
      out.write("  margin-right: 50px;\n");
      out.write("  height: 20px;\n");
      out.write("  line-height: 70px;\n");
      out.write("  font-size: 28px;\n");
      out.write("  height: 100%;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("nav .cart span {\n");
      out.write("  height: 100%;\n");
      out.write("  float: left;\n");
      out.write("  margin-right: 20px;\n");
      out.write("  opacity: 1;\n");
      out.write("  color: #fff;\n");
      out.write("  font-size: 18px;\n");
      out.write("  font-family: 'Nunito', sans-serif;\n");
      out.write("}\n");
      out.write("nav .cart span.updateQuantity:before, nav .cart span.updateQuantity:after {\n");
      out.write("  top: 0;\n");
      out.write("  bottom: 0;\n");
      out.write("  opacity: 1;\n");
      out.write("  width: 30px;\n");
      out.write("  transition: all .2s ease, top .3s ease .4s, bottom .3s ease .4s;\n");
      out.write("}\n");
      out.write("nav .cart span.update {\n");
      out.write("  transition: color .2s ease .6s;\n");
      out.write("  color: #000;\n");
      out.write("}\n");
      out.write("nav .cart span.update:before {\n");
      out.write("  top: -30px;\n");
      out.write("  width: 30px;\n");
      out.write("  opacity: 1;\n");
      out.write("  transition: all .2s ease, top .3s ease .4s, bottom .3s ease .4s;\n");
      out.write("}\n");
      out.write("nav .cart span.update:after {\n");
      out.write("  top: 30px;\n");
      out.write("  width: 30px;\n");
      out.write("  opacity: 1;\n");
      out.write("  transition: all .2s ease, top .3s ease .4s, bottom .3s ease .4s;\n");
      out.write("}\n");
      out.write("nav .cart span:before, nav .cart span:after {\n");
      out.write("  content: \"\";\n");
      out.write("  position: absolute;\n");
      out.write("  width: 0px;\n");
      out.write("  height: 2px;\n");
      out.write("  background-color: #0b0b0b;\n");
      out.write("  left: -10px;\n");
      out.write("  right: 40px;\n");
      out.write("  top: 2px;\n");
      out.write("  bottom: 0;\n");
      out.write("  margin: auto;\n");
      out.write("}\n");
      out.write("nav ul {\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("nav ul li {\n");
      out.write("  font-weight: bold;\n");
      out.write("  display: inline-block;\n");
      out.write("  margin-left: 50px;\n");
      out.write("  color: #0b0b0b;\n");
      out.write("  font-size: 12px;\n");
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
      out.write("  width: 200px;\n");
      out.write("  height: 240px;\n");
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
      out.write("  text-align: right;\n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"trial3.js\"></script>\n");
      out.write("        <nav>\n");
      out.write("    <div class='mini'>\n");
      out.write("      <p class='products'>Empty</p>\n");
      out.write("      <p class='names'></p>\n");
      out.write("      <p class='miniprice'></p>\n");
      out.write("    </div>\n");
      out.write("    <ul>\n");
      out.write("      <li>Home</li>\n");
      out.write("      <li>Menu</li>\n");
      out.write("    </ul>\n");
      out.write("    <div class='cart icon-basket'>\n");
      out.write("      <span class='number'>1</span>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("        \n");
      out.write("  <div class='container'>\n");
      out.write("      ");

    Connection conn = null;
    Statement stmt = null;
    
    Class.forName("org.apache.derby.jdbc.ClientDriver");
                
    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Petcetera ", "Sandhya", "Sandhya");
        
    stmt = conn.createStatement();
    
    String query = "select * from PRODUCTS";
    
    ResultSet rs = stmt.executeQuery(query);
    
    
    while(rs.next())
    {
        String pname = rs.getString("PRODUCT_NAME");
        int price = rs.getInt("PRICE");
        String descr = rs.getString("DESCR");
        
      out.write("\n");
      out.write("    <div class='product'>\n");
      out.write("      <img src='https://placeimg.com/200/100'>\n");
      out.write("      <h2 class='header'>");
out.print(pname);
      out.write("</h2>\n");
      out.write("      <p class='description'>");
out.print(descr);
      out.write("</p>\n");
      out.write("      <p class='price'>");
out.print(price);
      out.write("</p>\n");
      out.write("    </div>\n");
      out.write("      ");

          }
      
      out.write("\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("  <div class='quickviewContainer'>\n");
      out.write("    <div class='close'></div>\n");
      out.write("    <h2 class='headline'></h2>\n");
      out.write("    <p class='description'></p>\n");
      out.write("    <img src='https://placeimg.com/100/100'>\n");
      out.write("    <img src='https://placeimg.com/100/100'>\n");
      out.write("    <img src='https://placeimg.com/100/100'>\n");
      out.write("  </div>\n");
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
