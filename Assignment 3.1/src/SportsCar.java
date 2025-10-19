public class SportsCar extends Car {

    public SportsCar(String typeName) {
        super(typeName);
    }

    public SportsCar(String typeName, int speed, double gasolineLevel) {
        super(typeName, speed, gasolineLevel);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            double newSpeed = getSpeed() + 25;
            double newFuel = getGasolineLevel() - 2;
            if (newFuel < 0) newFuel = 0;

            updateState(newSpeed, newFuel);
        } else {
            updateState(0, 0);
        }
    }

    @Override
    void decelerate(int amount) {
        if (getGasolineLevel() > 0) {
            double newSpeed = Math.max(0, getSpeed() - (amount + 5));
            updateState(newSpeed, getGasolineLevel());
        } else {
            updateState(0, 0);
        }
    }

    private void updateState(double speed, double fuel) {
        try {
            java.lang.reflect.Field speedField = Car.class.getDeclaredField("speed");
            java.lang.reflect.Field fuelField = Car.class.getDeclaredField("gasolineLevel");
            speedField.setAccessible(true);
            fuelField.setAccessible(true);
            speedField.set(this, speed);
            fuelField.set(this, fuel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
