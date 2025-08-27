public class CoffeeMakerDemo {

    static class CoffeeMaker {
        private boolean isOn;
        private String coffeeType;
        private int coffeeAmount;

        public CoffeeMaker() {
            isOn = false;
            coffeeType = "normal";
            coffeeAmount = 10;
        }

        public void pressOnOff() {
            isOn = !isOn;
        }

        public boolean isOn() {
            return isOn;
        }

        public void setCoffeeType(String type) {
            if (isOn) {
                if (type.equalsIgnoreCase("normal") || type.equalsIgnoreCase("espresso")) {
                    coffeeType = type.toLowerCase();
                }
            }
        }

        public String getCoffeeType() {
            return coffeeType;
        }

        public void setCoffeeAmount(int amount) {
            if (isOn) {
                if (amount >= 10 && amount <= 80) {
                    coffeeAmount = amount;
                }
            }
        }

        public int getCoffeeAmount() {
            return coffeeAmount;
        }
    }

    public static void main(String[] args) {
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();

        System.out.println("coffee maker is on");
        myCoffeeMaker.pressOnOff();

        System.out.println("coffee type is espresso");
        myCoffeeMaker.setCoffeeType("espresso");

        System.out.println("coffee amount is 50 ml");
        myCoffeeMaker.setCoffeeAmount(50);

        System.out.println("coffee maker is off");
        myCoffeeMaker.pressOnOff();


    }
}
