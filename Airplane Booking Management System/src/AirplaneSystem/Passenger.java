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
    private Ticket ticket;
    
    Passenger(){
        super();
        luggage = 0;
        okuDeclaration = 0;
        vaccine = new Vaccine();
        ticket = new Ticket();
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
    public Ticket getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    
    
}
