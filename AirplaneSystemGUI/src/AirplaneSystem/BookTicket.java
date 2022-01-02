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
public class BookTicket {
    protected int destination;
    protected int travelType;
    protected int flightClass;
    protected String dateTravel;
    protected String dateReturn;
    
    public float DPrice;
    public float TravelPrice;
    
    BookTicket(){
        destination = 0;
        travelType = 0;
        flightClass = 0;
        dateTravel = null;
        dateReturn = null;
        DPrice = 0;
        TravelPrice = 0;
    }
    
    int FlightDestination(int destination){
        switch (getDestination()) {
            case 1 -> System.out.println("Destination: Kedah");
            case 2 -> System.out.println("Destination: Selangor");
            case 3 -> System.out.println("Destination: Penang");
            case 4 -> System.out.println("Destination: Perak");
            case 5 -> System.out.println("Destination: Pahang");
            case 6 -> System.out.println("Destination: Johor");
            case 7 -> System.out.println("Destination: Melaka");
            case 8 -> System.out.println("Destination: Kelantan/Terengganu");
            case 9 -> System.out.println("Destination: Sarawak");
            case 10 -> System.out.println("Destination: Sabah");
            default -> {
            }
        }
        
        return destination;
    }
    
    float DestinationPrice(int destination){
        
        switch (getDestination()) {
            case 1 -> DPrice = 119;
            case 2 -> DPrice = 129;
            case 3 -> DPrice = 139;
            case 4 -> DPrice = 159;
            case 5 -> DPrice = 189;
            case 6 -> DPrice = 169;
            case 7 -> DPrice = 179;
            case 8 -> DPrice = 149;
            case 9 -> DPrice = 220;
            case 10 -> DPrice = 250;
            default -> {
            }
        }
        return DPrice;
    }
    
    int Type(int travelType){
        if(getTravelType() == 1){
            System.out.println("Travel Type: One Way Trip");
        }
        else{
            System.out.println("Travel Type: Round Trip");
        }
        
        return travelType;
    }
    
    float TravelPrice(int travelType, float DPrice){
        if(getTravelType() == 1){
            TravelPrice = 0;
        }
        else{
            TravelPrice = DPrice;
        }
        return TravelPrice;
    }
    
    int FClass(int flightClass){
        switch (getFlightClass()) {
            case 1 -> System.out.println("Class Type: Business Class");
            case 2 -> System.out.println("Class Type: First Class");
            case 3 -> System.out.println("Class Type: Economy Class");
            default -> {
            }
        }
        return flightClass;
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

    /**
     * @return the DPrice
     */
    public float getDPrice() {
        return DPrice;
    }

    /**
     * @return the TVPrice
     */
    public float getTravelPrice() {
        return TravelPrice;
    }
    
}
