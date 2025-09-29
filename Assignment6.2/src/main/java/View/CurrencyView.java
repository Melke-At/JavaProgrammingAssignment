package View;

import Controller.CurrencyController;
import Model.Currency;
import Model.CurrencyModel;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CurrencyView extends Application {
    private final TextField inputAmount = new TextField();
    private final TextField outputAmount = new TextField();
    private final ComboBox<Currency> fromCurrency = new ComboBox<>();
    private final ComboBox<Currency> toCurrency = new ComboBox<>();
    private final Button convertButton = new Button("Convert");

    public Scene createScene() {
        Label inputLabel = new Label("Amount to Convert:");
        Label fromLabel = new Label("From Currency:");
        Label toLabel = new Label("To Currency:");
        Label resultLabel = new Label("Converted Amount:");

        outputAmount.setEditable(false);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setVgap(10);
        grid.setHgap(10);

        grid.add(inputLabel, 0, 0);
        grid.add(inputAmount, 1, 0);

        grid.add(fromLabel, 0, 1);
        grid.add(fromCurrency, 1, 1);

        grid.add(toLabel, 0, 2);
        grid.add(toCurrency, 1, 2);

        grid.add(convertButton, 1, 3);

        grid.add(resultLabel, 0, 4);
        grid.add(outputAmount, 1, 4);

        Label instructions = new Label("Enter an amount, select currencies, then click Convert.");
        grid.add(instructions, 0, 5, 2, 1);

        return new Scene(grid, 400, 300);
    }

    @Override
    public void start(Stage stage) {
        CurrencyModel model = new CurrencyModel();
        CurrencyView view = new CurrencyView();
        new CurrencyController(model, view);

        stage.setTitle("Currency Converter");
        stage.setScene(createScene());
        stage.show();
    }


    public TextField getInputAmount() { return inputAmount; }
    public TextField getOutputAmount() { return outputAmount; }
    public ComboBox<Currency> getFromCurrency() { return fromCurrency; }
    public ComboBox<Currency> getToCurrency() { return toCurrency; }
    public Button getConvertButton() { return convertButton; }
}
