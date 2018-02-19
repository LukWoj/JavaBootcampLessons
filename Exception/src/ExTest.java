import java.util.Optional;

/**
 *
 */
public class ExTest {

    public static void main(String[] args) {

        NumberManager manager = new NumberManager(new int[0]);

        tryCatchTest(manager);

        optionalTest(manager);

        nullTest(manager);

    }

    private static void nullTest(NumberManager manager) {
        Integer minWithNull = manager.findMinWtihNull();
        System.out.println(minWithNull);
    }

    private static void optionalTest(NumberManager manager) {
        Optional<Integer> minWithOptional = manager.findMinWithOptional();

        if (minWithOptional.isPresent()) {
            Integer integer = minWithOptional.get();
            System.out.println(integer);
        } else {
            System.out.println("There was no result when searching min value.");
        }
    }

    private static void tryCatchTest(NumberManager manager) {
        try {
            System.out.println(manager.findMinWithException());

        } catch (TableIsNullException ex) {
            System.out.println(ex.getMessage());
            System.out.println("There is no min in this table.");
        } catch (EmptyTableException ex) {
            System.out.println(ex.getMessage());
            System.out.println("There is no min in this table.");
        }
    }
}
