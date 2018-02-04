/**
 *
 */
import hotel.Hotel;
import hotel.Room;
import java.util.Scanner;

public class Simulator {
    public static void main(String[] args) {

        Room[] roomsTable = new Room[4];

        roomsTable[0] = new Room(1);
        roomsTable[1] = new Room(2);
        roomsTable[2] = new Room(3);
        roomsTable[3] = new Room(4);

        Hotel ibis = new Hotel("ibis", roomsTable);

        Scanner scanner = new Scanner(System.in);

        while(true) {
            String userInput = scanner.next();

            if(userInput.equals("exit")) {
                return;
            }

            System.out.println("Book room number: " + ibis.bookAvailableRoom());
            System.out.println("There are still " + ibis.countAvailableRooms() + " rooms.");
        }

    }
}