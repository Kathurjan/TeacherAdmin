package Dal;


import Be.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;



public class ClassroomDao {


    public ObservableList<Student> getStudent(){

        ObservableList<Student> students1 = FXCollections.observableArrayList();

        students1.add(new Student("Bob",1,5.9));
        students1.add(new Student("Bob1",2,6.9));
        students1.add(new Student("Bob3",3,8.9));
        students1.add(new Student("Bob4",5,0));
        students1.add(new Student("Bob5",6,0));
        students1.add(new Student("Bob6",7,5.8));
        students1.add(new Student("Bob7",8,3.8));
        return students1;



    }

    public ObservableList<Student> getStudent1(){

        ObservableList<Student> students2 = FXCollections.observableArrayList();

        students2.add(new Student("Kevin",1,62/100));
        students2.add(new Student("Kevin1",2,51/100));
        students2.add(new Student("Kevin3",3,53/100));
        students2.add(new Student("Kevin4",5,54/100));
        students2.add(new Student("Kevin5",6,54/100));
        students2.add(new Student("Kevin6",7,54/100));
        students2.add(new Student("Kevin7",8,54/100));
        return students2;



    }

    public ObservableList<Student> getStudent2(){

        ObservableList<Student> students3 = FXCollections.observableArrayList();

        students3.add(new Student("Emily",1,62/100));
        students3.add(new Student("Emily1",2,51/100));
        students3.add(new Student("Emily3",3,53/100));
        students3.add(new Student("Emily4",5,54/100));
        students3.add(new Student("Emily5",6,54/100));
        students3.add(new Student("Emily6",7,54/100));
        students3.add(new Student("Emily7",8,54/100));
        return students3;



    }

    public ObservableList<Student> getStudent3(){

        ObservableList<Student> students4 = FXCollections.observableArrayList();

        students4.add(new Student("Mani",1,62/100));
        students4.add(new Student("Mani1",2,51/100));
        students4.add(new Student("Mani3",3,53/100));
        students4.add(new Student("Mani4",5,54/100));
        students4.add(new Student("Mani5",6,54/100));
        students4.add(new Student("Mani6",7,54/100));
        students4.add(new Student("Mani7",8,54/100));
        return students4;



    }
}
