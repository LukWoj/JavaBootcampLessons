package celebrities;

public class CheckIfactor implements CheckTalent {

	@Override
	public boolean test(Celebrity celebrity) {
		return celebrity.canAct();
	}
}
