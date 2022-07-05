package UseAbstract;

import java.util.Date;

public class MasterStudent extends GraduateStudent{
    public int no;
    public String name;
    public int year;
    public Date dob;
    public String major;

    public MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
        this.no = no;
        this.name = name;
        this.year =year;
        this.dob =dob;
        this.major = major;
    }

    @Override
    public void writeThesis() {
        System.out.println("I am master student and I writed my thesis");
    }

    public void meetWithAdviseor(){
        System.out.println("I am master student and I'll meet my advisor ");
    }
    @Override
    public void study() {
        System.out.println("I am master student and I am study");
    }

    @Override
    public void register() {
        System.out.println("I am master student and I am a registered student");
    }

    @Override
    public String toString() {
        return "MasterStudent{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                '}';
    }
}
