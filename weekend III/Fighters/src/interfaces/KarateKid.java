package interfaces;

import java.util.Random;

public class KarateKid implements Fighter {

    private String name;
    private int energy;

    public KarateKid(String name) {
        this.name = name;
        this.energy = 100;
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
        energy -= punchForce*2;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getEnergy() {
        return energy;
    }
}
