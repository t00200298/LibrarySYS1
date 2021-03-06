package LibrarySystem;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String Tnumber;
    private String name;
    private String course;
    private static int count=0;


    public Student(String Tnumber, String name, String course) {
        setId(id);
        setTnumber(Tnumber);
        setName(name);
        autoIncrement();
        setId(count);
        setCourse(course);
    }

    public String getTnumber() {
        return Tnumber;
    }

    private void autoIncrement(){
        count++;
    }

    public void setTnumber(String tnumber) {
        this.Tnumber = tnumber;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String toString() {
        return "\n\nName: " + getName();
    }
}
