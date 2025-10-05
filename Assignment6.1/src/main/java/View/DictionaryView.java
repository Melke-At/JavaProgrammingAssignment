package View;

import Controller.DictionaryController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class DictionaryView extends Application {

    private DictionaryController controller = new DictionaryController();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Virtual Dictionary");

        Label instruction = new Label("Enter a word:");
        TextField wordInput = new TextField();
        wordInput.setPrefWidth(150);

        Button searchButton = new Button("Search");
        TextArea resultArea = new TextArea();
        resultArea.setEditable(false);
        resultArea.setPrefSize(300, 100);

        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(10));
        pane.setVgap(10);
        pane.setHgap(10);
        pane.setAlignment(Pos.CENTER);

        pane.getChildren().addAll(instruction, wordInput, searchButton, resultArea);

        searchButton.setOnAction(e -> {
            String word = wordInput.getText();
            String meaning = controller.search(word);
            resultArea.setText(meaning);
        });

        Scene scene = new Scene(pane, 400, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(DictionaryView.class);
    }
}
