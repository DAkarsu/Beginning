package ExceptionManagementExamples.CheckedAndUncheckedExceptionExample.CheckedException;

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("ahmet",5);
        Director d = new Director("selim",9);

        try {
            double Msalary = PaySalaryOffice.getSalary(m);
            System.out.println("manager salary : " + Msalary);
            double Dsalary = PaySalaryOffice.getSalary(d);
            System.out.println("director salary : " + Dsalary);
        } catch (SalaryPaidOnBankExcaption e) {
            e.printStackTrace();
        }


    }
}
