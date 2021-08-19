/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import clasepet.*;

/**
 *
 * @author camil
 */
public class Polymorphism {
    public static void main(String[] args){
        
        clsDog dog1 = new clsDog("001","Firulais", 2018, "blanco", "sano", "criollo",false);
        clsCat cat1 = new clsCat("002","minino", 2018,"blanco y negro", "enfermo", "angora");
        
        clsDoctor doctor = new clsDoctor("Jane Doe", "123-456");
        clsVeterinary veterinary;
        veterinary = new clsVeterinary("UdC Veterinary", "036 564 7854", "591 Grand Avenue", doctor);
        
        String caredog = veterinary.PetCare(dog1);
        System.out.println("The health status of " + dog1.getName() + " is " + dog1.getHealthStatus());
        
        String carecat = veterinary.PetCare(cat1);
        System.out.println("The health status of " + cat1.getName() + " is " + dog1.getHealthStatus());
        
    }
    
}
