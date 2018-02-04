/**
 *
 */
public class GenericsExample {

    public static void main(String[] args) {

        String toBox = "r";
        Box<String> box = new Box(toBox);
        String inBox = box.getInBox();

        Exception ex = new Exception();
        Box<Exception> boxEx = new Box(ex);
        Exception inBox1 = boxEx.getInBox();

        Person p = new Person();
        Box<Person> boxPerson = new Box(p);
        Person inBox2 = boxPerson.getInBox();

    }
}
