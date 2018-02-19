import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 */
public class HashMapExample {

    public static void main(String[] args) {

//        hashSetWithOverrideEquealsAndHashCode();

//        hashMapPatientByPeselExample();

        HashMap<Person, House> personToHouse = new HashMap<>();

        House house1 = new House("Aleje Jerozolimskie");
        House house2 = new House("Hoża");
        House house3 = new House("Saska");
        House house4 = new House("Francuska");

        Person robert1 = new Person("Robert");
        personToHouse.put(new Person("Andrzej"), house1);
        personToHouse.put(robert1, house2);
        personToHouse.put(robert1, house3);
        personToHouse.put(new Person("Robert"), house4);

//        House houseTest = personToHouse.get(robert1);
//        System.out.println(houseTest.getAdress());
//
//        for (House house : personToHouse.values()) {
//            System.out.println(house.getAdress());
//        }

        for (Map.Entry<Person, House> entry : personToHouse.entrySet()) {
            String name = entry.getKey().getName();
            String adress = entry.getValue().getAdress();
            System.out.printf("%s , %s%n", name, adress);
        }
    }

    private static void hashMapPatientByPeselExample() {
        HashMap<String, Patient> hashMap = new HashMap<>();

        Patient andrzej = new Patient("Andrzej", "75061815625");
        Patient robert = new Patient("Robert", "22222222222");
        hashMap.put(andrzej.getPesel(), andrzej);
        hashMap.put(robert.getPesel(), robert);

        Patient patient = hashMap.get("75061815625");
        System.out.println(patient.getName());
    }

    private static void hashSetWithOverrideEquealsAndHashCode() {
        Collection<Person> collection = new HashSet<>();

        Person andrzej = new Person("Andrzej");
        Person robert = new Person("Robert");
        Person robert1 = new Person("Robert");
        Person robert2 = new Person("Robert");

        collection.add(andrzej);
        collection.add(robert);
        collection.add(robert1);

        for (Person s : collection) {
            System.out.println(s.getName() + " " + s.hashCode());
        }

        //this is extremely fast
        System.out.println(collection.contains(robert2));
    }
}
