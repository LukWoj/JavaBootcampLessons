package lambda.loops;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		String[] a = { "cat", "dog", "mouse", "rat", "pig", "rabbit", "hamster", "parrot" };
		List<String> animals = Arrays.asList(a);
		animals.forEach(System.out::println);
		System.out.println("----------------------------->>>>>");
		Comparator<String> sortByName = (String s1, String s2) -> s1.compareTo(s2);
		Collections.sort(animals, sortByName);
		animals.forEach((animal) -> System.out.println(animal + "; "));
		System.out.println("----------------------------->>>>>");
		Collections.sort(animals, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		animals.forEach(System.out::println);
	}

}
