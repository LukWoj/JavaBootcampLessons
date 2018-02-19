public class TireStorage {
    private int countTires;
    private Tire[][][] tireStorage;//tutaj nalezy hermetyzowac

    public TireStorage() {// konstruktor inicjalizujacy tablice
        tireStorage = new Tire[10][10][10];
        countTires=0;
    }

    public void addTire(Tire tire, int x, int y, int z) {
        if (tireStorage[x][y][z] == null) {//jesli pólka jest pusta
            tireStorage[x][y][z] = tire;
            countTires++;
        } else {
            System.out.println("This place is busy");
        }
    }

    public int countTires() {
        return countTires;
    }

    public Tire getTire(int x, int y, int z) {
        return tireStorage[x][y][z];
    }
}


//    public int countTiresWithLoops() {
//        int count = 0;
//        for (Tyre[][] tires2 : tireStorage) {
//            for (Tyre[] tires : tires2) {
//                for (Tyre tire : tires) {
//                    if (tire != null) {
//                        count++;
//                    }
//                }
//            }
//        }
//        return count;
//    }
