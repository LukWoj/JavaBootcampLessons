package interfaces;

public class Boxer implements Fighter{

    private int energy;
    private String name;

    public Boxer(String name) {
        this.name = name;
        energy = 1000;
    }

    @Override
    public void punch(Fighter enemy) {
        enemy.takeHit(10000);
    }

    @Override
    public void takeHit(int punchForce) {
        energy -= punchForce/2;
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
