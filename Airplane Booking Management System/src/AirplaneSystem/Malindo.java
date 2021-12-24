/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirplaneSystem;

/**
 *
 * @author User
 */
public class Malindo extends Airplane implements AirplaneTicketPrice{
    int AirplaneCode;
    
    Malindo(int plane){
        super(plane);
        AirplaneCode = 0;
    }
    
    //abstract class
    @Override
    public float FCPrice(Passenger passenger) {
        switch (passenger.getTicket().getFlightClass()) {
            case 1 -> FCPrice = 150;
            case 2 -> FCPrice = 130;
            case 3 -> FCPrice = 125;
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
        if(getPlane() == 3){
            System.out.println("Airplane Type: Malindo");
        }
    }
    
    @Override
    public void A_Code() {
        if(getPlane() == 3){
            if(getAirplaneCode() == 1){
                System.out.println("Airplane Code: MD460");
            }
            else{
                System.out.println("Airplane Code: MD157");
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