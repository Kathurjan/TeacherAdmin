package Gui.Controller;

import BLL.Studentlogic;
import Be.Student;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
public class Classroom4 implements Initializable {
    @FXML
    private TextField screen;
    @FXML
    private Label SelectedStudent;
    @FXML
    private Label StudentMessage;
    private Studentlogic studentlogic;
    @FXML
    private TableView<Student> Class4TableView;

    @FXML
    private TableColumn<Student, Integer> StudentAbsence;

    @FXML
    private TableColumn<Student, String> StudentName;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        studentlogic = new Studentlogic();
        populateTableview();



    }
    @FXML
    private void populateTableview (){

        StudentName.setCellValueFactory((new PropertyValueFactory<Student,String>("name")));
        StudentAbsence.setCellValueFactory((new PropertyValueFactory<Student,Integer>("Absence")));

        System.out.println(studentlogic.getStudent3());
        Class4TableView.setItems(studentlogic.getStudent3());

    }
    @FXML
    private void displaySelected(MouseEvent mouseEvent) throws NullPointerException {
        Student student = Class4TableView.getSelectionModel().getSelectedItem();
        if (student.equals(null)){
            SelectedStudent.setText("Nothing Selected");
        }
        else{
            String name = student.getName();
            SelectedStudent.setText(name);
            screen.setText(ranStringGenerator());

            //System.out.println(ranStringGenerator());
        }
    }
    @FXML
    private String ranStringGenerator(){
        Random random = new Random();
        int x = random.nextInt(5)+1;
        String message = "";
        if (x == 1){
            message = "I was here for like 3 hours, but had to leave early";
        }
        if (x == 2){
            message = "There is a mistake, it says i was not here on the 5th but I was";
        }
        if (x == 3){
            message= "";
        }
        if (x == 4){
            message = "I was not here last week, but you marked me down as I was";
        }
        if (x == 5){
            message = "I was here monday, but had to leave early";
        }
        return message;
    }

}
