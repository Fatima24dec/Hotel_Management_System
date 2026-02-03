
import java.util.Scanner;


/**
 *
 * @author Fatima abbas
 */
public class JavaApplication3333333 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               int RoomID;
           String RoomType;
           double RoomPrice;
           
  Scanner  a= new Scanner(System.in);
  
  while (true) {
  System.out.println("Enter the Room ID? (positive number only);");
  RoomID = a.nextInt();
  if (RoomID >0) {
      break;
  }else{
      System.out.println("Invalid Room ID it must ba a positive number");
  }
  }
  {
  System.out.print("Enter Room Type:");
  RoomType = a.next();
  
  System.out.print("Enter Room Price:");
  RoomPrice = a.nextDouble();


    }
  
  {
      System.out.println("Hotel:");
      System.out.println("Room ID:" + RoomID);
      System.out.println("Room Type:" + RoomType);
      System.out.println("Room Price $:" + RoomPrice);
  }
}
    }