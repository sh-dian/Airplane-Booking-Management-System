/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirplaneSystem;

/**
 *
 * @author User
 */
abstract public class Airplane {
    public int plane;
    public float FCPrice;
    public float total;
    public float disc;
    public Passenger passenger;
    
    Airplane(int plane){
        this.plane = plane;
        FCPrice = 0;
        total = 0;
        disc = 0;
        passenger = new Passenger();
    }
    
    abstract public float FCPrice(Passenger passenger);
    abstract public float TicketPrice(Passenger passenger);
    abstract public float Discount(Passenger passenger);

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
     * @param disc the disc to set
     */
    public void setDisc(float disc) {
        this.disc = disc;
    }

    /**
     * @return the passenger
     */
    public Passenger getPassenger() {
        return passenger;
    }

}
