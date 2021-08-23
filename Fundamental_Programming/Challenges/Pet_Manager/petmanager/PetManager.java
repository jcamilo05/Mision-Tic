/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import clasepet.ClasePet;
import java.util.Date;
/**
 *
 * @author camil
 */
public class PetManager {
    
    public static void main(String[] args){
        
        ClasePet pet1 = new ClasePet("001","Firulais", 2018, "blanco", "sano" );
        ClasePet pet2 = new ClasePet("002","minino", 2018,"blanco y negro", "enfermo"); 
     
        Date current_date = new Date();
        int current_year = current_date.getYear();
        
        int agePet1 = current_year - pet1.getBornYear();
        int agePet2 = current_year - pet2.getBornYear();   
        
        if( agePet1 > agePet2){
            System.out.println("the pet " + pet1.getName() + " is older than pet " + pet2.getName());
        }else{
            if(agePet1 < agePet2){
                System.out.println("The pet: " + pet1.getName() + "Is younger than pet " + pet2.getName() );
            }else{
                System.out.println("Both Pets are the same age");
            }
        }
        
    }     
}
