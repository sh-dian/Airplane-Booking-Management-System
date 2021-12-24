/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirplaneSystem;

/**
 *
 * @author User
 */
import java.util.Scanner; 
public class BusinessClass extends Ticket{
    private int seatNum;
    public int min;
    public int max;
    public int random_int;
    public int choice;
    
    Scanner input = new Scanner (System.in); 
    
    BusinessClass(){
        super();
        seatNum = 0;
        min = 1;
        max = 50;
    }
    
    void Random(){
        System.out.println("Thankyou for Choosing Business Class!");
        System.out.println("Do you want to 1- choose your seat (extra fee) / 2 - random seat");
        choice = input.nextInt();
        
        if(choice == 1){
            
        }
        else{
            //Generate random int value from 1 to 50 
            random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
    }
    
    void Seat(){
      System.out.println(random_int);
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

    /**
     * @return the choice
     */
    public int getChoice() {
        return choice;
    }

    /**
     * @param choice the choice to set
     */
    public void setChoice(int choice) {
        this.choice = choice;
    }
}
