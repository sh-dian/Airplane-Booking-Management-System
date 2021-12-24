/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirplaneSystem;

/**
 *
 * @author User
 */
public class AirAsia extends Airplane implements AirplaneTicketPrice{
    private int AirplaneCode;
    
    AirAsia(int plane){
        super(plane);
        AirplaneCode = 0;
    }
    
    //abstract class
    @Override
    public float FCPrice(Passenger passenger) {
        switch (passenger.getTicket().getFlightClass()) {
            case 1 -> FCPrice = 50;
            case 2 -> FCPrice = 30;
            case 3 -> FCPrice = 25;
            default -> {
            }
        }
        
        return FCPrice;
    }

    @Override
    public float TicketPrice(Passenger passenger) {
        float price;
        
        price = (passenger.getTicket().DestinationPrice(passenger.getTicket().getDestination()) + passenger.getTicket().TravelPrice(passenger.getTicket().getTravelType(), passenger.getTicket().getDPrice())
                + passenger.LuggagePrice(passenger.getLuggage()) + FCPrice);
        
        total = price - (price * (passenger.Discount(passenger.getP_Age(), passenger.getOkuDeclaration())));
        return total;
    }
    
    //Interface class 
    @Override
    public void AirplaneName() {
        if(getPlane() == 1){
            System.out.println("Airplane Type: AirAsia");
        }   
    }
    
    @Override
    public void A_Code() {
        if(getPlane() == 1){
            if(getAirplaneCode() == 1){
                System.out.println("Airplane Code: AA052");
            }
            else{
                System.out.println("Airplane Code: AA889");
            }
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
