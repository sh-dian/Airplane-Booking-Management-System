/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirplaneSystem;

/**
 *
 * @author User
 */
public class Mas extends Airplane implements AirplaneDetail{
    private int AirplaneCode;
    
    Mas(int plane){
        super(plane);
        AirplaneCode = 0;
    }
    
    //abstract class
    @Override
    public float FCPrice(Passenger passenger) {
        switch (passenger.getTicket().getFlightClass()) {
            case 1 -> FCPrice = 100;
            case 2 -> FCPrice = 60;
            case 3 -> FCPrice = 55;
            default -> {
            }
        }
        
        return FCPrice;
    }

    @Override
    public float TicketPrice(Passenger passenger) {
        float price = 0;
        
        price = (passenger.getTicket().DestinationPrice(passenger.getTicket().getDestination()) + passenger.getTicket().TravelPrice(passenger.getTicket().getTravelType(), passenger.getTicket().getDPrice())
                + passenger.LuggagePrice(passenger.getLuggage()) + FCPrice);
        
        total = price - (price * (passenger.Discount(passenger.getP_Age(), passenger.getOkuDeclaration())));
        return total;
    }
    
    //Interface class 
    @Override
    public void AirplaneName() {
        if(getPlane() == 2){
            System.out.println("Airplane Type: Mas");
        }
    }
    
    @Override
    public void AirplaneCode() {
        if(getPlane() == 2){
            if(getAirplaneCode() == 1){
                System.out.println("Airplane Code: MAS55");
            }
            else{
                System.out.println("Airplane Code: MAS78");
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