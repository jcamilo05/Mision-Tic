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
public class clsCat extends ClasePet{
    private String breed;
    
    public clsCat(String code, String name, int born_year,String color, String healthStatus,String breed){
        super(code, name, born_year,color, healthStatus);
        this.breed = breed;
    }
    
    @Override
    public void Sound(){
        System.out.println("The cat " + super.getName() + " is making miaow");   
    }
    
    @Override
    public int getNumberBones(){
        return 206;
    }
    
    @Override
    public String getAnimalType(){
        return "cat";
    }
            
    public String getBreed(){
        return breed;
    }
    public void setBreed(String newBreed){
        this.breed = newBreed;
    }   
    
    public void SelfCleaning(){
        System.out.println("The Cat is cleaning");
        
    }
    
    public void selfcleaning(){
        System.out.println("The cat "+ super.getName() + " is self cleaning");
    }
}

