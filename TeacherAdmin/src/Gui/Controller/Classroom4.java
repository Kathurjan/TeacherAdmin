package Gui.Controller;

import BLL.Studentlogic;
import Be.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
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
    @FXML
    private Button DeclineAccept;
    @FXML
    private Button AcceptReason;
    @FXML
    private TextArea absence;

    private Studentlogic studentlogic;
    @FXML
    private TableView<Student> Class4TableView;

    @FXML
    private TableColumn<Student, Double> StudentAbsence;

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
        StudentAbsence.setCellValueFactory((new PropertyValueFactory<Student,Double>("Absence")));

        System.out.println(studentlogic.getStudent());
        Class4TableView.setItems(studentlogic.getStudent());

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
    private   String ranStringGenerator(){
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

    @FXML
    private void DeclineAbsence(ActionEvent event) {
        Student student = Class4TableView.getSelectionModel().getSelectedItem();
        if (student == null){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("TeacherAdmin");
            alert.setHeaderText("about");
            alert.setContentText("nothing is selected");

            alert.showAndWait();
        }
        else{
            absence.setText("Absence declined");
        }
    }
    @FXML
    private void AcceptAbsence(ActionEvent event) {
        Student student = Class4TableView.getSelectionModel().getSelectedItem();
        if (student == null){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("TeacherAdmin");
            alert.setHeaderText("about");
            alert.setContentText("nothing is selected");

            alert.showAndWait();
        }
        else{
            absence.setText("Absence accepted and changed");
        }
    }

}
