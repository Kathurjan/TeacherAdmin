package BLL;

import Be.Student;
import Dal.ClassroomDao;
import javafx.collections.ObservableList;

public class Studentlogic {
    private ClassroomDao classroomDao;
    public Studentlogic() {
        classroomDao = new ClassroomDao();
    }

    public ObservableList<Student> getStudent(){
        return classroomDao.getStudent();
    }
    public ObservableList<Student> getStudent1(){
        return classroomDao.getStudent1();
    }
    public ObservableList<Student> getStudent2(){
        return classroomDao.getStudent2();
    }
    public ObservableList<Student> getStudent3(){
        return classroomDao.getStudent3();
    }
}
