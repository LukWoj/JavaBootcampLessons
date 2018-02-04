import driver.SonyDriver;

public class TVSony implements TV {

    private SonyDriver driver;

    public TVSony() {
        this.driver = new SonyDriver();
    }

    @Override
    public void shutDown() {
        driver.turnOff();
    }
}
