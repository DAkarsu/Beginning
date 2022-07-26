package ExceptionManagementExamples.CheckedAndUncheckedExceptionExample.UncheckedException;

public class Director implements Employee {
    public String name;
    public int year;
    public static final double BASE_SALARY= 5000;

    public Director (String name, int year) {
        this.year = year;
        this.name = name;
    }
    @Override
    public double calculateSalary() {
        return (getYear() * 1000) + BASE_SALARY;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getYear() {
        return year;
    }
}
