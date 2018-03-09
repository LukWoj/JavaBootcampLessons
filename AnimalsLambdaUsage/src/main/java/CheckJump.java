public class CheckJump implements AnimalChecker {

    public boolean checkSkill(Animal animal) {
        return animal.isCanJump();
    }
}
