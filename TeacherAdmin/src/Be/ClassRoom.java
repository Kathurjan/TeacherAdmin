package Be;

import java.util.ArrayList;

public class ClassRoom {

    int ID;
    String name;
    ArrayList<Student> studentsInclass;
    String TeacherName;

    public ClassRoom(int ID, String name, ArrayList<Student> studentsInclass, String teacherName) {
        this.ID = ID;
        this.name = name;
        this.studentsInclass = studentsInclass;
        TeacherName = teacherName;
    }




    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudentsInclass() {
        return studentsInclass;
    }

    public void setStudentsInclass(ArrayList<Student> studentsInclass) {
        this.studentsInclass = studentsInclass;
    }



}
