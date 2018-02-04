public enum GenderClass {

    MALE("This is man"), FEMALE("This is female"), NOT_KNOWN("This is ... ?");

    private String prettyDescription;

    private GenderClass(String prettyDesctiption) {
        this.prettyDescription = prettyDesctiption;
    }

    public String getPrettyDescription() {
        return prettyDescription;
    }

}
