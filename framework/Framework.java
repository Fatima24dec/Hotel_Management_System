/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.ConsoleHandler;
import javaapplication51.javaapplication51;

/**
 *
 * @fatima
 */

    
class Fatima_ {   
    
    private static final Logger logger = Logger.getLogger(javaapplication51.class.getName());
    private LocalDate startingDate;
    private LocalDate endingDate;
    String Reservation_id; 
    int Room_id;
    int Room_rate; 


public Fatima_(String f,String a,String r,int id,int rate ){
     logger.info("Application started");
logger.setLevel(Level.ALL);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINE);
        logger.addHandler(handler);
         logger.info("To exit you can press the button home");
         logger.warning("Sorry for that");
         logger.fine("When shutting down press ctrl x");
         
         
          logger.info("Application finished");
          
    
    
    
          
          
    this.startingDate=LocalDate.parse(f);
    this.endingDate=LocalDate.parse(a);
    this.Reservation_id=r;
    this.Room_id=id;
    this.Room_rate=rate;
           
            }




    
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


    public double calcPrice() {
        long numberNights = ChronoUnit.DAYS.between(startingDate, endingDate);
        try {
            int Room_rate=50;
            int ff=Room_rate/0;
        }
        catch (ArithmeticException e){
            logger.info("The information is correct"+e);
        }
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
  
  
public class javaapplication51{
        
      
  public static void main(String[] args) {
     Fatima_  room1= new Fatima_("2025-12-20","2025-12-24","111",1111,50);
      room1.Fatima_inputInfo();
      room1.Fatima_printdates();
    
       
    }}
