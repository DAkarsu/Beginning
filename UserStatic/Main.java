package UserStatic;

public class Main {
    public String name;
    public static int count;

    public Main(String name) {
        this.name = name;
        count++;
    }

    public static void main(String[] args) {
        Main m = new Main("a");
        Main m2 = new Main("b");
        System.out.println("count : " + count);
    }
}
