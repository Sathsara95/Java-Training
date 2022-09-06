package com.invoice.customerinvoice.servlet;

import com.invoice.customerinvoice.controller.DB;
import com.invoice.customerinvoice.model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CustomerDetails", value = "/CustomerDetails")
public class CustomerDetails extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String InvoiceNO=request.getParameter("Invno");
        String CustomerName=request.getParameter("Cname");
        String CustomerID=request.getParameter("Cid");
        String CustomerTPNumber=request.getParameter("CtpNO");
        String CustomerAddress=request.getParameter("Caddress");
        String ItemDetails=request.getParameter("Itmdetail");
        String Price=request.getParameter("Tprice");


       // System.out.println(InvoiceNO);
       // System.out.println(CustomerAddress);

        ServletContext sc= request.getServletContext();
        if(sc.getAttribute("db")!=null){
            DB db=(DB)sc.getAttribute("db");
            if(db.already(CustomerID)==false){
                Customer customer=new Customer(InvoiceNO, CustomerName,CustomerID,CustomerTPNumber,CustomerAddress,ItemDetails,Price );
                String status=db.add(customer);
                System.out.println(status);

            }else{
                System.out.println("Already In the system");
            }
        }
    }
}
