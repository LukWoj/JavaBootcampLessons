/**
 *
 */
public class Person {


    private String name;

    public Person(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        } else if (!(object instanceof Person)) {
            return false;
        } else {
            return name.equals(((Person) object).getName());
        }
    }


}
