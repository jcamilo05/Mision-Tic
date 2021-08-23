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
public class clsDoctor {
    
    private String name;
    private String license;

    public clsDoctor(String name, String license){
        this.name = name;
        this.license = license;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getLicense(){
        return license;
    }
    public void setLicense(String newLicense){
        this.license = newLicense;
    }
}

