<%@ page import="com.invoice.customerinvoice.controller.DB" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<%
    if(application.getAttribute("db")==null) {
        DB db = new DB();
        application.setAttribute("db", db);
    }

%>



<!DOCTYPE html>
<html>
<head>
    <title>Invoice-Billing details</title>
</head>
<body>

<!-- -------------------Main Wrrapper------------------------------->
<div class="container" style="align-content: center; margin-top: 200px; margin-left:20% ; border: solid black; width: 500px; padding: 10px;">

    <form action="CustomerDetails" method="POST" >
        <label for="">Invoice Number : </label>
        <input type="text" name="Invno" placeholder="Invoice Number">
        <br> <br>

        <label for="">Date</label>
        <input type="date" name="date">
        <br><br>


        <label for="">Customer Name : </label>
        <input type="text" name="Cname" placeholder="Customer Full name">
        <br> <br>

        <label for="">Customer Id number : </label>
        <input type="text" name="Cid" placeholder="ID number">
        <br> <br>

        <label for="">Customer Telephone Number : </label>
        <input type="text" name="CtpNO" placeholder="telephone number">
        <br> <br>

        <label for="">Customer Address : </label>
        <input type="text" name="Caddress" placeholder="Address">
        <br> <br>

        <label for="">Item details : </label> <br>
        <input type="text" name="Itmdetail" placeholder="Item details">
        <input type="text" name="Tprice" placeholder="Total price">
        <br><br>

        <input type="submit" value="submit">



    </form>

</div>



</body>
</html>
