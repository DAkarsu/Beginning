package ExceptionManagementExamples.Assertion;

public class Main {
    public static void main(String[] args) {
        int i = 134;
        assert i >8;

        assert i > 135 : "245' den buyuk olmalı " ;
    }
}
