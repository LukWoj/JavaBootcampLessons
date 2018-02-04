public class SmartTVHouse {

    private TV[] tv;

    public SmartTVHouse() {
        this.tv = new TV[2];
        tv[0] = new TVSony();
        tv[1] = new TVSamsung();
    }

    public void shutDownALLTV() {
        for (TV iterTV : tv) {
            iterTV.shutDown();
        }
    }
}

