package celebrities;

public class CheckIfDancer implements CheckTalent {

	@Override
	public boolean test(Celebrity celebrity) {
		return celebrity.canDance();
	}

}
