package sort.method.reference.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers = numbers.stream().filter(x -> x % 2 == 0).filter(x -> x > 5).collect(Collectors.toList());
		// .collect(Collectors.toCollection(ArrayList::new));
		numbers.forEach(System.out::println);

		Stream<String> strings = Stream.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg");
		List<String> listOfString = strings.map(String::toUpperCase).peek(System.out::println)
				.collect(Collectors.toList());

		List<Integer> numbers2 = Stream.iterate(0, x -> x + 1).filter(x -> x > 100 && x < 1000 && x % 5 == 0).limit(10)
				.map(x -> x * 3).collect(Collectors.toList());
		numbers2.forEach(System.out::println);

		List<String> names = Arrays.asList("Karol", "Wojtek", "Alicja", "Bartek", "Romek");
		Collections.sort(names, String::compareToIgnoreCase);
		for (String name : names) {
			System.out.println(name);
		}
	}
}
