public class SportsCar extends Car {

    public SportsCar(String typeName) {
        super(typeName);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {

            setSpeed(getSpeed() + 20);
            consumeFuel(5);
        } else {
            setSpeed(0);
        }
    }

    @Override
    public void decelerate(int amount) {
        if (getGasolineLevel() > 0) {
            if (amount > 0) {
                setSpeed(Math.max(0, getSpeed() - (amount * 2)));
                consumeFuel(2);
            }
        } else {
            setSpeed(0);
        }
    }

    private void consumeFuel(double amount) {
        double newLevel = Math.max(0, getGasolineLevel() - amount);
        setGasolineLevel(newLevel);
    }

    private void setSpeed(double speed) {
        try {
            java.lang.reflect.Field field = Car.class.getDeclaredField("speed");
            field.setAccessible(true);
            field.set(this, speed);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setGasolineLevel(double gasolineLevel) {
        try {
            java.lang.reflect.Field field = Car.class.getDeclaredField("gasolineLevel");
            field.setAccessible(true);
            field.set(this, gasolineLevel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
