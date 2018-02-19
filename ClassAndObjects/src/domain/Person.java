package domain;

/**
 *
 */
public class Person {

    //1
    private String name;
    private String surname;
    private int age;
    private boolean isAdult;

    //2
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isAdult = age >= 18;
    }
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = 0;
        this.isAdult = false;
    }
    public Person() {
    }

    //3
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isAdult() {
        return isAdult;
    }
}