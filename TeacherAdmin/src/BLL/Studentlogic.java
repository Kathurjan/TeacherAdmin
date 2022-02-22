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
}
