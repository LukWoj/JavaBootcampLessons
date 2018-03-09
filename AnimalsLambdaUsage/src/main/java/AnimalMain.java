import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<Animal>();

        animalList.add(new Animal("Lion", true, true, true));
        animalList.add(new Animal("Dog", true, false, true));
        animalList.add(new Animal("Cat", false, true, true));
        animalList.add(new Animal("Ptasznik", false, true, false));
        //Zmianiamy na lambdy
        AnimalChecker checkJump = new CheckJump();
        //  AnimalChecker checkRun = new CheckRun();
        //AnimalChecker checkSpeak = new CheckSpeak();

        checker(animalList, s -> s.isCanJump());
        checker(animalList, checkJump);
        checker(animalList, s -> s.isCanRun());
    }

    private static void checker(List<Animal> animals, AnimalChecker animalChecker) {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " : " + animalChecker.checkSkill(animal));
        }
    }
}
