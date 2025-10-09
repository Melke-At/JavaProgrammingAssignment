package Application;

import controller.CurrencyController;
import entity.Currency_Converter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.List;

public class CurrencyView extends Application {

    private final CurrencyController controller = new CurrencyController();
    private ComboBox<String> fromBox;
    private ComboBox<String> toBox;
    private TextField amountField;
    private Label resultLabel;

    @Override
    public void start(Stage primaryStage) {
        fromBox = new ComboBox<>();
        toBox = new ComboBox<>();
        amountField = new TextField();
        resultLabel = new Label();

        Button convertBtn = new Button("Convert");
        convertBtn.setOnAction(e -> convert());

        Button addBtn = new Button("Add Currency");
        addBtn.setOnAction(e -> openAddCurrencyWindow());

        VBox root = new VBox(10,
                new Label("From:"), fromBox,
                new Label("To:"), toBox,
                new Label("Amount:"), amountField,
                convertBtn, resultLabel, addBtn);

        loadCurrencies();

        primaryStage.setScene(new Scene(root, 300, 400));
        primaryStage.setTitle("Currency Converter");
        primaryStage.show();
    }

    private void loadCurrencies() {
        fromBox.getItems().clear();
        toBox.getItems().clear();
        List<Currency_Converter> currencies = controller.getAllCurrencies();
        for (Currency_Converter c : currencies) {
            fromBox.getItems().add(c.getCode());
            toBox.getItems().add(c.getCode());
        }
        if (!currencies.isEmpty()) {
            fromBox.getSelectionModel().selectFirst();
            toBox.getSelectionModel().selectLast();
        }
    }

    private void convert() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            double result = controller.convert(amount, fromBox.getValue(), toBox.getValue());
            resultLabel.setText(String.format("%.2f", result));
        } catch (Exception e) {
            resultLabel.setText("Error: " + e.getMessage());
        }
    }

    private void openAddCurrencyWindow() {
        AddCurrencyView addView = new AddCurrencyView(controller);
        addView.showAndWait(); // Wait until closed
        loadCurrencies(); // Refresh list
    }

    public static void main(String[] args) {
        launch(args);
    }
}
