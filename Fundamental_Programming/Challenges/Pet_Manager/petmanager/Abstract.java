/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import clasepet.clsDoctor;
import clasepet.clsVeterinary;

/**
 *
 * @author camil
 */
public class Abstract {
    public static void main(String[] args) {
        clsDoctor doctor = new clsDoctor("Jane Doe", "123-456");
        clsVeterinary veterinary = new clsVeterinary("UdC Veterinary", "036 564 7854", "591 Grand Avenue", doctor);
        
        veterinary.setData(veterinary.getName() + "  " + veterinary.getAddress());
        
        String data = veterinary.getHospitalInf();
        String patient = veterinary.getPatientType();
        String surgery = veterinary.Surgery();
       
        System.out.println("Data: " + data);
        System.out.println("Patient: " + patient);
        System.out.println("surgery: " + surgery);
        
    }
    
}
