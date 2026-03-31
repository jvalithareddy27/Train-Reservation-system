package Railway;
import java.util.*;

public class RailwayMain {

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        ReservationSystem rs = new ReservationSystem();
        RailwayData train = new RailwayData();

        int choice;

        do{

        System.out.println("\n===== Railway Reservation System =====");
        System.out.println("1 Display Trains");
        System.out.println("2 Book Ticket");
        System.out.println("3 Cancel Ticket");
        System.out.println("4 Display Reservations");
        System.out.println("5 Add Waiting List");
        System.out.println("6 Display Waiting List");
        System.out.println("7 Undo Operation");
        System.out.println("8 Search Train");
        System.out.println("9 Search PNR");
        System.out.println("10 Sort Reservations");
        System.out.println("11 Display Sorted File");
        System.out.println("12 Exit");

        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        switch(choice)
        {

        case 1:
        train.displayTrain();
        break;

        case 2:
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Train No: ");
        int trainNo = sc.nextInt();

        System.out.print("Enter Seat No: ");
        int seat = sc.nextInt();

        rs.bookTicket(name, trainNo, seat);
        break;

        case 3:
        System.out.print("Enter PNR: ");
        int pnr = sc.nextInt();
        rs.cancelTicket(pnr);
        break;

        case 4:
        rs.displayReservation();
        break;

        case 5:
        sc.nextLine();
        System.out.print("Enter Name: ");
        String n = sc.nextLine();

        System.out.print("Enter Train No: ");
        int t = sc.nextInt();

        rs.addWaiting(n, t);
        break;

        case 6:
        rs.displayWaiting();
        break;

        case 7:
        rs.undo();
        break;

        case 8:
        System.out.print("Enter Train No: ");
        int key = sc.nextInt();
        train.searchTrain(key);
        break;

        case 9:
        System.out.print("Enter PNR: ");
        int search = sc.nextInt();
        rs.searchPNR(search);
        break;

        

        case 10:
        rs.sortReservations();
        break;

        case 11:
        rs.readSortedFile();
        break;
        case 12:
            System.out.println("Exiting program...");
            break;

        default:
        System.out.println("Invalid choice");

        }

        }while(choice != 10);

        sc.close();
    }
}
