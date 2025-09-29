import Controller.CurrencyController;
import Model.CurrencyModel;
import View.CurrencyView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        CurrencyModel model = new CurrencyModel();
        CurrencyView view = new CurrencyView();
        new CurrencyController(model, view);

        stage.setTitle("Currency Converter");
        stage.setScene(view.createScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
