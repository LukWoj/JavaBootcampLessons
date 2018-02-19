package inheritance;

public class Boxer extends Fighter {

    public Boxer(String name) {
        super(name, 1000);
    }

    @Override
    public void punch(Fighter enemy) {
        enemy.takeHit(1000);
    }

    @Override
    public void takeHit(int punchForce) {
        energy -= punchForce/2;
    }
}
