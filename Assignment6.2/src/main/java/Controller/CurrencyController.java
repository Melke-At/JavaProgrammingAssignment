package Controller;

import Model.Currency;
import Model.CurrencyModel;
import View.CurrencyView;

public class CurrencyController {
    private final CurrencyModel model;
    private final CurrencyView view;

    public CurrencyController(CurrencyModel model, CurrencyView view) {
        this.model = model;
        this.view = view;

        // Load currencies into combo boxes
        view.getFromCurrency().getItems().addAll(model.getCurrencies());
        view.getToCurrency().getItems().addAll(model.getCurrencies());

        // Set defaults
        view.getFromCurrency().getSelectionModel().selectFirst();
        view.getToCurrency().getSelectionModel().select(1);

        // Handle conversion
        view.getConvertButton().setOnAction(e -> convertCurrency());
    }

    private void convertCurrency() {
        try {
            double amount = Double.parseDouble(view.getInputAmount().getText());
            Currency from = view.getFromCurrency().getValue();
            Currency to = view.getToCurrency().getValue();

            double result = model.convert(amount, from, to);
            view.getOutputAmount().setText(String.format("%.2f", result));
        } catch (NumberFormatException ex) {
            view.getOutputAmount().setText("Invalid input");
        }
    }
}

