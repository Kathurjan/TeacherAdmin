package Be;

public class Student {

    private String name;
    private int id;
    private float Absence;

    public Student(String name, int id, int absence) {
        this.name = name;
        this.id = id;
        this.Absence = absence;
    }


    public float getAbsence() {
        return Absence;
    }

    public void setAbsence(int absence) {
        Absence = absence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}
