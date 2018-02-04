/**
 *
 */
public class Box<T> {

    private T inBox;

    public Box(T toBox) {
        this.inBox = toBox;
    }

    public T getInBox() {
        return inBox;
    }
}
