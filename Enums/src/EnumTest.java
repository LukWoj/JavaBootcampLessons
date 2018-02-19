public class EnumTest {

    public static void main(String[] args) {

        Patient danielSun = createPatient(Gender.MALE);

        Gender gender = danielSun.getGender();

        System.out.println(GenderClass.MALE.getPrettyDescription());

//        enumFromString();
//        allEnumValues();
//        ifChecking(danielSun);
//        switchChecing(danielSun);
    }

    private static void enumFromString() {
        System.out.println(GenderClass.valueOf("fdsa"));
    }

    private static void allEnumValues() {
        GenderClass[] values = GenderClass.values();
        for (GenderClass value : values) {
            System.out.println(value.ordinal());
        }
    }

    private static void switchChecing(Patient danielSun) {

        switch (danielSun.getGender()) {
            case MALE:
                System.out.println("Daniel Sun is male");
                break;
            case FEMALE:
                System.out.println("Daniel Sun is female");
                break;
            default:
                System.out.println("Daniel Sun is ... ?");
        }
    }

    private static void ifChecking(Patient danielSun) {
        if (danielSun.getGender() == Gender.MALE) {
            System.out.println("Daniel Sun is male");
        } else if (danielSun.getGender() == Gender.FEMALE) {
            System.out.println("Daniel Sun is female");
        } else {
            System.out.println("Daniel Sun is ... ?");
        }
    }

    private static Patient createPatient(Gender gender) {
        return new Patient("Daniel", gender);
    }
}
