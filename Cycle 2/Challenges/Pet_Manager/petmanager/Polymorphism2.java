/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import clasepet.clsCat;
import clasepet.clsDog;

/**
 *
 * @author camil
 */
public class Polymorphism2 {
    public static void main(String[] args) {
        clsDog dog1 = new clsDog("001","Firulais", 2018, "blanco", "sano", "criollo",false);
        clsCat cat1 = new clsCat("002","minino", 2018,"blanco y negro", "enfermo", "angora");
     
        dog1.Sound();
        cat1.Sound();
    }
}
