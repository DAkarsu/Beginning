package ExceptionManagementExamples.CheckedAndUncheckedExceptionExample.CheckedException;

public class SalaryPaidOnBankExcaption extends Exception{
    public String message;

    public SalaryPaidOnBankExcaption(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
