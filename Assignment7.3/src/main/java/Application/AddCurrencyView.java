package Application;

import controller.CurrencyController;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;

public class AddCurrencyView extends Stage {
    public AddCurrencyView(CurrencyController controller) {
        setTitle("Add New Currency");
        initModality(Modality.APPLICATION_MODAL); // block main window

        TextField codeField = new TextField();
        TextField nameField = new TextField();
        TextField rateField = new TextField();
        Button saveBtn = new Button("Save");

        saveBtn.setOnAction(e -> {
            try {
                controller.addCurrency(codeField.getText(),
                        nameField.getText(),
                        Double.parseDouble(rateField.getText()));
                close();
            } catch (Exception ex) {
                new Alert(Alert.AlertType.ERROR, "Error: " + ex.getMessage()).showAndWait();
            }
        });

        VBox layout = new VBox(10,
                new Label("Code:"), codeField,
                new Label("Name:"), nameField,
                new Label("Rate to USD:"), rateField,
                saveBtn);
        layout.setPadding(new Insets(10));

        setScene(new Scene(layout, 250, 250));
    }
}
