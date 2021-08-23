/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpedidios;

public class clsBill {
    
    private clsCustomer owner;
    private clsOrder order;
       
     public clsBill(clsCustomer owner, clsOrder order){
        this.owner = owner;
        this.order = order;
    }
    
// getters and setters
    
    public clsCustomer getOwner() {
        return owner;
    }

    public void setCustomer(clsCustomer owner) {
        this.owner = owner;
    }
     public clsOrder getOrder() {
        return order;
    }

    public void setOrder(clsOrder order) {
        this.order = order;
    }
}
