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
import java.util.ResourceBundle;

public class Classroom1 implements Initializable {
    public TextField screen;
    public Label Selectedstudent;
    private Studentlogic studentlogic;
    @FXML
    private TableView<Student> Class1TableView;

    @FXML
    private TableColumn<Student, Integer> StudentAbsence;

    @FXML
    private TableColumn<Student, String> StudentName;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        studentlogic = new Studentlogic();
        populateTableview();




    }

    public void populateTableview (){

        StudentName.setCellValueFactory((new PropertyValueFactory<Student,String>("name")));
        StudentAbsence.setCellValueFactory((new PropertyValueFactory<Student,Integer>("Absence")));

        System.out.println(studentlogic.getStudent());
        Class1TableView.setItems(studentlogic.getStudent());

    }

    public void displaySelected(MouseEvent mouseEvent) {
        Student student = Class1TableView.getSelectionModel().getSelectedItem();
        if (student.equals(null)){
            Selectedstudent.setText("Nothing Selected");
        }
        else{
            String name = student.getName();
            Selectedstudent.setText(name);

        }
    }
}
