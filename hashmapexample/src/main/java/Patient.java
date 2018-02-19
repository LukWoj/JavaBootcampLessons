/**
 *
 */
public class Patient {


    private String name;
    private String pesel;

    public Patient(String name, String pesel) {
        this.name = name;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getPesel() {
        return pesel;
    }
}
