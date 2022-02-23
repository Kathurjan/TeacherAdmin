package Be;

public class Student {

    private String name;
    private int id;
    private double Absence;

    public Student(String name, int id, double absence) {
        this.name = name;
        this.id = id;
        this.Absence = absence;
    }


    public double getAbsence() {
        return Absence;
    }

    public void setAbsence(double absence) {
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
