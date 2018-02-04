import domain.Person;

/**
 *
 */
public class Run {

    public static void main(String[] args) {

        Person andrew = new Person("Andrzej", "Golota", 50);
        Person kris = new Person("Krzysztof", "Kowalski", 51);
        Person newBorn = new Person("Michalek", "Nowak");
        Person nullMen = new Person();

        System.out.println(stringFrom(andrew));
        System.out.println(stringFrom(kris));
        System.out.println(stringFrom(newBorn));
        System.out.println(stringFrom(nullMen));

    }

    public static String stringFrom(Person person) {
        return person.getName() + " " + person.getSurname() + " " + person.isAdult();
    }
}
