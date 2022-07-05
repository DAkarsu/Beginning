package UseAbstract;

import java.util.Date;

public class Test {
    public static void main(String[] args) {


        VocationalStudent voStudent = new VocationalStudent(3, "zeynep", 2018, new Date(1542251L), "m");
        GraduateStudent graStudent = new GraduateStudent(45,"muzaffer",2020,new Date(584846565L),"mA","VELİ","tez1");
        UndergraduateStudent unStudent = new UndergraduateStudent(871,"ilayda",2014,new Date(5687431516456L),"maj","min");
        MasterStudent masStudent = new MasterStudent(593,"selim",2010,new Date(79999999L),"mmmaaa","kadir","tez2");
        PhdStudent phdStudent = new PhdStudent(999,"burak",2021,new Date(9999669696L),"major1","ahmet","tez42",true);

        Student s = RegistrationOffice.getAStudent(999);
        System.out.println(s.toString());

        System.out.println("---------");
        RegistrationOffice.getAllStudent();
    }
}
