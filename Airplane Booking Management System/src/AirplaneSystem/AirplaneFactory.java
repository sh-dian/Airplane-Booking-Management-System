/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirplaneSystem;

/**
 *
 * @author User
 */
public class AirplaneFactory {
    
    //Airplane name and code
    public AirplaneDetail getAirplaneDetail(int i) {
        
        AirplaneDetail obj = null;
        
        if(i == 1){
            obj = new AirAsia(i);
        }
        else if(i == 2){
            obj = new Mas(i);
        }
        else if(i == 3){
            obj = new Malindo(i);
        }
        else{
            System.out.println("Invalid Input");
        }
        
        return obj;
    }
    
    //Calculation price
    public Airplane getAirplane(int i) {
        Airplane obj2 = null;
        
        if(i == 1){
            obj2 = new AirAsia(i);
        }
        else if(i == 2){
            obj2 = new Mas(i);
        }
        else if(i == 3){
            obj2 = new Malindo(i);
        }
        else{
            System.out.println("Invalid Input");
        }
        
        return obj2;    
    }
}
