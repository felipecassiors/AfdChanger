package afdchanger;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class ScreenController {

    public TextField dir;

    public Stage stage;

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void buttonAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Selecione o caminho do primeiro arquivo AFD");
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            dir.setText(file.getPath());
        }
    }
}