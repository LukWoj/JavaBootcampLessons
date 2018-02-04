package hotel;

/**
 * klasa manager,
 * ktora zarzadza kolekcja
 * chcemy miec mozliwosc zarezerwowania pokoi
 * nie ma tu możliwosci zarzadzania tablica
 */
public class Hotel {
    private String name;
    private Room[] roomsTable;  // tabela pokoi

    public Hotel(String name, Room[] roomsTable) {
        this.name = name;
        this.roomsTable = roomsTable;
    }

    public int bookAvailableRoom() {  // makes reservation for the room
        for (Room room : roomsTable) {
            if (room.isAvailable()) {
                room.book();
                return room.getNumber();
            }
        }
        return -1;
    }

    public int countAvailableRooms() {
        int count = 0;
        for (Room room : roomsTable) {
            if (room.isAvailable()) {
                count++;
            }
        }
        return count;
    }
}
