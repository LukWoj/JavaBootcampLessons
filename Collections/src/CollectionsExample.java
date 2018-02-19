import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class CollectionsExample {

    public static void main(String[] args) {

//        String[] stringTable = new String[2];
//        stringTable[0] = "Hello";
//        stringTable[1] = "Good bay";
        
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Good bay");
        stringList.add("Hello again");

//        loopExamples(stringList);

        modificationsExamples(stringList);
    }

    private static void modificationsExamples(List<String> stringList) {
        for (String s : stringList) {
//            System.out.println(s);
            //not allow - ConcurrentModificationException
//            stringList.remove("s");
//            stringList.add("s");
        }

        for (int i = 0; i < stringList.size(); i++) {
//            System.out.println(stringList.get(i));
            //this is ok
//            stringList.remove(i);
        }

        Iterator<String> iterator = stringList.iterator();

        while (iterator.hasNext()) {
            String iterString = iterator.next();
            System.out.println(iterString);
            iterator.remove();
            //not allow - ConcurrentModificationException
//            stringList.remove(iterString);
//            stringList.add("s");
        }

        int size = stringList.size();
        System.out.println(size);
    }

    private static void loopExamples(List<String> stringList) {
        for (String s : stringList) {
            System.out.println(s);
        }

        //more then one element in one iteration
        for (int i = 0; i < stringList.size()-1; i++) {
            System.out.println(stringList.get(i)+stringList.get(i+1));
        }

        Iterator<String> iterator = stringList.iterator();
        String previousString = iterator.next();

        while (iterator.hasNext()) {
            String currentString = iterator.next();
            System.out.println(previousString+currentString);
            previousString = currentString;
        }
    }
}
