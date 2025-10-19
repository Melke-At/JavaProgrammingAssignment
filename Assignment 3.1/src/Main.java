public class Main {
    public static void main(String[] args) {
        SportsCar ferrari = new SportsCar("Ferrari");
        ferrari.fillTank();
        ferrari.accelerate();
        System.out.println(ferrari.getTypeName() + " speed: " + ferrari.getSpeed() + ", fuel: " + ferrari.getGasolineLevel());

        Bus cityBus = new Bus("City Bus", 50);
        cityBus.fillTank();
        cityBus.passengerEnter(30);
        cityBus.accelerate();
        System.out.println(cityBus.getTypeName() + " speed: " + cityBus.getSpeed() +
                ", fuel: " + cityBus.getGasolineLevel() +
                ", passengers: " + cityBus.getPassengers());
    }
}
