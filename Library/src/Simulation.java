/**
 * Stworzyć bibliotekę książek. Powinna zawierać
 * metodę pobierającą książkę z biblioteki,
 * metode wyswietlającą status biblioteki
 */


public class Simulation {

    public static void main(String[] args) {
        Library lib = new Library();
        System.out.println(lib.isAvaillable("Potop"));
        lib.borrowBook("Potop");
        System.out.println(lib.isAvaillable("Potop"));
    }
}
