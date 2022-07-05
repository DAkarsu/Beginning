package UseAbstract;

import java.util.Date;

public abstract class Student {
    public int no;
    public String name;
    public int year;
    public Date dob;
    public String major;


    public Student(int no, String name, int year, Date dob, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
        RegistrationOffice.registerStudent(this);

    }


    public boolean isAtSchool() {
        return true;
    }

     abstract void study();

     abstract void register();

}
