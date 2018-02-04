import company.Taxi;
import company.TaxiCompany;

import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {

        Taxi[] taxiTable = new Taxi[3];

        taxiTable[0] = new Taxi("Mirosław", "Paliński", "Mercedes A180", 1);
        taxiTable[1] = new Taxi("Kamil", "Sołtysiak", "Ranault Laguna", 2);
        taxiTable[2] = new Taxi("Mirosław", "Wojciechowski", "Toyota Corolla", 3);

        TaxiCompany taxiCompany = new TaxiCompany(taxiTable);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please type customer surname and geographical coordinates");

        while (true) {
            String userInput = sc.nextLine();
            if (userInput.equals("exit")) {
                return;
            }
            System.out.println("customer desctipion:" + userInput);
            System.out.println(taxiCompany.taxiAvailable());
            System.out.println("amount of available taxi: " + taxiCompany.countAvailableTaxi());
        }
    }
}
