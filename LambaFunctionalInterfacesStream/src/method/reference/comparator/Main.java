package method.reference.comparator;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		String[] names = { "Kowalski", "Abacki", "Wojnarek", "Bednarek", "Krzywousty" };
		consumeArray(names, x -> System.out.println(x));
		Arrays.sort(names, Main::sortAscending);

		consumeArray(names, System.out::println);
		System.out.println(">>>");
		Arrays.sort(names, Main::sortDescending);
		System.out.println(">>>");
		consumeArray(names, System.out::println);

	}

	private static <T> void consumeArray(T[] arr, Consumer consumer) {
		for (T t : arr) {
			consumer.accept(t);
		}
	}

	private static int sortAscending(String o1, String o2) {
		return o1.compareTo(o2);

	}

	private static int sortDescending(String o1, String o2) {
		return -o1.compareTo(o2);
	}

}