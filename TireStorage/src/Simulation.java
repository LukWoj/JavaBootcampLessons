public class Simulation {
// przeanalizować żonglowanie referencjami
    public static void main(String[] args) {

        TireStorage tireStorage =  new TireStorage();
        Tire tire;

        tire =  new Tire(175,70,15);//tutaj przepinamy referencje
        tireStorage.addTire(tire, 1,2,3);

        tire =  new Tire(155,50,13);
        tireStorage.addTire(tire, 1,1,1);

        tire =  new Tire(195,65,15);//tutaj przepinamy referencje
        tireStorage.addTire(tire, 1,2,3);

        System.out.println(tireStorage.countTires());
        System.out.println(tireStorage.getTire(1, 1, 1).getWidth());

    }
}


