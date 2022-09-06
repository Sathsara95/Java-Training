<%@ page import="com.invoice.customerinvoice.model.Customer" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 9/6/2022
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    Customer customer = (Customer) application.getAttribute("customer");

%>




<html>
<head>
    <title>Billing Details</title>
</head>
<body>
<div class="container" style="align-content: center; margin-top: 200px; margin-left:20% ; border: solid black; width: 500px; padding: 10px;">

    <form action="" >
        <label for="">Invoice Number : </label>
        <label type="text" > <% customer.getInvoiceNO();%> </label>
        <br> <br>

        <label for="">Date</label>
        <input type="date" name="date">
        <br><br>


        <label for="">Customer Name : </label>
        <label type="text" > <% customer.getCustomerName();%> </label>
        <br> <br>

        <label for="">Customer Id number : </label>
        <label type="text" > <% customer.getCustomerID();%> </label>
        <br> <br>

        <label for="">Customer Telephone Number : </label>
        <label type="text" > <% customer.getCustomerTPNumber();%> </label>
        <br> <br>

        <label for="">Customer Address : </label>
        <label type="text" > <% customer.getCustomerAddress();%> </label>
        <br> <br>

        <label for="">Item details : </label> <br>
        <label type="text" > <% customer.getItemDetails();%> </label>
        <label type="text" > <% customer.getPrice();%> </label>
        <br><br>

        <input type="submit" value="submit">



    </form>

</div>
</body>
</html>
