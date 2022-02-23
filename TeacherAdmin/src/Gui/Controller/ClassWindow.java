package Gui.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class ClassWindow implements Initializable {
    public TextField Notify;

    public void opencs1(ActionEvent actionEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("/Gui/view/Classroom1.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void opencs2(ActionEvent actionEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("/Gui/view/Classroom2.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void opencs3(ActionEvent actionEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("/Gui/view/Classroom3.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void opencs4(ActionEvent actionEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("/Gui/view/Classroom4.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void HideNotify(ActionEvent event) {
        if (!Notify.isVisible()){
            Notify.setVisible(true);
            Notify.setText(randNoti());
            System.out.println(randNoti());
        }
        else{
            Notify.setVisible(false);

        }

    }

    private String randNoti(){
        String rand = "";
        Random random = new Random();
        int x = random.nextInt(3);

        if (x == 1){
            rand = "";
        }
        else if (x == 2){
            rand = "you got a new from a student";
        }
        return rand;

    }
}
