package Overloading;

public class Main {
    public static void main(String[] args) {
        over(5,5);
        over(2.3 ,4.1);
    }

    public static void over(int i1 , int i2){
        System.out.println("int + int :" + i1 + i2);
    }
    public static void over(double v1, double v2){
        System.out.println("double + double : " + v1 + v2);
    }
}
