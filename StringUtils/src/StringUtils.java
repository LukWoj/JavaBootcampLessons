/**
 *
 */
public class StringUtils {

    public static void main(String[] args) {
        //TODO: porzadek
//          javaHasReferences();

        String testString = "test[logger][1,2,3,4,5,6]";

        String[] splited = testString.split(",");
        for (String s : splited) {
            System.out.println(s);
        }

        int length = testString.length();
        System.out.println(length);

        int bracketIndex = testString.indexOf("[");
        String substring = testString.substring(bracketIndex);
        System.out.println(substring);

        String replace = testString.replace(",", ".");
        System.out.println(replace);

        boolean ignoreCaseTest = "a".equalsIgnoreCase("A");
        System.out.println(ignoreCaseTest);

        String testChar = "1";
        String testChar2 = "B";
        char c = testChar.charAt(0);
        char c2 = testChar2.charAt(0);

        int asciiValue = (int) c2;
        if (asciiValue > 47 && asciiValue < 57) {
            System.out.println("This is number");
        }

        System.out.println(asciiValue);

        String joined = String.join(",", splited);
        System.out.println(joined);
        System.out.printf("There is %d string after splitting.", splited.length);
        //the same with String.format
        System.out.println(String.format("There is %d string after splitting.", splited.length));
    }
    /*private static void javaHasReferences() {
        String a = "test";
        String b = new String("test");

        boolean logic = (a.equals(b));
        System.out.println(logic);

        Person p1 = new Person("Andrzej", "Golota");
        Person p2 = new Person("Andrzej", "Golota");

        logic = (p1 == p2);
        System.out.println(logic);

        p1 = p2;
        logic = (p1 == p2);
        System.out.println(logic);

        logic = (p1.getName() == p2.getName());
        System.out.println(logic);
    }*/
}
