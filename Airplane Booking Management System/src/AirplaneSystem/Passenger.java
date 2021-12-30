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
    private int luggage;
    private int okuDeclaration;
    private Vaccine vaccine;
    private BookTicket ticket;
    
    public float LPrice;
    public float Discount;
    
    Passenger(){
        super();
        luggage = 0;
        okuDeclaration = 0;
        LPrice = 0;
        vaccine = new Vaccine();
        ticket = new BookTicket();
    }
    
    float LuggagePrice(int luggage){
        return LPrice = (float) (getLuggage() * 30.0);
    }
    
    float Discount(int P_Age, int okuDeclaration){
        float discP;
        
        if(getP_Age() <=12){
            discP = (float) 0.10;
            
            if(getOkuDeclaration() != 2){
                Discount = (float) (discP + 0.20);
            }
            else{
                Discount = discP;
            }
        }
        else if(getP_Age() >=60){
            discP = (float) 0.15;
            
            if(getOkuDeclaration() != 2){
                Discount = (float) (discP + 0.20);
            }
            else{
                Discount = discP;
            }
        }
        else if(getP_Age() > 12 && getP_Age() < 60){
            discP = 0;
            
            if(getOkuDeclaration() != 2){
                Discount = (float) (discP + 0.20);
            }
            else{
                Discount = discP;
            }
        }
        
        return Discount;
    }
    
    int AreOku(int okuDeclaration){
        if(getOkuDeclaration() == 1){
            System.out.println("OKU: Yes");
        }
        else if(getOkuDeclaration() == 2){
            System.out.println("OKU: No");
        }
        
        return okuDeclaration;
    }
    
    void VaccineDate(){
        System.out.println("First Dose Date: "+vaccine.getFirstDose_Date());
        System.out.println("Second Dose Date: "+vaccine.getSecondDose_Date());
        System.out.println("Covid-19 Result: "+vaccine.getCovid19_Result());
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
     * @return the okuDeclaration
     */
    public int getOkuDeclaration() {
        return okuDeclaration;
    }

    /**
     * @param okuDeclaration the okuDeclaration to set
     */
    public void setOkuDeclaration(int okuDeclaration) {
        this.okuDeclaration = okuDeclaration;
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

    /**
     * @return the ticket
     */
    public BookTicket getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(BookTicket ticket) {
        this.ticket = ticket;
    }

    /**
     * @return the LPrice
     */
    public float getLPrice() {
        return LPrice;
    }

    /**
     * @return the Discount
     */
    public float getDiscount() {
        return Discount;
    }
}
