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
        
        System.out.println("====================================================================================================");
        System.out.println("\tKUALA LUMPUR INTERNATIONAL AIRPORT BOOKING SYSTEM");
        System.out.println("====================================================================================================");
        System.out.println("\t\t\t\tWelcome!");
        System.out.println("====================================================================================================");
        System.out.println("\t\t\t-REGISTRATION-");
         
            //registration input 
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
            
            myPerson = new Person(name,email,icNum,phoneNum,age);
            
        System.out.println("====================================================================================================");
        System.out.println("\t\t\t-BOOKING-");
        
            System.out.print("Total Passenger\t?\t"); 
            int totalPassenger = input.nextInt(); 
            input.nextLine(); 

        System.out.println("-----------------------------------------------------------------------------------------------------");

            Person[] myPassenger = new Passenger[totalPassenger];
            Airplane[] myAirAsia = new AirAsia[totalPassenger];
            Airplane[] myMas = new Mas[totalPassenger];
            Airplane[] myMalindo = new Malindo[totalPassenger];

            BookTicket[] First = new FirstClass[totalPassenger];
            BookTicket[] BClass = new BusinessClass[totalPassenger];
            BookTicket[] EClass = new EconomyClass[totalPassenger];

            int plane = 0;
            float[] FCPrice = new float[totalPassenger];

            for(int i =0; i < totalPassenger; i++){
                myPassenger[i] = new Passenger();
                First[i] = new FirstClass();
                BClass[i] = new BusinessClass();
                EClass[i] = new EconomyClass();

                //passenger detail 
                System.out.println("Passenger "+(i+1)); 

            System.out.println("-----------------------------------------------------------------------------------------------------");

                System.out.print("Name\t?"); 
                myPassenger[i].setP_Name(input.nextLine()); 

                System.out.print("Age\t?"); 
                myPassenger[i].setP_Age(input.nextInt()); 
                input.nextLine(); 

            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("[1]Kedah [2]Selangor [3]Penang [4]Perak [5]Pahang\n[6]Johor [7]Melaka [8]Kelantan/Terengganu [9]Sarawak [10]Sabah");
            System.out.println("-----------------------------------------------------------------------------------------------------");
            
            //flight trip
            System.out.print("Destination: ");
            ((Passenger)myPassenger[i]).getTicket().setDestination(input.nextInt());
            input.nextLine(); 

            System.out.print("Travel Type, 1- One Way, 2-Round Trip: ");
            ((Passenger)myPassenger[i]).getTicket().setTravelType(input.nextInt());
            input.nextLine(); 

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

                        FCPrice[i] = ((AirAsia)myAirAsia[i]).FCPrice((Passenger) myPassenger[i]);
                    }
                    case 2 -> {
                        System.out.print("Airplane Code (1- MAS55 / 2- MAS78) : ");
                        ((Mas)myMas[i]).setAirplaneCode(input.nextInt());
                        input.nextLine();

                        FCPrice[i] = ((Mas)myMas[i]).FCPrice((Passenger) myPassenger[i]);
                    }
                    case 3 -> {
                        System.out.print("Airplane Code (1- MD460 / 2- MD157) : ");
                        ((Malindo)myMalindo[i]).setAirplaneCode(input.nextInt());
                        input.nextLine();

                        FCPrice[i] = ((Malindo)myMalindo[i]).FCPrice((Passenger) myPassenger[i]);
                    }
                    default -> {
                    }
                }

                System.out.print("Class Type, 1-Business, 2-First, 3-Economy: ");
                ((Passenger)myPassenger[i]).getTicket().setFlightClass(input.nextInt());
                input.nextLine(); 
                
                //Flight class - seat number
                switch (((Passenger)myPassenger[i]).getTicket().getFlightClass()) {
                    case 1 -> {
                        System.out.print("Choose seat num 1 - 100: ");
                        ((BusinessClass)BClass[i]).setSeatNum(input.nextInt());
                        input.nextLine(); 
                    }
                    case 2 -> {
                        System.out.print("Choose seat num 1 - 40: ");
                        ((FirstClass)First[i]).setSeatNum(input.nextInt());
                        input.nextLine(); 
                    }
                    case 3 -> {
                        System.out.println("Thankyou for Choosing Economy Class! Your seat will be pick Randomly");
                        ((EconomyClass)EClass[i]).Random();
                    }
                    default -> {
                    }
                }
                
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

                    //luggage
                    System.out.print("Total Luggage [Max 3]: ");
                    ((Passenger)myPassenger[i]).setLuggage(input.nextInt());
                    input.nextLine();

                    //OKU
                    System.out.print("OKU 1-yes, 2-no? ");
                    ((Passenger)myPassenger[i]).setOkuDeclaration(input.nextInt());
                    input.nextLine(); 
                        
                    switch (plane) {
                    case 1 -> FCPrice[i] = ((AirAsia)myAirAsia[i]).FCPrice((Passenger) myPassenger[i]);
                    case 2 -> FCPrice[i] = ((Mas)myMas[i]).FCPrice((Passenger) myPassenger[i]);
                    case 3 -> FCPrice[i] = ((Malindo)myMalindo[i]).FCPrice((Passenger) myPassenger[i]);
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
            
            System.out.println("====================================================================================================");
            
                System.out.println("====================================================================================================");
                System.out.println("\tKUALA LUMPUR INTERNATIONAL AIRPORT BOOKING SYSTEM");
                System.out.println("====================================================================================================");
                System.out.println("\t\t\tThankyou for purchasing with us!");
                System.out.println("====================================================================================================");
                System.out.println("\t\t\t-BOOKING-");
                
                float totalAmount = 0;
                //output 
                for(int i =0; i < totalPassenger; i++){ 
                    //passenger detail 
                    System.out.println("\nOUTPUT");
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                    System.out.println("Passenger "+(i+1)); 
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                    
                    System.out.println("Name\t:"+myPassenger[i].getP_Name());
                    
                    //flight trip
                        ((Passenger)myPassenger[i]).getTicket().FlightDestination(((Passenger)myPassenger[i]).getTicket().getDestination());
                        ((Passenger)myPassenger[i]).getTicket().Type(((Passenger)myPassenger[i]).getTicket().getTravelType());
                        
                    //plane
                    switch (plane) {
                        case 1 -> {
                           ((AirAsia)myAirAsia[i]).AirplaneName();
                           ((AirAsia)myAirAsia[i]).AirplaneCode();
                        }
                        case 2 -> {
                            ((Mas)myMas[i]).AirplaneName();
                            ((Mas)myMas[i]).AirplaneCode();
                        }
                        case 3 -> {
                            ((Malindo)myMalindo[i]).AirplaneName();
                            ((Malindo)myMalindo[i]).AirplaneCode();
                        }
                        default -> {
                        }
                    }

                    ((Passenger)myPassenger[i]).getTicket().FClass(((Passenger)myPassenger[i]).getTicket().getFlightClass());
                    
                        //flight class
                        switch (((Passenger)myPassenger[i]).getTicket().getFlightClass()) {
                            case 1 -> System.out.println("Seat Num: "+ ((BusinessClass)BClass[i]).getSeatNum());
                            case 2 -> System.out.println("Seat Num: "+((FirstClass)First[i]).getSeatNum());
                            case 3 -> System.out.println("Seat Num: "+ ((EconomyClass)EClass[i]).getSeatNum());
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
                        
                        System.out.println("Total Luggage: "+((Passenger)myPassenger[i]).getLuggage());
                        ((Passenger)myPassenger[i]).AreOku(((Passenger)myPassenger[i]).getOkuDeclaration());

                            //vaccine
                            if(((Passenger)myPassenger[i]).getVaccine().getVaccineDeclaration() != 1){ 
                                System.out.println("YOUR BOOKING IS CANCELLED!!"); 
                            } 
                            else{ 
                                ((Passenger)myPassenger[i]).getVaccine().DisplayVaccineType(((Passenger)myPassenger[i]).getVaccine().getVaccineType());
                                ((Passenger)myPassenger[i]).VaccineDate();
                            }

                            //CALCULATION
                            //luggage price
                            System.out.println("Ticket Price: RM "+ ((Passenger)myPassenger[i]).getTicket().DestinationPrice(((Passenger)myPassenger[i]).getTicket().getDestination()));
                            System.out.println("Travel Type Price: RM "+((Passenger)myPassenger[i]).getTicket().TravelPrice( ((Passenger)myPassenger[i]).getTicket().getTravelType(), ((Passenger)myPassenger[i]).getTicket().getDPrice()));

                            switch (plane) {
                            case 1 -> {
                               System.out.println("Flight Class Price : RM "+FCPrice[i]);
                               System.out.println("Luggage Price: RM "+((Passenger)myPassenger[i]).LuggagePrice(((Passenger)myPassenger[i]).getLuggage()));
                               System.out.println("Total Ticket Price : RM "+((AirAsia)myAirAsia[i]).TicketPrice((Passenger) myPassenger[i]));
                            }
                            case 2 -> {
                                System.out.println("Flight Class Price : RM "+FCPrice[i]);
                                System.out.println("Luggage Price: RM "+((Passenger)myPassenger[i]).LuggagePrice(((Passenger)myPassenger[i]).getLuggage()));
                                System.out.println("Total Ticket Price : RM "+((Mas)myMas[i]).TicketPrice((Passenger) myPassenger[i]));
                            }
                            case 3 -> {
                                System.out.println("Flight Class Price : RM "+FCPrice[i]);
                                System.out.println("Luggage Price: RM "+((Passenger)myPassenger[i]).LuggagePrice(((Passenger)myPassenger[i]).getLuggage()));
                                System.out.println("Total Ticket Price : RM "+((Malindo)myMalindo[i]).TicketPrice((Passenger) myPassenger[i]));
                            }
                            default -> {
                            }
                        }
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        
                        totalAmount = totalAmount + ((AirAsia)myAirAsia[i]).getTotal() + ((Mas)myMas[i]).getTotal() + ((Malindo)myMalindo[i]).getTotal();
                } 
                
                System.out.println("====================================================================================================");
                for(int i =0; i < totalPassenger; i++){ 
                    System.out.println("Total Amount: RM "+totalAmount);
                }
                System.out.println("====================================================================================================");
                System.out.println("Thankyou!");
                System.out.println("====================================================================================================");
    }
}