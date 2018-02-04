/**
 * kontener danych
 */
package hotel;

public class Room {
    private int number;// number of room in the hotel
    private boolean available;// status if room is available

    public Room(int number) {
        this.number = number;
        this.available = true;//default room status
    }

    public int getNumber() {
        return number;
    }

    public boolean isAvailable() {
        return available;
    }

    public void book() {         //hotel reservation. Turn status to false
        available = false;
    }

    public void free() {        //release room.turn status to true
        available = true;
    }
}
