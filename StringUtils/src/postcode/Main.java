package postcode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Poprawny format kodu to xx-xxx, np. 93-313");
        System.out.println("Podaj kod pocztowy");
        Scanner sc = new Scanner(System.in);

        String postcode = sc.next();
        postCodeChecker(postcode);

    }

    /*public static boolean postCodeChecker2(String postcode) {
        char letter = '-';
        postcode.split("-");
        String[] tab = postcode.split("-");
        String part1 = tab[0];
        String part2 = tab[1];

    }*/

    public static void postCodeChecker(String postcode) {
        char letter = '-';
        for (int i = 0; i < postcode.length(); i++) {
            if (i == 2) continue;
            if (Character.isDigit(postcode.charAt(i)) && (postcode.length() == 5)) {
                System.out.println("a");
            } else {
                System.out.println("b");
            }
        }

    }
}
