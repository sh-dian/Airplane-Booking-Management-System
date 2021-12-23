/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirplaneSystem;

/**
 *
 * @author User
 */
public class Malindo extends Airplane{
    private int AirplaneCode;
    
    Malindo(){
        super();
        AirplaneCode = 0;
    }
    
    @Override
    public void AirplaneCode() {
        System.out.println("Airplane Type: Malindo");
            
            if(getAirplaneCode() == 1){
                System.out.println("Airplane Code: MAS78");
            }
            else{
                System.out.println("Airplane Code: MD157");
            }
    }

    /**
     * @return the AirplaneCode
     */
    public int getAirplaneCode() {
        return AirplaneCode;
    }

    /**
     * @param AirplaneCode the AirplaneCode to set
     */
    public void setAirplaneCode(int AirplaneCode) {
        this.AirplaneCode = AirplaneCode;
    }
    
}