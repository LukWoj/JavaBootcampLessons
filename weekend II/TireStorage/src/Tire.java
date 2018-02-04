public class Tire {
    private int width;
    private int profile;
    private int diameter;

    public Tire(int width, int profile, int diameter) {
        this.width = width;
        this.profile = profile;
        this.diameter = diameter;
    }

    public int getWidth() {
        return width;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getProfile() {
        return profile;
    }
}
