/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirplaneSystem;

/**
 *
 * @author User
 */
public class Passenger extends Person{
    //data member
    private int luggage;
    private Vaccine vaccine;
    
    Passenger(){
        vaccine = new Vaccine();
    }
    
    //method
    public float LuggagePrice(){
        float luggagePrice = 0;
        
        return luggagePrice;
    }

    /**
     * @return the luggage
     */
    public int getLuggage() {
        return luggage;
    }

    /**
     * @param luggage the luggage to set
     */
    public void setLuggage(int luggage) {
        this.luggage = luggage;
    }

    /**
     * @return the vaccine
     */
    public Vaccine getVaccine() {
        return vaccine;
    }

    /**
     * @param vaccine the vaccine to set
     */
    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }
}
