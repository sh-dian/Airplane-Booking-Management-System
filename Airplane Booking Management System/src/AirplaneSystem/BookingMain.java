/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template 
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

//"New Variable" - Variable that not included in UML Diagram
import java.util.Scanner; 

public class BookingMain { 
    
    public static void main(String[] args) { 
        //Scanner object for user input
        Scanner input = new Scanner (System.in);
        
        float totalAmount = 0;//new variable
        Person myPerson; 
        
        System.out.println("========================================================================================");
        System.out.println("\tKUALA LUMPUR INTERNATIONAL AIRPORT BOOKING SYSTEM");
        System.out.println("========================================================================================");
        System.out.println("\t\t\t\tWelcome!");
        System.out.println("========================================================================================");
        
        //User may choose (Login - already have acc, Register - No Account)
        System.out.print("[1]Registration [2]Login : ");
        int x = input.nextInt();//new variable
        input.nextLine();
            
            //all variable in registration & login - new variable
            if(x == 1){
                //User Registration
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

                    System.out.print("Password\t:"); 
                    String password = input.next();

                    myPerson = new Person(name,email,icNum,phoneNum,age,password);
            }
            else{
                //User Login
                System.out.println("\t\t\t-LOGIN-");

                System.out.print("Email\t:"); 
                String email = input.next();

                System.out.print("Password\t:"); 
                String password = input.next();

                myPerson = new Person(email,password);
            }
            
        System.out.println("========================================================================================");
        System.out.println("\t\t\t-BOOKING-");
            
            System.out.print("Total Passenger\t?\t");//loop 
            int totalPassenger = input.nextInt(); 
            input.nextLine(); 

        System.out.println("----------------------------------------------------------------------------------------");
            
            Person[] myPassenger = new Passenger[totalPassenger];
            Airplane[] myAirAsia = new AirAsia[totalPassenger];
            Airplane[] myMas = new Mas[totalPassenger];
            Airplane[] myMalindo = new Malindo[totalPassenger];

            BookTicket[] First = new FirstClass[totalPassenger];
            BookTicket[] BClass = new BusinessClass[totalPassenger];
            BookTicket[] EClass = new EconomyClass[totalPassenger];

            int[] plane = new int[totalPassenger];
            int[] planeCode = new int[totalPassenger];//new variable
            
            float[] FCPrice = new float[totalPassenger];//new variable
            float[] TPrice = new float[totalPassenger];//new variable
            float[] AmountPrice = new float[totalPassenger];//new variable
            float[] Discount = new float[totalPassenger];//new variable

            for(int i =0; i < totalPassenger; i++){
                myPassenger[i] = new Passenger();
                First[i] = new FirstClass();
                BClass[i] = new BusinessClass();
                EClass[i] = new EconomyClass();

                //passenger detail 
                System.out.println("Passenger "+(i+1)); 

                System.out.println("----------------------------------------------------------------------------------------");

                    System.out.print("Name\t?"); 
                    myPassenger[i].setP_Name(input.nextLine()); 

                    System.out.print("Age\t?"); 
                    myPassenger[i].setP_Age(input.nextInt()); 
                    input.nextLine(); 

                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("[1]Kedah [2]Selangor [3]Penang [4]Perak [5]Pahang\n[6]Johor [7]Melaka [8]Kelantan/Terengganu [9]Sarawak [10]Sabah");
                System.out.println("----------------------------------------------------------------------------------------");

                    //flight trip - destination and travel type
                    System.out.print("Destination: ");
                    ((Passenger)myPassenger[i]).getTicket().setDestination(input.nextInt());
                    input.nextLine(); 

                    System.out.print("Travel Type [1]One Way, [2]Round Trip: ");
                    ((Passenger)myPassenger[i]).getTicket().setTravelType(input.nextInt());
                    input.nextLine(); 

                    //Airplane - name, code, flight class, seat number
                    System.out.print("Airplane Type, [1]AirAsia, [2]Mas, [3]Malindo: ");
                    plane[i] = input.nextInt();
                    input.nextLine();

                        switch (plane[i]) {
                            case 1 -> {
                                System.out.print("Airplane Code ([1]AA052 / [2]AA889) : ");
                                planeCode[i] = input.nextInt();
                                input.nextLine();
                            }
                            case 2 -> {
                                System.out.print("Airplane Code ([1]MAS55 / [2]MAS78) : ");
                                planeCode[i] = input.nextInt();
                                input.nextLine();
                            }
                            case 3 -> {
                                System.out.print("Airplane Code ([1]MD460 / [2]MD157) : ");
                                planeCode[i] = input.nextInt();
                                input.nextLine();
                            }
                            default -> {
                            }
                        }
                
                myAirAsia[i] = new AirAsia(plane[i], planeCode[i]);
                myMas[i] = new Mas(plane[i], planeCode[i]);
                myMalindo[i] = new Malindo(plane[i], planeCode[i]);

                    System.out.print("Class Type, [1]Business, [2]First, [3]Economy: ");
                    ((Passenger)myPassenger[i]).getTicket().setFlightClass(input.nextInt());
                    input.nextLine();
                
                        switch (((Passenger)myPassenger[i]).getTicket().getFlightClass()) {
                            case 1 -> {
                                System.out.print("Choose seat num [1 - 100]: ");
                                ((BusinessClass)BClass[i]).setSeatNum(input.nextInt());
                                input.nextLine(); 
                            }
                            case 2 -> {
                                System.out.print("Choose seat num [1 - 40]: ");
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
                    System.out.print("OKU [1]yes, [2]no? ");
                    ((Passenger)myPassenger[i]).setOkuDeclaration(input.nextInt());
                    input.nextLine(); 
                    
                        //Price
                        switch (plane[i]) {
                            case 1 ->{
                                FCPrice[i] = ((AirAsia)myAirAsia[i]).FCPrice((Passenger) myPassenger[i]);
                                TPrice[i] = ((AirAsia)myAirAsia[i]).TicketPrice((Passenger) myPassenger[i]);
                                Discount[i] = ((AirAsia)myAirAsia[i]).Discount((Passenger) myPassenger[i]);
                                AmountPrice[i] = ((AirAsia)myAirAsia[i]).Amount(TPrice[i], Discount[i]);
                            }
                            case 2 ->{
                                FCPrice[i] = ((Mas)myMas[i]).FCPrice((Passenger) myPassenger[i]);
                                TPrice[i] = ((Mas)myMas[i]).TicketPrice((Passenger) myPassenger[i]);
                                Discount[i] = ((Mas)myMas[i]).Discount((Passenger) myPassenger[i]);
                                AmountPrice[i] = ((Mas)myMas[i]).Amount(TPrice[i], Discount[i]);
                            }
                            case 3 ->{
                                FCPrice[i] = ((Malindo)myMalindo[i]).FCPrice((Passenger) myPassenger[i]);
                                TPrice[i] = ((Malindo)myMalindo[i]).TicketPrice((Passenger) myPassenger[i]);
                                Discount[i] = ((Malindo)myMalindo[i]).Discount((Passenger) myPassenger[i]);
                                AmountPrice[i] = ((Malindo)myMalindo[i]).Amount(TPrice[i], Discount[i]);
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
                            
                System.out.println("----------------------------------------------------------------------------------------");
            } 
            
            //Design Pattern
            /*
                //declare factory obj
                AirplaneFactory factoryObj = new AirplaneFactory();
                
                for(int i =0; i < totalPassenger; i++)
                {
                    AirplaneDetail obj = factoryObj.getAirplaneDetail(plane[i]);
                    Airplane obj2 = factoryObj.getAirplane(plane[i]);

                    if(obj != null){
                        System.out.println("Airplane Type: "+obj.AirplaneName());
                        System.out.println("Airplane Code: "+obj.AirplaneCode());
                        System.out.println("Flight Class Price: "+obj2.FCPrice((Passenger) myPassenger[i]));
                        System.out.println("Total Ticket Price: "+obj2.TicketPrice((Passenger) myPassenger[i]));
                        System.out.println("Discount : "+obj2.Discount((Passenger) myPassenger[i]));
                    }
                }*/
            
            /*
            AirplaneFactory factoryObj = new AirplaneFactory();   
            
            float totalAmount = 0;
            System.out.println("========================================================================================");

            System.out.println("\nDESIGN PATTERN OUTPUT");
                System.out.println("\n========================================================================================\n");
                System.out.println("\tKUALA LUMPUR INTERNATIONAL AIRPORT BOOKING SYSTEM");
                System.out.println("========================================================================================");
                System.out.println("\t\t\tThankyou for purchasing with us!");
                System.out.println("========================================================================================");
                System.out.println("\t\t\t-BOOKING-");
                
                  for(int i =0; i < totalPassenger; i++){
                        System.out.println("----------------------------------------------------------------------------------------");
                        System.out.println("Passenger "+(i+1)); 
                        System.out.println("----------------------------------------------------------------------------------------");

                        System.out.println("Name\t:"+myPassenger[i].getP_Name());

                        //flight trip
                        System.out.println("Destination : "+
                        ((Passenger)myPassenger[i]).getTicket().FlightDestination(((Passenger)myPassenger[i]).getTicket().getDestination()));
                        
                        System.out.println("Travel Type : "+
                        ((Passenger)myPassenger[i]).getTicket().Type(((Passenger)myPassenger[i]).getTicket().getTravelType()));
                        
                            //Airplane
                            AirplaneDetail obj = factoryObj.getAirplaneDetail(plane[i]);

                            if(obj != null){
                                System.out.println("Airplane Type: "+obj.AirplaneName());
                                System.out.println("Airplane Code: "+obj.AirplaneCode());
                            }
                        
                        //Flight Class, Flight Seat
                        System.out.println("Flight Class : "+
                        ((Passenger)myPassenger[i]).getTicket().FClass(((Passenger)myPassenger[i]).getTicket().getFlightClass()));
                        
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
                            
                            //Luggage, Passenger declaration
                            System.out.println("Total Luggage : "+((Passenger)myPassenger[i]).getLuggage());
                            System.out.println("OKU : " +
                            ((Passenger)myPassenger[i]).AreOku(((Passenger)myPassenger[i]).getOkuDeclaration()));
                            
                            //vaccine
                            if(((Passenger)myPassenger[i]).getVaccine().getVaccineDeclaration() != 1){ 
                                System.out.println("YOUR BOOKING IS CANCELLED!!"); 
                                break;
                            } 
                            else{ 
                                System.out.println("Vaccine : " +
                                ((Passenger)myPassenger[i]).getVaccine().DisplayVaccineType(((Passenger)myPassenger[i]).getVaccine().getVaccineType()));
                                
                                ((Passenger)myPassenger[i]).VaccineDate();
                            }
                            
                                //Price
                                
                                System.out.println("Ticket Price: RM "+ ((Passenger)myPassenger[i]).getTicket().DestinationPrice(((Passenger)myPassenger[i]).getTicket().getDestination()));
                                System.out.println("Travel Type Price: RM "+((Passenger)myPassenger[i]).getTicket().TravelPrice( ((Passenger)myPassenger[i]).getTicket().getTravelType(), ((Passenger)myPassenger[i]).getTicket().getDPrice()));

                                Airplane obj2 = factoryObj.getAirplane(plane[i]);

                                if(obj != null){
                                    System.out.println("Flight Class Price: "+obj2.FCPrice((Passenger) myPassenger[i]));
                                }
                                
                                System.out.println("Luggage Price: RM "+((Passenger)myPassenger[i]).LuggagePrice(((Passenger)myPassenger[i]).getLuggage()));
                                
                                if(obj != null){
                                    System.out.println("Total Ticket Price: "+obj2.TicketPrice((Passenger) myPassenger[i]));
                                    System.out.println("Discount : "+obj2.Discount((Passenger) myPassenger[i]));
                                    //System.out.println("Total Price Passenger "+(i+1)+" : RM "+obj2.Amount();
                                    
                                    //totalAmount = totalAmount + obj2.Amount();
                                }
                        }
                        System.out.println("----------------------------------------------------------------------------------------");
                        System.out.println("========================================================================================");
                        System.out.println("Total Amount: RM "+totalAmount);
                        System.out.println("========================================================================================");
                        System.out.println("Thankyou!");
                        System.out.println("========================================================================================");
                */
            //change 'amount' method later for design pattern

                //output 
                for(int i =0; i < totalPassenger; i++){ 
                    //passenger detail 
                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("Passenger "+(i+1)); 
                    System.out.println("----------------------------------------------------------------------------------------");
                    
                    System.out.println("Name\t:"+myPassenger[i].getP_Name());
                    
                    //flight trip - destination, travel type
                    System.out.println("Destination : "+
                    ((Passenger)myPassenger[i]).getTicket().FlightDestination(((Passenger)myPassenger[i]).getTicket().getDestination()));

                    System.out.println("Travel Type : "+
                    ((Passenger)myPassenger[i]).getTicket().Type(((Passenger)myPassenger[i]).getTicket().getTravelType()));

                        //plane - name, code, flight class, seat num
                        switch (plane[i]) {
                            case 1 -> {
                                System.out.println("Airplane Type: "+((AirAsia)myAirAsia[i]).AirplaneName());
                                System.out.println("Airplane Code: "+((AirAsia)myAirAsia[i]).AirplaneCode());
                            }
                            case 2 -> {
                                System.out.println("Airplane Type: "+((Mas)myMas[i]).AirplaneName());
                                System.out.println("Airplane Code: "+((Mas)myMas[i]).AirplaneCode());
                            }
                            case 3 -> {
                                System.out.println("Airplane Type: "+((Malindo)myMalindo[i]).AirplaneName());
                                System.out.println("Airplane Code: "+((Malindo)myMalindo[i]).AirplaneCode());
                            }
                            default -> {
                            }
                        }

                    System.out.println("Flight Class : "+
                    ((Passenger)myPassenger[i]).getTicket().FClass(((Passenger)myPassenger[i]).getTicket().getFlightClass()));

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
                    System.out.println("OKU : " +
                    ((Passenger)myPassenger[i]).AreOku(((Passenger)myPassenger[i]).getOkuDeclaration()));

                        //vaccine
                        if(((Passenger)myPassenger[i]).getVaccine().getVaccineDeclaration() != 1){ 
                            System.out.println("YOUR BOOKING IS CANCELLED!!");
                            break;
                        } 
                        else{ 
                            ((Passenger)myPassenger[i]).getVaccine().DisplayVaccineType(((Passenger)myPassenger[i]).getVaccine().getVaccineType());
                            ((Passenger)myPassenger[i]).VaccineDate();
                        }

                    //Price
                    System.out.println("Ticket Price: RM "+ ((Passenger)myPassenger[i]).getTicket().DestinationPrice(((Passenger)myPassenger[i]).getTicket().getDestination()));
                    System.out.println("Travel Type Price: + RM "+((Passenger)myPassenger[i]).getTicket().TravelPrice( ((Passenger)myPassenger[i]).getTicket().getTravelType(), ((Passenger)myPassenger[i]).getTicket().getDPrice()));

                        switch (plane[i]) {
                            case 1 ->System.out.println("Flight Class Price : + RM "+FCPrice[i]);
                            case 2 ->System.out.println("Flight Class Price : + RM "+FCPrice[i]);
                            case 3 ->System.out.println("Flight Class Price : + RM "+FCPrice[i]);
                            default -> {
                            }
                        }

                    System.out.println("Luggage Price: + RM "+((Passenger)myPassenger[i]).LuggagePrice(((Passenger)myPassenger[i]).getLuggage()));

                        switch (plane[i]) {
                            case 1 -> {
                               System.out.println("Total Ticket Price : RM "+  TPrice[i]);
                               System.out.println("Discount: - RM " + Discount[i]);
                               System.out.println("Total Price Passenger "+(i+1)+" : RM "+ AmountPrice[i]);
                            }
                            case 2 -> {
                                System.out.println("Total Ticket Price : RM "+  TPrice[i]);
                                System.out.println("Discount: - RM " + Discount[i]);
                                System.out.println("Total Price Passenger "+(i+1)+" : RM "+ AmountPrice[i]);
                            }
                            case 3 -> {
                                System.out.println("Total Ticket Price : RM "+  TPrice[i]);
                                System.out.println("Discount: - RM " + Discount[i]);
                                System.out.println("Total Price Passenger "+(i+1)+" : RM "+ AmountPrice[i]);
                            }
                            default -> {
                            }
                        }

                    System.out.println("----------------------------------------------------------------------------------------");
                    totalAmount = totalAmount + AmountPrice[i];
                } 
                
                System.out.println("========================================================================================");
                System.out.println("Total Amount: RM "+totalAmount);
                System.out.println("========================================================================================");
                System.out.println("Thankyou!");
                System.out.println("========================================================================================");
    }
}