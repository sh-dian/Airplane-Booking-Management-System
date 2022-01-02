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
        
        total = (passenger.getTicket().DestinationPrice(passenger.getTicket().getDestination()) + passenger.getTicket().TravelPrice(passenger.getTicket().getTravelType(), passenger.getTicket().getDPrice())
                + passenger.LuggagePrice(passenger.getLuggage()) + FCPrice);
        
        return total;
    }
    
    
    @Override
    public float Discount(Passenger passenger) {
        disc = total * passenger.Discount(passenger.getP_Age(), passenger.getOkuDeclaration());
        
        return disc;
    }
    
    @Override
    public float Amount(Passenger passenger) {
        amount = total - disc;
        
        return amount;
    }
    
    //Interface class 
    @Override
    public String AirplaneName() {
        String type = null;
        
        if(getPlane() == 2){
            type = "Mas";
        }
        
        return type;
    }
    
    @Override
    public String AirplaneCode() {
        String AirplaneCode = null;
        
        if(getPlane() == 2){
            if(getAirplaneCode() == 1){
                AirplaneCode = "MAS55";
            }
            else{
                AirplaneCode = "MAS78";
            }
        }
        
        return AirplaneCode;
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