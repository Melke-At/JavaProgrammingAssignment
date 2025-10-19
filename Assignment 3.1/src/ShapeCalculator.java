public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("Shape Calculator with Colors\n");

        Shape[] shapes = {
                new Circle(5.0, "Red"),
                new Rectangle(4.0, 6.0, "Blue"),
                new Triangle(3.0, 8.0, "Green")
        };

        for (Shape s : shapes) {
            System.out.println("Area of " + s + ": " + s.calculateArea());
        }
    }
}
