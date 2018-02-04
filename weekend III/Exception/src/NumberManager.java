import java.util.Optional;

/**
 *
 */
public class NumberManager {

    int[] table;

    public NumberManager(int[] table) {
        this.table = table;
    }

    public int findMinWithException() throws TableIsNullException, EmptyTableException {
        if(table == null) {
            throw new TableIsNullException();
        }
        if (table.length == 0) {
            throw new EmptyTableException();
        }

        int min = Integer.MAX_VALUE;
        for (int i : table) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public Optional<Integer> findMinWithOptional() {
        if (table == null || table.length == 0) {
            return Optional.empty();
        }

        int min = Integer.MAX_VALUE;
        for (int i : table) {
            if (i < min) {
                min = i;
            }
        }
        return Optional.of(min);

    }

    public Integer findMinWtihNull () {
        if (table == null || table.length == 0) {
            return null;
        }

        int min = Integer.MAX_VALUE;
        for (int i : table) {
            if (i < min) {
                min = i;
            }
        }
        return min;

    }
}
