/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AirplaneSystem;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class BookingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        Person myPerson = new Person();
        
            //registration input
            System.out.print("Name\t:");
            myPerson.setP_Name(input.nextLine());
            
            System.out.print("Age\t:");
            myPerson.setP_Age(input.nextInt());
            input.nextLine();
            
            System.out.print("Email\t:");
            myPerson.setP_Email(input.next());
            
            System.out.print("IC Number\t:");
            myPerson.setP_icNum(input.next());
            
            System.out.print("Phone Number\t:");
            myPerson.setP_phoneNum(input.next());
        
        //input
        System.out.print("Total Passenger\t?\t");
        int totalPassenger = input.nextInt();
        input.nextLine();
        
        Person[] myPassenger = new Passenger[totalPassenger];
        
        for(int i =0; i < totalPassenger; i++){
            myPassenger[i] = new Passenger();
            
            //passenger detail
            System.out.println("Passenger "+(i+1));
            System.out.print("Name\t?");
            myPassenger[i].setP_Name(input.nextLine());
            
            System.out.print("Age\t?");
            myPassenger[i].setP_Age(input.nextInt());
            input.nextLine();
            
                //Vaccine detail
                System.out.print("Vaccinated [1]Yes [2]No\t? ");
                ((Passenger)myPassenger[i]).getVaccine().setVaccineDeclaration(input.nextInt());
                input.nextLine();
                
                    if(((Passenger)myPassenger[i]).getVaccine().getVaccineDeclaration() == 1){
                        System.out.print("Vaccine type [1]Sinovac [2]Astrazeneca [3]Pfizer\t? ");
                        ((Passenger)myPassenger[i]).getVaccine().setVaccineType(input.nextInt());
                        input.nextLine();
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
                
                if(((Passenger)myPassenger[i]).getVaccine().getVaccineDeclaration() != 1){
                    System.out.println("YOUR BOOKING IS CANCELLED!!");
                }
                else{
                    ((Passenger)myPassenger[i]).getVaccine().DisplayVaccineType(((Passenger)myPassenger[i]).getVaccine().getVaccineDeclaration());
                }
            }
    }
}