/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import clasepet.clsDog;

/**
 *
 * @author camil
 */
public class test {
    public static void main(String[] args) {
        clsDog dog1 = new clsDog("001", "Firulais",2020, "Brown", "Health","Criollo",false);
        System.out.println("The pet's name is: " + dog1.getName());
    }
}
