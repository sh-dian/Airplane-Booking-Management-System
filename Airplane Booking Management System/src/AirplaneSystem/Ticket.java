/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirplaneSystem;

/**
 *
 * @author User
 */
public class Ticket {
    protected int destination;
    protected int travelType;
    protected int flightClass;
    protected String dateTravel;
    protected String dateReturn;
    
    Ticket(){
        destination = 0;
        travelType = 0;
        flightClass = 0;
        dateTravel = null;
        dateReturn = null;
    }
    
    void FlightDestination(int destination){
        switch (getDestination()) {
            case 1 -> System.out.println("Destination: Kedah");
            case 2 -> System.out.println("Destination: Selangor");
            case 3 -> System.out.println("Destination: Penang");
            default -> {
            }
        }
    }
    
    void Type(int travelType){
        if(getTravelType() == 1){
            System.out.println("Travel Type: One Way Trip");
        }
        else{
            System.out.println("Travel Type: Round Trip");
        }
    }
    
    void FClass(int flightClass){
        switch (getFlightClass()) {
            case 1 -> System.out.println("Travel Type: Business Class");
            case 2 -> System.out.println("Travel Type: First Class");
            case 3 -> System.out.println("Travel Type: Economy Class");
            default -> {
            }
        }
    }
    
    //overload method
    void FlightDate1(String dateTravel){
        System.out.println("Date Travel: "+getDateTravel());
    }
    
    void FlightDate2(String dateTravel, String dateReturn){
        System.out.println("Date Travel: "+getDateTravel());
        System.out.println("Date Return: "+getDateReturn());
    }

    /**
     * @return the destination
     */
    public int getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(int destination) {
        this.destination = destination;
    }

    /**
     * @return the travelType
     */
    public int getTravelType() {
        return travelType;
    }

    /**
     * @param travelType the travelType to set
     */
    public void setTravelType(int travelType) {
        this.travelType = travelType;
    }

    /**
     * @return the flightClass
     */
    public int getFlightClass() {
        return flightClass;
    }

    /**
     * @param flightClass the flightClass to set
     */
    public void setFlightClass(int flightClass) {
        this.flightClass = flightClass;
    }

    /**
     * @return the dateTravel
     */
    public String getDateTravel() {
        return dateTravel;
    }

    /**
     * @param dateTravel the dateTravel to set
     */
    public void setDateTravel(String dateTravel) {
        this.dateTravel = dateTravel;
    }

    /**
     * @return the dateReturn
     */
    public String getDateReturn() {
        return dateReturn;
    }

    /**
     * @param dateReturn the dateReturn to set
     */
    public void setDateReturn(String dateReturn) {
        this.dateReturn = dateReturn;
    }
    
}
