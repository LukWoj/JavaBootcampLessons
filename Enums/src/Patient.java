/**
 *
 */
public class Patient {

    private String name;
    private Gender gender;

    public Patient(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
}
