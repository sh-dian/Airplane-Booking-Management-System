/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirplaneSystem;

/**
 *
 * @author User
 */
public class FirstClass extends Ticket{
    private int seatNum;
    
    FirstClass(){
        super();
        seatNum = 0;
    }
    
    void Seat(){
        System.out.println("Choose your seat 1 - 25: ");
    }

    /**
     * @return the seatNum
     */
    public int getSeatNum() {
        return seatNum;
    }

    /**
     * @param seatNum the seatNum to set
     */
    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }
}
