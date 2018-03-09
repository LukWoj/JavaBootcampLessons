package functional.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
 
public class PersonOperators {
	
    public static void main(String[] args) {
    	
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jan", "Kowalski", 42));
		persons.add(new Person("Kasia", "Kruczkowska", 22));
		persons.add(new Person("Piotr", "Adamiak", 15));
		persons.add(new Person("Krzysztof", "Wojtyniak", 16));
		persons.add(new Person("Agnieszka", "Zagumna", 18));
		persons.add(new Person("Basia", "Cyniczna", 28));
		
		printListConsumer(persons, p -> System.out.println(p));
		System.out.println("----------------------------->>>>>");
		replaceFunction(persons, p -> {
			p.setAge(p.getAge() + 1);
			return p;
		});
		printListConsumer(persons, p -> System.out.println(p));
		System.out.println("----------------------------->>>>>");
		filterByPredicate(persons, p -> (p.getAge() > 18));
	} 

	// print collection
	private static <T> void printListConsumer(List<T> list, Consumer<T> printConsumer) {
		for (T t : list) {
			printConsumer.accept(t);
		}
	}

	// replace element of the collection
	private static <T> void replaceFunction(List<T> list, Function<T, T> function) {
		for (int i = 0; i < list.size(); i++) {
			function.apply(list.get(i));
		}
	}

	// check some condition
	private static <T> void filterByPredicate(List<T> list, Predicate<T> pre) {
		for (T t : list) {
			if (pre.test(t)) {
				System.out.println(t);
			}
		}
		System.out.println();
	}

}
