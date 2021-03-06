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
public class AirAsia extends Airplane implements AirplaneDetail{
    private int AirplaneCode;
    
    //parameter update - AirplaneCode
    AirAsia(int plane, int AirplaneCode){
        super(plane);
        this.AirplaneCode = AirplaneCode;
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
    public float TicketPrice(Passenger passenger, float FCPrice) {
        total = (passenger.getTicket().DestinationPrice(passenger.getTicket().getDestination()) + passenger.getTicket().TravelPrice(passenger.getTicket().getTravelType(), passenger.getTicket().getDPrice())
                + passenger.LuggagePrice(passenger.getLuggage()) + FCPrice);
        
        return total;
    }
    
    @Override
    public float Discount(Passenger passenger) {
        disc = total * passenger.Discount(passenger.getP_Age(), passenger.getOkuDeclaration());
        
        return disc;
    }
    
    //new method in abstract class
    @Override
    public float Amount(float total, float disc) {
        amount = getTotal() - getDisc();
        
        return amount;
    }
    
    //Interface class 
    
    //Change method return value (void -> String)
    @Override
    public String AirplaneName() {
        String type = null; //new variable
        
        if(getPlane() == 1){
            type = "AirAsia";
        }   
        
        return type;
    }
    
    //Change method return value (float -> String)
    @Override
    public String AirplaneCode() {
        String AirplaneCode = null; //new variable
        
        if(getPlane() == 1){
            if(getAirplaneCode() == 1){
                AirplaneCode = "AA052";
            }
            else{
                AirplaneCode = "AA889";
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
