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
public class EconomyClass extends BookTicket{
    public int min;
    public int max;
    private int seatNum;
    
    EconomyClass(){
        super();
        seatNum = 0;
        min = 1;
        max = 100;
    }
        
    //flight seat 1 - 100 
    
    public int Random(){
            //Generate random int value from 1 to 50 
            seatNum = (int)Math.floor(Math.random()*(max-min+1)+min);
            
            return getSeatNum();
    }

    /**
     * @return the seatNum
     */
    public int getSeatNum() {
        return seatNum;
    }
}
