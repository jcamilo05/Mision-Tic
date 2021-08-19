/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpedidios;

import java.util.ArrayList;

/**
 *
 * @author camil
 */
public class clsOrder {
    private String orderDate;
    private clsCustomer customer;
    private String[] productList;
    
    public clsOrder(String date, clsCustomer customer){
        
           this.orderDate = date;
           this.customer = customer;
           this.productList =  new String[0];
    }
    
// Getter and setter orderDate
    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

// getter and setter productList
    public String[] getProductList() {
        return productList;
    }

    public void setProductList(String[] products) {
        this.productList = products  ;
    }   

    public clsCustomer getCustomer() {
        return customer;
    }
    
    public void setCustomer(clsCustomer customer) {
        this.customer = customer;
    }
}
