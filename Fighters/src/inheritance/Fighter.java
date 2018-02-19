package inheritance;

public class Fighter {

    protected String name;
    protected int energy;

    public Fighter(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public void punch(Fighter enemy){
        enemy.takeHit(10);
    }

    public void takeHit(int punchForce){
        energy -= punchForce;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }
}
