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
abstract public class Airplane {
    public int plane;
    public float FCPrice;
    public float total;
    public float disc; //new variable
    protected float amount; //new variable
    public Passenger passenger;
    
    Airplane(int plane){
        this.plane = plane;
        FCPrice = 0;
        total = 0;
        disc = 0;
        amount = 0;
        passenger = new Passenger();
    }
    
    abstract public float FCPrice(Passenger passenger);
    abstract public float TicketPrice(Passenger passenger);
    abstract public float Discount(Passenger passenger); //new method
    abstract public float Amount(float total, float disc); //new method
    
    /**
     * @return the plane
     */
    public int getPlane() {
        return plane;
    }

    /**
     * @return the FCPrice
     */
    public float getFCPrice() {
        return FCPrice;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @return the disc
     */
    public float getDisc() {
        return disc;
    }

    /**
     * @return the passenger
     */
    public Passenger getPassenger() {
        return passenger;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }
}
