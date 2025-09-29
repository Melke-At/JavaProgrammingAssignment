package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import Model.Note;
import Model.Notebook;
import javafx.scene.input.KeyEvent;

public class NoteController {

    @FXML private TextField titleField;
    @FXML private TextArea contentArea;
    @FXML private Button addButton;
    @FXML private TextArea notesDisplay;

    private Notebook notebook;

    @FXML
    public void initialize() {
        notebook = new Notebook();

        addButton.setOnAction(event -> addNote());
    }

    private void updateNotesDisplay() {
        StringBuilder sb = new StringBuilder();
        for (Note n : notebook.getNotes()) {
            sb.append(n.toString());
        }
        notesDisplay.setText(sb.toString());
    }

    @FXML
    private void addNote() {
        String title = titleField.getText().trim();
        String content = contentArea.getText().trim();

        if (!title.isEmpty() && !content.isEmpty()) {
            Note note = new Note(title, content);
            notebook.addNote(note);
            updateNotesDisplay();

            titleField.clear();
            contentArea.clear();
        }
    }

}
