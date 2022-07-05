package UseAbstract;

import java.util.Date;

public class UndergraduateStudent extends Student{
    public String minor;
    public int no;
    public String name;
    public int year;
    public Date dob;
    public String major;

    public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
        super(no, name, year, dob, major);
        this.minor = minor;
        this.no = no;
        this.name = name;
        this.year =year;
        this.dob =dob;
        this.major = major;
    }

    @Override
    public void study() {
        System.out.println("I am undergraduate student and I am study");
    }

    @Override
    public void register() {
        System.out.println("I am a registered student");
    }
}
