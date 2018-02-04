package interfaces;

/**
 *
 */
public interface Fighter {

    void punch(Fighter enemy);
    void takeHit(int punchForce);
    String getName();
    int getEnergy();
}
