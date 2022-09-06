package com.invoice.customerinvoice.servlet;

import com.invoice.customerinvoice.controller.DB;
import com.invoice.customerinvoice.model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CustomerBill", value = "/CustomerBill")
public class CustomerBill extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc= request.getServletContext();
        DB db=null;
        if(sc.getAttribute("db")!=null) {
             db = (DB) sc.getAttribute("db");
        }
        Customer customer=db.getCustomer("");
        sc.setAttribute("Customer", customer);

    }
}
