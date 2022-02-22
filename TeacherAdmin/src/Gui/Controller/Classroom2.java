package Gui.Controller;

import BLL.Studentlogic;
import Be.Student;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;
public class Classroom2 implements Initializable {
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

        System.out.println(studentlogic.getStudent1());
        Class1TableView.setItems(studentlogic.getStudent1());

    }
}
