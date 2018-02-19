package abstracts;

import java.util.Random;

public class KarateKid extends Fighter {


    public KarateKid(String name) {
        super(name, 100);
    }

    @Override
    public void punch(Fighter enemy) {
        enemy.takeHit(10);

        Random random = new Random();
        int comboProbability = random.nextInt(10);
        if (comboProbability == 1) {
            enemy.takeHit(100);
        }
    }

    @Override
    public void takeHit(int punchForce) {
        energy -= punchForce;
    }
}
