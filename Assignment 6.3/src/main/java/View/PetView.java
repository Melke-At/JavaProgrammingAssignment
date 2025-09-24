package View;

import Controller.PetController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import Model.Pet;

public class PetView extends Application {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    private static final int PET_SIZE = 30;

    private GraphicsContext gc;
    private PetController controller;

    @Override
    public void start(Stage stage) {
        Pet pet = new Pet(WIDTH / 2.0, HEIGHT / 2.0);
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        gc = canvas.getGraphicsContext2D();

        controller = new PetController(pet, this);

        canvas.setOnMouseMoved(e -> controller.setTarget(e.getX(), e.getY()));
        canvas.setOnMouseExited(e -> controller.clearTarget());

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        stage.setTitle("Virtual Pet Walk (MVC)");
        stage.setScene(scene);
        stage.show();
    }

    public void drawPet(double x, double y) {
        gc.setFill(Color.LIGHTGREEN);
        gc.fillRect(0, 0, WIDTH, HEIGHT);

        gc.setFill(Color.ORANGE);
        gc.fillOval(x - PET_SIZE / 2.0, y - PET_SIZE / 2.0, PET_SIZE, PET_SIZE);
    }

    public static void main(String[] args) {
        launch();
    }
}
