package com.invoice.customerinvoice.model;

public class Customer {

    private String InvoiceNO;
    private String CustomerName;
    private String CustomerID;
    private String CustomerTPNumber;
    private String CustomerAddress;
    private String ItemDetails;
    private String Price;

    public Customer() {
    }

    public Customer(String invoiceNO, String customerName, String customerID, String customerTPNumber, String customerAddress, String itemDetails, String price) {
        InvoiceNO = invoiceNO;
        CustomerName = customerName;
        CustomerID = customerID;
        CustomerTPNumber = customerTPNumber;
        CustomerAddress = customerAddress;
        ItemDetails = itemDetails;
        Price = price;
    }

    public String getInvoiceNO() {
        return InvoiceNO;
    }

    public void setInvoiceNO(String invoiceNO) {
        InvoiceNO = invoiceNO;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getCustomerTPNumber() {
        return CustomerTPNumber;
    }

    public void setCustomerTPNumber(String customerTPNumber) {
        CustomerTPNumber = customerTPNumber;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public String getItemDetails() {
        return ItemDetails;
    }

    public void setItemDetails(String itemDetails) {
        ItemDetails = itemDetails;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
