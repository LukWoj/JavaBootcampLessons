package company;

/**
 * Taxi kontener danych
 */
public class Taxi {
    private String driverName;
    private String driverSurmane;
    private String carType;
    private int taxiID;
    private boolean available;

    public Taxi(String driverName, String driverSurmane, String carType, int taxiID) {
        this.driverName = driverName;
        this.driverSurmane = driverSurmane;
        this.carType = carType;
        this.taxiID = taxiID;
        this.available = true;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getDriverSurmane() {
        return driverSurmane;
    }

    public String getCarType() {
        return carType;
    }

    public int getTaxiID() {
        return taxiID;
    }

    public boolean isAvailable() {
        return available;
    }

    public void bookTaxi() {
        available = false;
    }

    public void freeTaxi() {
        available = true;
    }

    @Override
    public String toString() {
        return "Available taxi tescripion --> " +
                "driver name: " + getDriverName() + ", " +
                "driver surname: " + getDriverSurmane() + ", " +
                "car type: " + getCarType() + ", " +
                "taxi ID: " + getTaxiID();
    }
}
