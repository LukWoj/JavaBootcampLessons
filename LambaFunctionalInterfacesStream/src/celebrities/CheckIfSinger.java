package celebrities;

public class CheckIfSinger implements CheckTalent {
	@Override
	public boolean test(Celebrity celebrity) {
		return celebrity.canSing();
	}
}

