import inheritance.Boxer;
import inheritance.Fighter;
import inheritance.KarateKid;

import java.util.Scanner;

public class RoundOne {

    public static void main(String[] args) {

        Fighter[] fighterTable = createFighters();

        Fighter winner;

        Scanner inputReader = new Scanner(System.in);

        startFightSpeech(fighterTable);

        while(true) {
            interpretUserInput(fighterTable, inputReader);
            printFightersStats(fighterTable[0], fighterTable[1]);

            if(fighterTable[0].getEnergy() <= 0) {
                winner = fighterTable[1];
                break;
            } else if (fighterTable[1].getEnergy() <= 0) {
                winner = fighterTable[0];
                break;
            }
        }
        printWinner(winner);
    }

    private static Fighter[] createFighters() {
        Fighter[] fighterTable = new Fighter[2];
        fighterTable[0] = new Boxer("Andrzej Golota");
        fighterTable[1] = new KarateKid("Daniel Sun");
        return fighterTable;
    }

    private static void startFightSpeech(Fighter[] fighterTable) {
        //        String.format()
        System.out.printf("%nLaddies and Gentelment!!! In the red corener %s, in the blue corner %s",
                fighterTable[0].getName(), fighterTable[1].getName());
    }

    private static void interpretUserInput(Fighter[] fighterTable, Scanner inputReader) {
        String userInput = inputReader.next();
        if(userInput.equals("r")) {
            fighterTable[0].punch(fighterTable[1]);
        } else if (userInput.equals("b")) {
            fighterTable[1].punch(fighterTable[0]);
        } else {
            System.out.println("Boring! Buuuuuu!");
        }
    }

    private static void printWinner(Fighter winner) {
        System.out.printf("%nAnd the winner is %s", winner.getName());
    }

    private static void printFightersStats(Fighter red, Fighter blue) {
        System.out.printf("%nRed fighter: %s%nBlueFighter: %s",
                red.getEnergy(), blue.getEnergy());
    }
}
