package ExceptionManagementExamples.CheckedAndUncheckedExceptionExample.UncheckedException;

public class SalaryPaidOnBankExcaption extends RuntimeException{
    public String message;

    public SalaryPaidOnBankExcaption(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
