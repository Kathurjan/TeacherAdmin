package Dal;

import Be.ClassRoom;
import Be.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class ClassroomDao {


    public ObservableList<Student> getStudent(){

        ObservableList<Student> students1 = FXCollections.observableArrayList();

        students1.add(new Student("Bob",1,62/100));
        students1.add(new Student("Bob1",2,51/100));
        students1.add(new Student("Bob3",3,53/100));
        students1.add(new Student("Bob4",5,54/100));
        students1.add(new Student("Bob5",6,54/100));
        students1.add(new Student("Bob6",7,54/100));
        students1.add(new Student("Bob7",8,54/100));
        return students1;



    }
}
