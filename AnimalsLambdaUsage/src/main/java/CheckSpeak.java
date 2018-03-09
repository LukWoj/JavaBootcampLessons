public class CheckSpeak implements AnimalChecker {

    public boolean checkSkill(Animal animal) {
        return animal.isCanSpeak();
    }
}
