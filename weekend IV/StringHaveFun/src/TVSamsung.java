import driver.SamsungDriver;


public class TVSamsung implements TV {

    private SamsungDriver driver;

    public TVSamsung() {
        this.driver = new SamsungDriver();
    }

    @Override
    public void shutDown() {
        driver.turnOff();
    }
}
