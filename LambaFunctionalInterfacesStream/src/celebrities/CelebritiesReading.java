package celebrities;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CelebritiesReading {
	public static void main(String[] args) {
		List<Celebrity> celebrities = new ArrayList<Celebrity>();
		celebrities.add(new Celebrity("Justin Bieber", true, false, true));
		celebrities.add(new Celebrity("Kim Kardashian", false, false, false));
		celebrities.add(new Celebrity("Joanna Krupa", true, true, false));

// printSkills(celebrities, new CheckIfactor());
		printSkills(celebrities, x -> x.canSing());
	}

	private static void printSkills(List<Celebrity> celebrities, Predicate<Celebrity> checker) {
		for (Celebrity celebrity : celebrities) {
			System.out.println(checker.test(celebrity));
		}
	}
}	
// private static void printSkills(List<Celebrity> celebrities, CheckTalent checker) {
// for (Celebrity celebrity : celebrities) {
// System.out.println(checker.test(celebrity));
// }
//}



