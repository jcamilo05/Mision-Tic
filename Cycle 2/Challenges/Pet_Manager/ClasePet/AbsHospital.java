/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasepet;

/**
 *
 * @author camil
 */
public abstract class AbsHospital {

    private String data;
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public abstract String getPatientType();
    public abstract String Surgery();
    
    public String getHospitalInf(){
        return "The information is: " + this.getData();
    }
    
    
}
