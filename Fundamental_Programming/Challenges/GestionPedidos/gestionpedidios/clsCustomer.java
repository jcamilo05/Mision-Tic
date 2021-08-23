/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpedidios;

/**
 *
 * @author camil
 */
public class clsCustomer {
    private String customerCode;
    private String customerName;
    private String customerId;
    private String customerLastName;
    private String[] customerAddress = new String[4];
    private String[] customerTel = new String[2];
    private String customerEmail;
    private clsOrder order;
    
    public clsCustomer(String code, String name,String id, String lastName, String[] address, String[] tel, String email){
        this.customerCode = code;
        this.customerName = name;
        this.customerId = id;
        this.customerLastName = lastName;
        this.customerAddress = address;
        this.customerTel = tel;
        this.customerEmail = email;      
    }
    
        public clsCustomer(String code, String name,String id, String lastName, String[] address, String[] tel, String email, clsOrder order){
        this.customerCode = code;
        this.customerName = name;
        this.customerId = id;
        this.customerLastName = lastName;
        this.customerAddress = address;
        this.customerTel = tel;
        this.customerEmail = email; 
        this.order = order;
    }

    // getters and setters
    public String getCustomerCode() {
        return customerCode;
    }


    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    
    public String getCustomerName() {
        return customerName;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

 
    public String[] getCustomerAddress() {
        return customerAddress;
    }


    public void setCustomerAddress(String street, String num, String nhood,String city) {
        this.customerAddress[0] = street;
        this.customerAddress[1] = num;
        this.customerAddress[2] = nhood;
        this.customerAddress[3] = city;
    }


    public String[] getCustomerTel() {
        return customerTel;
    }

 
    public void setCustomerTel(String tel1, String tel2) {
        this.customerTel[0] = tel1;
        this.customerTel[1] = tel2;
    }


    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public clsOrder getOrder() {
        return order;
    }

    public void setOrder(clsOrder order) {
        this.order = order;
    }
    
}
