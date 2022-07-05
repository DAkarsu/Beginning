package UseAbstract;

import java.util.Date;

public class PhdStudent extends GraduateStudent{
    public boolean qualifyingExamTaken;
    public int no;
    public String name;
    public int year;
    public Date dob;
    public String major;


    public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualifyingExamTaken ) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualifyingExamTaken = qualifyingExamTaken;
        this.no = no;
        this.name = name;
        this.year =year;
        this.dob =dob;
        this.major = major;
    }
    @Override
    public void writeThesis() {
        System.out.println("I am phd student and I writed my thesis");
    }

    public void meetWithAdviseor(){
        System.out.println("I am phd student and I'll meet my advisor ");
    }
    @Override
    public void study() {
        System.out.println("I am phd student and I am study");
    }

    @Override
    public void register() {
        System.out.println("I am phd student and I am a registered student");
    }

    @Override
    public String toString() {
        return "PhdStudent{" +
                "qualifyingExamTaken=" + qualifyingExamTaken +
                ", no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                '}';
    }
}
