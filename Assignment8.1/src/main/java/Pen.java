//8.1 Unit Testing Task 1.

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; }
        @Override public String toString() { return color; }
    }

    private Color color;
    private Color requestedColor;
    private boolean capped;

    public Pen() {
        this(Color.RED);
    }

    public Pen(Color color) {
        this.color = color;
        this.requestedColor = color;
        this.capped = true;
    }

    public void capOn() {
        this.capped = true;
    }

    public void capOff() {
        this.capped = false;
        // Switch to the requested color only now
        this.color = this.requestedColor;
    }

    public void changeColor(Color newColor) {
        this.requestedColor = newColor;
        // Only change "color" if capped and we uncap later
        if (!capped) {
            // Keep old color until recapped/re-uncapped
            // Do nothing here
        }
    }

    public String draw() {
        if (capped) {
            return "";
        }
        return "Drawing " + color.toString();
}
}