package ExceptionManagementExamples.CheckedAndUncheckedExceptionExample.CheckedException;

public class PaySalaryOffice {
    public static double salary=0;
    public static double getSalary(Employee e) throws SalaryPaidOnBankExcaption {
        salary = e.calculateSalary();
        if(salary > 7000){
            throw new SalaryPaidOnBankExcaption("please go to bank");
        }
        return salary;
    }
}
