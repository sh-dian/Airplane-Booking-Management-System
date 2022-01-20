/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirplaneSystem;

/** 
 * @Group 8 
 * 1. SHARIFAH LYDIEANNA BT SYED SHAMSUDDIN (CB20050)
 * 2. NURUL ATIKAH BT FADZIL HALMI (CB20133)
 * 3. AHMAD HILMAN BIN AHMAD BADRUDDIN (CB20093)
 * 4. WAN MUHAMMAD DZULKHAIRIE BIN WAN ZAHARI (CB20096)
 * 5. HANIS SYAFIQA BT KHAIRIL AZLI (CB20106)
 */ 
public class AirplaneFactory {
    
    Airplane obj2 = null;
    AirplaneDetail obj = null;
    
    //Airplane name and code - interface class AirplaneDetail.java
    public AirplaneDetail getAirplaneDetail(int i, int a) {
        if(i == 1){
            obj = new AirAsia(i,a);
        }
        else if(i == 2){
            obj = new Mas(i,a);
        }
        else if(i == 3){
            obj = new Malindo(i,a);
        }
        else{
            System.out.println("Invalid Input");
        }
        
        return obj;
    }
    
    //Calculation price - Abstract class Airplane.java
    public Airplane getAirplane(int i, int a) {
        
        if(i == 1){
            obj2 = new AirAsia(i,a);
        }
        else if(i == 2){
            obj2 = new Mas(i,a);
        }
        else if(i == 3){
            obj2 = new Malindo(i,a);
        }
        else{
            System.out.println("Invalid Input");
        }
        
        return obj2;    
    }
    
}
