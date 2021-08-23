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
public class clsDog extends ClasePet{
    
    private String breed;
    private boolean pedigree;
    
    public clsDog(String code, String name, int born_year, String color, String healthStatus,String breed,boolean pedigree){
        super(code, name, born_year, color, healthStatus);
        this.breed = breed;
        this.pedigree = pedigree;
    }

    @Override
    public void Sound(){
        System.out.println("The cat " + super.getName() + " is barking");
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String newBreed){
        this.breed = newBreed;
    }
    
    public boolean getPedrigree(){
        return pedigree;
    }
    
    public void setPedigree(boolean answer){
        this.pedigree = answer;
    }
    
    public void walkAround(){
        System.out.println("The dog " + super.getName() + " is walking");
    } 
}
