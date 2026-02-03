package javaapplication32;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


import java.util.Scanner;


/**
 *
 * @author USER
 */


class Fatima_ {  


 //to use all functions to related to date
    private LocalDate startingDate;
    private LocalDate endingDate;
    String Reservation_id; 
    int Room_id;
    int Room_rate; 


//constructor to initialize the values in the class variables
public Fatima_(String f,String a,String r,int id,int rate ){
    this.startingDate=LocalDate.parse(f);
    this.endingDate=LocalDate.parse(a);
    this.Reservation_id=r;
    this.Room_id=id;
    this.Room_rate=rate;
           
            }


//input the string 
public void Fatima_inputInfo(){
         
    Scanner f=new Scanner(System.in);
    System.out.println("Enter starting date");
    this.startingDate=LocalDate.parse(f.nextLine());
    System.out.println("Enter ending date");
    this.endingDate=LocalDate.parse(f.nextLine());
    System.out.println("Enter details for reservation id");
    Reservation_id=f.nextLine();
    System.out.println("Enter room id");
    Room_id=f.nextInt();
    System.out.println("Enter room rate");
    Room_rate=f.nextInt();
}




//calculate number of days and it will store it in numberNights
    public double calcPrice() {
        long numberNights = ChronoUnit.DAYS.between(startingDate, endingDate);
        return ++numberNights*Room_rate;
    }
     
     public void Fatima_printdates() {
        System.out.println("Starting Date: " + startingDate);
        System.out.println("Ending Date: " + endingDate);
        System.out.println("Total Price: " + calcPrice());
        System.out.println("Reservation: " + Reservation_id);
        System.out.println("Room id: " + Room_id);
        System.out.println("Room rate: "+ Room_rate);
    }


}
     
    public class JavaApplication32 {
    public static void main(String[] args) {
     Fatima_  room1= new Fatima_("2025-12-20","2025-12-24","111",1111,50); //will go to //constructor to create object with five value
      room1.Fatima_inputInfo();
      room1.Fatima_printdates();
             
     
     
    }
                                         
}