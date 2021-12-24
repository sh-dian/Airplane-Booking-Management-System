/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template 
 */ 
package AirplaneSystem; 
 
/** 
 * 
 * @Group 8 
 */ 
import java.util.Scanner; 
public class BookingMain { 
 
    /** 
     * @param args the command line arguments 
     */ 
    public static void main(String[] args) { 
        // TODO code application logic here 
        Scanner input = new Scanner (System.in); 
         
        Person myPerson; 
         
            /*//registration input 
            System.out.print("Name\t:"); 
            String name = input.nextLine();
             
            System.out.print("Age\t:"); 
            int age = input.nextInt();
            input.nextLine(); 
             
            System.out.print("Email\t:"); 
            String email = input.next();
             
            System.out.print("IC Number\t:"); 
            String icNum = input.next();
             
            System.out.print("Phone Number\t:"); 
            String phoneNum = input.next();
            
            myPerson = new Person(name,email,icNum,phoneNum,age);*/
         
        
        System.out.print("Total Passenger\t?\t"); 
        int totalPassenger = input.nextInt(); 
        input.nextLine(); 
         
        Person[] myPassenger = new Passenger[totalPassenger];
        Airplane[] myAirAsia = new AirAsia[totalPassenger];
        Airplane[] myMas = new Mas[totalPassenger];
        Airplane[] myMalindo = new Malindo[totalPassenger];
        
        //Ticket[] First = new FirstClass[totalPassenger];
        //Ticket[] BClass = new BusinessClass[totalPassenger];
        
        int plane = 0;
         
        for(int i =0; i < totalPassenger; i++){
            myPassenger[i] = new Passenger();
            //First[i] = new FirstClass();
            //BClass[i] = new BusinessClass();
            
            //passenger detail 
            System.out.println("Passenger "+(i+1)); 
            System.out.print("Name\t?"); 
            myPassenger[i].setP_Name(input.nextLine()); 
             
            System.out.print("Age\t?"); 
            myPassenger[i].setP_Age(input.nextInt()); 
            input.nextLine(); 
            
            //OKU
            System.out.print("OKU 1-yes, 2-no? ");
            ((Passenger)myPassenger[i]).setOkuDeclaration(input.nextInt());
            input.nextLine(); 
            
            //luggage
            System.out.print("Total Luggage: ");
            ((Passenger)myPassenger[i]).setLuggage(input.nextInt());
            input.nextLine(); 
                
                //flight trip
                System.out.print("Destination: ");
                ((Passenger)myPassenger[i]).getTicket().setDestination(input.nextInt());
                input.nextLine(); 
                
                System.out.print("Travel Type, 1- One Way, 2-Round Trip: ");
                ((Passenger)myPassenger[i]).getTicket().setTravelType(input.nextInt());
                input.nextLine(); 
                
                System.out.print("Class Type, 1-Business, 2-First, 3-Economy: ");
                ((Passenger)myPassenger[i]).getTicket().setFlightClass(input.nextInt());
                input.nextLine(); 
                
                /*//Flight class
                if(((Passenger)myPassenger[i]).getTicket().getFlightClass() == 2){
                    ((FirstClass)First[i]).Seat();
                    ((FirstClass)First[i]).setSeatNum(input.nextInt());
                }
                else{
                    ((BusinessClass)BClass[i]).Random();
                }*/
                
                    //date travel
                    if(((Passenger)myPassenger[i]).getTicket().getTravelType() == 1){
                        System.out.print("Date Travel: ");
                        ((Passenger)myPassenger[i]).getTicket().setDateTravel(input.nextLine());
                    }
                    else{
                        System.out.print("Date Travel: ");
                        ((Passenger)myPassenger[i]).getTicket().setDateTravel(input.nextLine());

                        System.out.print("Date Return: ");
                        ((Passenger)myPassenger[i]).getTicket().setDateReturn(input.nextLine());
                    }

                    //Airplane
                    System.out.print("Airplane Type, 1-AirAsia, 2-Mas, 3-Malindo: ");
                    plane = input.nextInt();
                    input.nextLine();
                    
                    myAirAsia[i] = new AirAsia(plane);
                    myMas[i] = new Mas(plane);
                    myMalindo[i] = new Malindo(plane);

                    switch (plane) {
                        case 1 -> {
                            System.out.print("Airplane Code (1- AA052 / 2- AA889) : ");
                            ((AirAsia)myAirAsia[i]).setAirplaneCode(input.nextInt());
                            input.nextLine();
                        }
                        case 2 -> {
                            System.out.print("Airplane Code (1- MAS55 / 2- MAS78) : ");
                            ((Mas)myMas[i]).setAirplaneCode(input.nextInt());
                            input.nextLine();
                        }
                        case 3 -> {
                            System.out.print("Airplane Code (1- MD460 / 2- MD157) : ");
                            ((Malindo)myMalindo[i]).setAirplaneCode(input.nextInt());
                            input.nextLine();
                        }
                        default -> {
                        }
                    }
                        
                        //Vaccine detail 
                        System.out.print("Vaccinated [1]Yes [2]No\t? "); 
                        ((Passenger)myPassenger[i]).getVaccine().setVaccineDeclaration(input.nextInt()); 
                        input.nextLine(); 

                            //if passenger not vacinated - booking will be canceled 
                            if(((Passenger)myPassenger[i]).getVaccine().getVaccineDeclaration() == 1){ 
                                //vaccine type 
                                System.out.print("Vaccine type [1]Sinovac [2]Astrazeneca [3]Pfizer\t? "); 
                                ((Passenger)myPassenger[i]).getVaccine().setVaccineType(input.nextInt()); 
                                input.nextLine(); 

                                //vaccine date 
                                System.out.print("1st Dose [dd/mm/yy] : "); 
                                ((Passenger)myPassenger[i]).getVaccine().setFirstDose_Date(input.nextLine()); 
                                System.out.print("2nd Dose [dd/mm/yy] : "); 
                                ((Passenger)myPassenger[i]).getVaccine().setSecondDose_Date(input.nextLine()); 

                                System.out.print("Covid-19 Result : "); 
                                ((Passenger)myPassenger[i]).getVaccine().setCovid19_Result(input.nextLine()); 
                            } 
                            else{ 
                                break; 
                            }
        } 
         
            //output 
            for(int i =0; i < totalPassenger; i++){ 
                //passenger detail 
                System.out.println("\nOUTPUT"); 
                System.out.println("Passenger "+(i+1)); 
                System.out.println("Name\t:"+myPassenger[i].getP_Name());
                   
                    //flight trip
                    ((Passenger)myPassenger[i]).getTicket().FlightDestination(((Passenger)myPassenger[i]).getTicket().getDestination());
                    ((Passenger)myPassenger[i]).getTicket().FClass(((Passenger)myPassenger[i]).getTicket().getFlightClass());
                    ((Passenger)myPassenger[i]).getTicket().Type(((Passenger)myPassenger[i]).getTicket().getTravelType());
                    
                    /*//flight class
                    ((BusinessClass)BClass[i]).Seat();*/
                    
                    //plane
                    switch (plane) {
                        case 1 -> {
                           ((AirAsia)myAirAsia[i]).AirplaneName();
                           ((AirAsia)myAirAsia[i]).A_Code();
                        }
                        case 2 -> {
                            ((Mas)myMas[i]).AirplaneName();
                        }
                        case 3 -> {
                            ((Malindo)myMalindo[i]).AirplaneName();
                        }
                        default -> {
                        }
                    }
                    
                    //date travel
                    if(((Passenger)myPassenger[i]).getTicket().getTravelType() == 1){
                        ((Passenger)myPassenger[i]).getTicket().FlightDate1(((Passenger)myPassenger[i]).getTicket().getDateTravel());
                    }
                    else{
                        ((Passenger)myPassenger[i]).getTicket().FlightDate2(((Passenger)myPassenger[i]).getTicket().getDateTravel(), ((Passenger)myPassenger[i]).getTicket().getDateReturn());
                    }
                    
                        //vaccine
                        if(((Passenger)myPassenger[i]).getVaccine().getVaccineDeclaration() != 1){ 
                            System.out.println("YOUR BOOKING IS CANCELLED!!"); 
                        } 
                        else{ 
                            ((Passenger)myPassenger[i]).getVaccine().DisplayVaccineType(((Passenger)myPassenger[i]).getVaccine().getVaccineType()); 
                        }
                        
                        //CALCULATION
                        //luggage price
                        System.out.println("Total Luggage: "+((Passenger)myPassenger[i]).getLuggage());
                        System.out.println("Luggage Price: "+((Passenger)myPassenger[i]).LuggagePrice(((Passenger)myPassenger[i]).getLuggage()));
                        
                        System.out.println("Ticket Price: "+ ((Passenger)myPassenger[i]).getTicket().DestinationPrice(((Passenger)myPassenger[i]).getTicket().getDestination()));
                        System.out.println("Travel Type Price: "+((Passenger)myPassenger[i]).getTicket().TravelPrice( ((Passenger)myPassenger[i]).getTicket().getTravelType(), ((Passenger)myPassenger[i]).getTicket().getDPrice()));
                        
                        switch (plane) {
                        case 1 -> {
                           System.out.println("Flight Ticket Price : "+((AirAsia)myAirAsia[i]).FCPrice((Passenger) myPassenger[i]));
                           System.out.println("Total Ticket Price : "+((AirAsia)myAirAsia[i]).TicketPrice((Passenger) myPassenger[i]));
                        }
                        case 2 -> {
                            System.out.println("Flight Ticket Price : "+((Mas)myMas[i]).FCPrice((Passenger) myPassenger[i]));
                            System.out.println("Total Ticket Price : "+((Mas)myMas[i]).TicketPrice((Passenger) myPassenger[i]));
                        }
                        case 3 -> {
                            System.out.println("Flight Ticket Price : "+((Malindo)myMalindo[i]).FCPrice((Passenger) myPassenger[i]));
                            System.out.println("Total Ticket Price : "+((Malindo)myMalindo[i]).TicketPrice((Passenger) myPassenger[i]));
                        }
                        default -> {
                        }
                    }
            } 
    }
}