package Controller;

import javafx.animation.AnimationTimer;
import Model.Pet;
import View.PetView;

public class PetController {
    private final Pet pet;
    private final PetView view;

    private Double targetX = null;
    private Double targetY = null;

    public PetController(Pet pet, PetView view) {
        this.pet = pet;
        this.view = view;

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
            }
        };
        timer.start();
    }

    public void setTarget(double x, double y) {
        this.targetX = x;
        this.targetY = y;
    }

    public void clearTarget() {
        this.targetX = null;
        this.targetY = null;
    }

    private void update() {
        if (targetX != null && targetY != null) {
            pet.moveTowards(targetX, targetY);
        }
        view.drawPet(pet.getX(), pet.getY());
    }
}
