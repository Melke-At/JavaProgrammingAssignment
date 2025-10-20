public class Clock {

    private static Clock instance = null;

    private int currentTime;

    private Clock() {
        this.currentTime = 0;
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public void setTime(int newTime) {
        this.currentTime = newTime;
    }

    public int getTime() {
        return this.currentTime;
    }

    public void advanceTime(int step) {
        this.currentTime += step;
    }

    public void showTime() {
        System.out.
