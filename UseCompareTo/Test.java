package UseCompareTo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        Employee[] list =t.createEmployee();
        System.out.println("------- before sort -------------");
        for (Employee e:
                list) {
            System.out.println(e.no);
        }
        System.out.println("------- after sort -------------");
        Arrays.sort(list);
        for (Employee e:
             list) {
            System.out.println(e.no);
        }

    }

    public Employee[] createEmployee(){
        Employee e1 = new Employee(2,"ahmet");
        Employee e2 = new Employee(86,"selim");
        Employee e3 = new Employee(66,"busra");
        Employee e4 = new Employee(10,"akın");
        Employee e5 = new Employee(45,"kadir");
        Employee e6 = new Employee(34,"salih");
        Employee e7 = new Employee(585,"hasan");
        Employee e8 = new Employee(13,"zeynep");
        Employee e9 = new Employee(783,"davut");
        Employee e10 = new Employee(9824,"ahmet");

        Employee[] list= new Employee[10];
        list[0]= e1;
        list[1]= e2;
        list[2]= e3;
        list[3]= e4;
        list[4]= e5;
        list[5]= e6;
        list[6]= e7;
        list[7]= e8;
        list[8]= e9;
        list[9]= e10;
        return list;
    }


}
