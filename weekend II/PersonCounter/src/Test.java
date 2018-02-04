/**
 *
 */
public class Test {

    public static void main(String[] args) {
        Person p1 = new Person("Tomek", "Wosiak");
        Person p2 = new Person("Krzysiek");
        Person person;
        Person.createAnonim("Mikołaj");
        Person.createAnonim("Mikołaj");
        System.out.println(Person.COUNT_PERSON);
        

    }
}
