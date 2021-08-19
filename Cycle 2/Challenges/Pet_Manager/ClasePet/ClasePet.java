/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasepet;

import Interfaces.*;



/**
 *
 * @author camil
 */
public class ClasePet implements IAnimal, IVertebrate {
    
    private String code;  //Private the code is only accessible within the clasepet 
    private String name;
    private int born_year;
    private String color;
    private String healthStatus; 
    private clsVeterinary veterinary;

    public ClasePet(String code, String name, int born_year, String color, String healthStatus){
        this.code = code;
        this.name = name;
        this.born_year = born_year;
        this.color = color;
        this.healthStatus = healthStatus;
        
    }
    
    public String getCode (){
        return code;
    }
    public void setCode(String newCode){
        this.code = newCode;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int getBornYear(){
        return born_year;
    }
    public void setBornYear (int newBornYear){
        this.born_year = newBornYear;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public String getHealthStatus(){
        return healthStatus;
    }
    public void setHealthStatus(String newHealthStatus){
        this.healthStatus = newHealthStatus;
    }
    
    public clsVeterinary getVeterinary(){
        return veterinary;
    }
    
    public void setVeterinary(clsVeterinary veterinary){
        this.veterinary = veterinary;
    }
    
     public void Sound(){
         System.out.println("The pet " + this.name + " is making a sound");
     }
     
     public void Eat(){
         System.out.println("The pet " + this.name + " is eating");
     }
     
     public void Move(){
         System.out.println("The pet " + this.name + " is moving");
     }

    @Override
    public String getAnimalType() {
        return "Domestic";
    }

    @Override
    public int getNumberBones() {
       return 0;
    }
}
