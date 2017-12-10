import java.util.Scanner;

public class Runner {

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter which option you would like to perform: ");
//        String user_input = input.next();
//        System.out.println("You have chosen " + user_input);
//    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel("Manor");
        hotel.addBedrooms();
        Ui.welcome();
        Ui.showVacantRooms(hotel);
        Ui.checkInGuest(hotel);
    }

}
