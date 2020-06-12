<%-- 
    Document   : search_result2
    Created on : 12 Nov, 2018, 10:04:15 AM
    Author     : Sandhya 
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link rel="stylesheet" href="master.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script type="text/javascript" src="hp_dropdown.js"></script>
        <style>
            @import url(https://fonts.googleapis.com/css?family=Nunito:400,300,700);
* {
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  box-sizing: border-box;
}

body {
  background-color: #4facaf;
  font-family: 'Nunito', sans-serif;
}

.container {
  padding: 20px;
  padding-top: 100px;
  text-align: center;
}
.container .product {
  position: relative;
  overflow: hidden;
  width: 275px;
  height: 300px;
  display: inline-block;
  border-radius: 4px;
  background-color: rgba(255, 255, 255, 0.45);
  margin: 20px;
  padding: 15px;
}
.container .product img {
  position: relative;
  top: -15px;
  left: -15px;
  transition: all .2s ease;
  -webkit-clip-path: polygon(0 100%, 0 0, 100% 0, 100% 70%);
          clip-path: polygon(0 100%, 0 0, 100% 0, 100% 70%);
  border-top-right-radius: 4px;
  border-top-left-radius: 4px;
  width: 200px;
  height: 100px;
}
.container .product img:hover {
  -webkit-clip-path: polygon(0 100%, 0 0, 100% 0, 100% 100%);
          clip-path: polygon(0 100%, 0 0, 100% 0, 100% 100%);
  -webkit-transform: scale(1.1);
          transform: scale(1.1);
}
.container .product h2 {
  text-align: left;
  color: #fff;
  font-size: 14px;
  font-weight: bold;
  margin-bottom: 4px;
}
.container .product .description {
  text-align: left;
  font-size: 11px;
  color: #fff;
  max-height: 23px;
  overflow: hidden;
}
.container .product .price {
  text-align: left;
  font-size: 18px;
  color: #fff;
  margin-top: 6px;
}
.container .product .btn {
  position: absolute;
  font-size: 11px;
  font-weight: bold;
  float: right;
  padding: 10px;
  border: 2px solid #00fefe;
  border-radius: 20px;
  bottom: 10px;
  right: 10px;
  color: #00fefe;
  cursor: pointer;
  overflow: hidden;
  transition: all .2s ease;
}
.container .product .btn.ok {
  background-color: rgba(0, 254, 254, 0.4);
  color: #fff;
}
.container .product .btn.ok:after {
  content: "\e080";
  color: #fff;
}
.container .product .btn:hover {
  padding-right: 25px;
}
.container .product .btn:hover:after {
  margin-left: 5px;
}
.container .product .btn:after {
  font-family: 'simple-line-icons';
  content: "\e095";
  transition: all .2s ease;
  position: absolute;
  color: #00fefe;
  margin-left: 30px;
  transition: all .2s ease;
}
.container .product .quickview {
  position: absolute;
  bottom: 20px;
  font-size: 11px;
  color: #fff;
  cursor: pointer;
}
.container .product .quickview:before {
  font-family: 'simple-line-icons';
  content: "\e05d";
  margin-right: 3px;
}

.quickviewContainer {
  position: fixed;
  height: 100vh;
  width: 400px;
  background: rgba(0, 0, 0, 0.9);
  top: 70px;
  right: -100%;
  transition: all .3s ease;
  padding: 30px;
  color: #fff;
}
.quickviewContainer .close {
  height: 20px;
  width: 20px;
  float: right;
  cursor: pointer;
}
.quickviewContainer .close:before, .quickviewContainer .close:after {
  content: "";
  position: absolute;
  width: 20px;
  height: 2px;
  background-color: #ffF;
  -webkit-transform: rotate(45deg);
          transform: rotate(45deg);
}
.quickviewContainer .close:after {
  -webkit-transform: rotate(-45deg);
          transform: rotate(-45deg);
}
.quickviewContainer .headline {
  margin-bottom: 30px;
  font-size: 18px;
}
.quickviewContainer .description {
  font-size: 12px;
  margin-bottom: 20px;
}
.quickviewContainer img {
  display: inline-block;
  border-radius: 4px;
  margin: 5px;
}
.quickviewContainer.active {
  right: 0;
}

  .navbar {
  width : 100%;
  overflow: hidden;
  background: #333;
  font-family: Arial, Helvetica, sans-serif;
}

.navbar a {
    float: left;
    font-size: 16px;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

.dropdown {
    float: left;
    overflow: hidden;
}

.dropdown .dropbtn {
    cursor: pointer;
    font-size: 16px;
    border: none;
    outline: none;
    color: white;
    padding: 14px 16px;
    background-color: inherit;
    font-family: inherit;
    margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn, .dropbtn:focus {
    background-color: rgb(80, 97, 102);
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    float: none;
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {
    background-color: #ddd;
}

.show {
    display: block;
}
.search{
  display: block;
  width : 260px;
  margin : 0 auto;
}
input,#sbutton{
  vertical-align: middle;
  padding : 14px 16px;
  float:left;
}
#sbutton{
  border : 2px solid rgba(0,0,0,0);
  cursor : pointer;
}

.order
{
    background-color: green;
    color: white;
    padding: 15px 20px;
    margin: 8px 0px;
    border: none;
    cursor: pointer;
    width: 25%;
    opacity: 0.9;
    position: absolute;
    
}

        </style>
    </head>
    <body>
        <script src="trial3.js"></script>
      
    <div class="navbar">
            <a href="home_page.html">Home</a>
      
            <div class="dropdown">
                <button class="dropbtn" onclick="myFunction()">Menu
                </button>
            
                <div class="dropdown-content" id="myDropdown">
                <a href="Cat_Results.jsp">Cat</a>
                <a href="Dog_Results.jsp">Dog</a>
                <a href="Fish_Results.jsp">Fish</a>
                <a href="Horse_Results.jsp">Horse</a>
                <a href="Bird_Results.jsp">Birds</a>
                </div>
            </div>
            
            <!--<div class="search">
                <input type="text" name="query" placeholder="Search">
                <button type="button" name="searchq" id="sbutton"><i class="fas fa-search"></i></button>
            </div>-->

  
            <a href="CartSummary.jsp" class="fa fa-shopping-cart" style="font-size:35px; color: white; float: right; direction: ltr; margin-right: 10px; margin-top: 7px"></a>
            <a href="Login_pg.html" style="position: relative; float: right;">Login</a>
            <a href="Sign_in2.html" style="position: relative; float: right;">Sign up</a>
  
        </div>
        
        <form name="formname" action="addtocart_Dog" method="get">
  
        
  <div class='container'>
      <%
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
        String imgsrc = "Dog_images/" + rs.getString("IMAGE");
        %>
        <div class='product'>
      <img src='<%=imgsrc%>'>
      <h2 class='header'><%out.print(pname);%></h2>
      <!--<p><%out.print(pid);%></p>-->
      <p class='description'><%out.print(descr);%></p>
      <p class='price'>₹<%out.print(price);%></p>
      <!--<input type="hidden" name="order" value="${pid}" id="<%=pid%>">
      <div class='btn'><input type="submit" name="" value="Add to cart" onclick="MyFunc(pid)"></div>-->
      
      <p><input type="checkbox" name="order" value="<%=pid%>">ORDER</p>
    </div>
      <%
          }
      %>
      
      <input class="order" type="submit" value="ADD TO CART">
    
  </div>
        </form>
      
      <script>
          function MyFunc(pid)
          {
              var x = document.getElementsByTagName("input")[1].getAttribute("name"); 
              document.formname.key.value = x;
              document.formname.submit();
          }
      </script>
  
    </body>
</html>
