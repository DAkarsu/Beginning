package UseAbstract;

import java.util.Date;

public class VocationalStudent extends Student {
    public int no;
    public String name;
    public int year;
    public Date dob;
    public String major;

    public VocationalStudent(int no, String name, int year, Date dob, String major) {
        super(no, name, year, dob, major);
        this.no = no;
        this.name = name;
        this.year =year;
        this.dob =dob;
        this.major = major;
    }


    @Override
    public void study() {
        System.out.println("I am vocational student and I am study");
    }

    @Override
    public void register() {

        System.out.println("I am a registered student");


    }

    @Override
    public String toString() {
        return "VocationalStudent{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                '}';
    }
}
