/**
 *
 */
public class VarArgsExample {

    public static void main(String[] args) {

        String dog = "Burek";
        String cat = "Puszek";
        String hamster = "Kropka";
        String cageSize = "100";

        animalPrint(cageSize, cat, hamster);

    }

    private static void animalPrint(String cageSize, String... stringTable) {

        System.out.printf("Cage size: %s%n", cageSize);

        for (String s : stringTable) {
            System.out.println(s);
        }
    }

}
