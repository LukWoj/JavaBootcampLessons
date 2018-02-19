/**
 *
 */
public class Person {

    public static int COUNT_PERSON = 0;


    private String name;
    private String surname;

    public static Person createAnonim(String name) {
        Person person = new Person(name);//metodaFabryczna
        return person;
    }

    private Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        Person.COUNT_PERSON++;
    }

    private Person(String name) {
        this.name = name;
        Person.COUNT_PERSON++;
    }

    private String getName() {
        return name;
    }
}