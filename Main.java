package afdchanger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    //public static FileChooser fileChooser;
    public static ScreenController screenController;

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen.fxml"));
        Parent root = loader.load();
        screenController = loader.getController();
        screenController.setStage(primaryStage);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

        /*
        Alert errorDialog = new Alert(Alert.AlertType.ERROR);

        char[] newSerialNumber = new char[17];

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            is = new FileInputStream("novo_numero_de_serie.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

            errorDialog.setTitle("Diálogo de Error");
            errorDialog.setHeaderText("Esse é o cabeçalho...");
            errorDialog.setContentText("UM ERROR!!! UM ERRO ACONTECEU!!! GEZUIS!");
            errorDialog.showAndWait();
        }
        isr = new InputStreamReader(is);
        br = new BufferedReader(isr);
        try {
            br.mark(18);
            br.reset();
            if (br.skip(18) == 17) {
                br.reset();
                br.read(newSerialNumber, 0, 17);
                br.close();
                for (char c : newSerialNumber) {
                    if (!Character.isDigit(c)) {
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            errorDialog.setTitle("Diálogo de Error");
            errorDialog.setHeaderText("Esse é o cabeçalho...");
            errorDialog.setContentText("UM ERROR!!! UM ERRO ACONTECEU!!! GEZUIS!");
            errorDialog.showAndWait();
        }

        File afd1 = new File("afd1.txt");

        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(afd1, "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            errorDialog.setTitle("Diálogo de Error");
            errorDialog.setHeaderText("Esse é o cabeçalho...");
            errorDialog.setContentText("UM ERROR!!! UM ERRO ACONTECEU!!! GEZUIS!");
            errorDialog.showAndWait();
        }
        try {
            raf.seek(187);
            for (char c : newSerialNumber) {
                raf.write(c);
            }
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
            errorDialog.setTitle("Diálogo de Error");
            errorDialog.setHeaderText("Esse é o cabeçalho...");
            errorDialog.setContentText("UM ERROR!!! UM ERRO ACONTECEU!!! GEZUIS!");
            errorDialog.showAndWait();
        }*/
    }

    public static void main(String[] args) {
        launch(args);
    }
}
