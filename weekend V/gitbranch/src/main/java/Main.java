import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multiset.Entry;

import java.util.HashSet;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Andrzej");
        hashSet.add("Robert");
        hashSet.add("Robert");

        hashSet.contains("Robert");
        for (String s : hashSet) {
            System.out.println(s);
        }

        Multiset<String> multiset = HashMultiset.create();
        multiset.add("Andrzej");
        multiset.add("Robert");
        multiset.add("Robert");

        for (Entry<String> stringEntry : multiset.entrySet()) {
            System.out.println(stringEntry.getElement());
            System.out.println(stringEntry.getCount());
        }

    }

}
