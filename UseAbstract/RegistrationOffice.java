package UseAbstract;

import java.util.ArrayList;
import java.util.List;

public class RegistrationOffice {

    public static List<Student > studentsList;


    static {
        studentsList = new ArrayList<>();
    }


    public static void registerStudent(Student s){
        studentsList.add(s);
    }

    public static Student getAStudent(int no){
        Student stu =null;
        for (Student s :
                studentsList) {
            if(s.no == no){
                stu = s;
            }
        }
        return stu;
    }
    public static void getAllStudent(){
        for (Student s :
                studentsList) {
            System.out.println(s.toString());
        }
    }

}
