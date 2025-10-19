public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, String blue) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
