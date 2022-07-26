package ExceptionManagementExamples.CheckedAndUncheckedExceptionExample.UncheckedException;

public class PaySalaryOffice {
    public static double salary=0;
    public static double getSalary(Employee e)  {
        salary = e.calculateSalary();
        if(salary > 7000){
            throw new SalaryPaidOnBankExcaption("please go to bank");
        }
        return salary;
    }
}
