package ExceptionManagementExamples.CheckedAndUncheckedExceptionExample.UncheckedException;

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("ahmet", 5);
        Director d = new Director("selim", 9);


        double Msalary = PaySalaryOffice.getSalary(m);
        System.out.println("manager salary : " + Msalary);
        double Dsalary = PaySalaryOffice.getSalary(d);
        System.out.println("director salary : " + Dsalary);
//        try {
//            double Msalary = PaySalaryOffice.getSalary(m);
//            System.out.println("manager salary : " + Msalary);
//            double Dsalary = PaySalaryOffice.getSalary(d);
//            System.out.println("director salary : " + Dsalary);
//        } catch (SalaryPaidOnBankExcaption e) {
//            e.printStackTrace();
//        }


    }
}
