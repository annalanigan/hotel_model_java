import People.Guest;
import Rooms.Bedroom;
import java.util.Scanner;

public class Ui {

    public static void welcome(){
        System.out.println("Welcome to The Manor.  Please enter one of the following:");
        System.out.println("Show - will show vacant rooms.");
        System.out.println("Check-in - to check a guest into a bedroom");
        System.out.println("check-out - to check out of a bedroom");
        System.out.println("Meeting - to book a party into a meeting room");
    }


    public static void showVacantRooms(Hotel hotel){
        System.out.println("The current Vacant rooms are: ");
        hotel.showAvailRooms2();
    }

    public static void checkInGuest(Hotel hotel) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name of the guest:");
        String guestName = scan.next();
        System.out.println("Please enter the vacant Room number:");
        String roomName = scan.next();
        System.out.println("Please enter the number of nights:");
        int duration = scan.nextInt();
        Guest newGuest = new Guest(guestName);
        hotel.checkInBed3(newGuest, roomName, duration);
        System.out.println();
        System.out.println(guestName + " has been checked into room " + roomName + " for " + duration + " nights");
    }

    public static void checkOutGuest(Hotel hotel){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Room number you wish to check guest out of:");
        String roomName = scan.next();
        Bedroom bedobject = hotel.getBedroomObject(roomName);
//        double billToPay = hotel.getBill(bedobject);
        hotel.checkOutBed(bedobject);
        System.out.println();
//        System.out.println("The final bill to pay is " + billToPay);
        System.out.println("Room " + roomName + " has been checked out.");
    }

//    public void bookIntoMeetingRoom(){
//
//    }

}
