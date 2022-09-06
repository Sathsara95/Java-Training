package com.invoice.customerinvoice.controller;

import com.invoice.customerinvoice.model.Customer;

import java.util.HashMap;
import java.util.Map;

public class DB {
    private Map<String, Customer> customer=new HashMap<>();


    public String add(Customer customer ){
        try {
            this.customer.put(customer.getCustomerID(), customer);
            return "Customer's bill processed";
        }catch(Exception e){
            return ""+e;
        }

    }

    public boolean already(String customerID){
        if(customer.containsKey(customerID)){
            return true;
        }else{return false;}
    }


    public Customer getCustomer(String CustomerID){
        return customer.get(CustomerID);
    }
}
