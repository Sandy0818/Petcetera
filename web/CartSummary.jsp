<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--<link rel="stylesheet" type="text/css" media="screen" href="Style_checkout.css">-->
    <style>
        *
{
    box-sizing: border-box;
}

.row {
    display: -ms-flexbox; /* IE10 */
    display: flex;
    -ms-flex-wrap: wrap; /* IE10 */
    flex-wrap: wrap;
    margin: 0 -16px;
  }
  
  .col-25 {
    -ms-flex: 25%; /* IE10 */
    flex: 25%;
  }
  
  .col-50 {
    -ms-flex: 50%; /* IE10 */
    flex: 50%;
  }
  
  .col-75 {
    -ms-flex: 75%; /* IE10 */
    flex: 75%;
  }
  
  .col-25,
  .col-50,
  .col-75 {
    padding: 0 16px;
  }
  
  .container {
    background-color: #f2f2f2;
    padding: 5px 20px 15px 20px;
    border: 1px solid lightgrey;
    border-radius: 3px;
  }
  
  input[type=text] {
    width: 100%;
    margin-bottom: 20px;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 3px;
  }
  
  label {
    margin-bottom: 10px;
    display: block;
  }
  
  .icon-container {
    margin-bottom: 20px;
    padding: 7px 0;
    font-size: 24px;
  }
  
  .btn {
    background-color: #4CAF50;
    color: white;
    padding: 12px;
    margin: 10px 0;
    border: none;
    width: 50%;
    border-radius: 3px;
    cursor: pointer;
    font-size: 17px;
  }
  
  .btn:hover {
    background-color: #45a049;
  }
  
  span.price {
    float: right;
    color: grey;
  }
  
  /* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (and change the direction - make the "cart" column go on top) */
  @media (max-width: 800px) {
    .row {
      flex-direction: column-reverse;
    }
    .col-25 {
      margin-bottom: 20px;
    }
  }
    </style>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
</head>
<body>
    <div class="row">
        <div class="col-50">
            <div class="container">
                <form action="PaymentConfirm.html">

                    <div class="row">
                        <div class="col-25">    <!--Changed-->
                            <h3>Billing Address</h3>

                            <label for="fname"><i class="fa fa-user"></i>Full Name</label>
                            <input type="text" id="fname" name="firstname" placeholder="full name">

                            <label for="email"><i class="fa fa-envolope"></i>Email</label>
                            <input type="text" id="email" placeholder="Email">

                            <label for="adr"><i class="fa fa-address-card-o"></i>Address</label>
                            <input type="text" id="adr" name="address" placeholder="Enter Address">

                            <label for="city"><i class="fa fa-institutions"></i>City</label>
                            <input type="text" id="city" name="city" placeholder="Enter City">

                            <div class="row">
                                <div class="col-50">
                                    <label for="state">State</label>
                                    <input type="text" id="state" name="state" placeholder="Enter State">
                                </div>

                                <div class="col-50">
                                    <label for="pin">PIN</label>
                                    <input type="text" id="pin" name="pin" placeholder="Enter PIN">
                                </div>
                            </div>
                        </div>

                        <div  class="col-25">
                            <h3>Payment</h3>
                            <label for="fname">Accepted Cards</label>
                            <div class="icon-container">
                                <i class="fa fa-cc-visa" style="color:navy"></i>
                                <i class="fa fa-cc-mastercard" style="color:red"></i>
                                
                            </div>

                            <label for="cname">Name on Card</label>
                            <input type="text" id="cname" name="cardname" placeholder="Enter Name">

                            <label for="ccnum">Credit Card Number</label>
                            <input type="text" id="ccnum" name="cardnumber" placeholder="Enter Cardnumber">

                            <label for="expmonth">Exp Month</label>
                            <input type="text" id="expmonth" name="expmonth" placeholder="Enter Expiry Month">

                            <div class="row">
                                <div class="col-50">
                                    <label for="expyr">Exp Year</label>
                                    <input type="text" id="expyr" name="expyr" placeholder="Enter Expiry Year">
                                </div>

                                <div class="col-50">
                                    <label for="cvv">CVV</label>
                                    <input type="text" id="cvv" name="cvv" placeholder="Enter CVV">
                                </div>
                            </div>
                        </div>
                    </div>
                    <label>
                        <input type="checkbox" checked="checked" name="sameadr">Shipping address same as billing                        
                    </label>          
                    
                    <input type="submit" value="Confirm Payment" class="btn">
                    
                </form>
            </div>
        </div>
        
        <%
                    Connection con;
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    con = DriverManager.getConnection("jdbc:derby://localhost:1527/Petcetera", "Sandhya", "Sandhya");
                    
                    Statement stmt = con.createStatement();
                    String query = "select count(*) from orders";
                    //ResultSet rs = new ResultSet("TYPE_SCROLL_INSENSITIVE");
                    ResultSet rs = stmt.executeQuery(query);
                    //int cnt = 0;
                    //cnt = rs.getInt("rowcount");
                    //rs.last();
                    //int cnt = rs.getRow();
        %>

        <div class="col-25">
            <div class="container">
                <h4>
                    Cart
                    <span class="price" style="color:black">
                        <i class="fa fa-shopping-cart"></i>
                        <!--<b><%//out.println(cnt);%></b>Item count-->
                    </span>
                </h4>
                
                <%
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
                        //cnt++;
                        total += price;
                    
                    
                %>
                <!--List of items-->
                <p><%out.println(p_name);%><span class="price"><%out.println(price);%>/-</span></p>
                <!--<p>Product 2 Name<span class="price">499/-</span></p>
                <p>Product 3 Name<span class="price">999/-</span></p>-->
                
                <%
                    }
                %>

                <hr>
                <p>Total<span class="price" style="color:black"><b><%out.println(total);%>/-</b></span></p>
            </div>
        </div>
    </div>
</body>
</html>