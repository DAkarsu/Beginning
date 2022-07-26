package ExceptionManagementExamples.CheckedAndUncheckedExceptionExample.CheckedException;

public class Manager implements Employee{
    public String name;
    public int year;
    public static final double BASE_SALARY= 2000;

    public Manager(String name, int year) {
        this.year = year;
        this.name = name;
    }

    @Override
    public double getYear() {
        return year;
    }

    @Override
    public double calculateSalary() {
        return (getYear() * 1000) + BASE_SALARY;
    }

    @Override
    public String getName() {
        return name;
    }
}
