package UseThis.Example2;

public class Main {
    public String str;
    public int i;
    public double d;

    public Main(String str, int i, double d) {
        this.str = str;
        this.i = i;
        this.d = d;
    }

    public Main(int i, double d) {

        this("str", i, d);
    }


    public Main(int i) {
        this(i,5.5);
    }

    public static void main(String[] args) {

        Main m = new Main(8);
        m.printInfo();
    }

    public void printInfo(){
        System.out.println("str : " + str +
                "\ni : " + i+
                "\nd : " + d);
    }
}
