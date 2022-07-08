package InitializationBlockAndInitializationOrder;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

public class Main {
    static int i = 13;
    String name ;
    static A a = new A();


    public Main() {
        this("Main");
        System.out.println("in Main()");
    }

    public Main(String name) {
        this.name = name;
        System.out.println("in Main(String name)");
    }

    public static void main(String[] args) {
        System.out.println("**************");
        System.out.println("in main()");
        System.out.println("**************");
        System.out.println(Main.i);
        System.out.println("**************");
        Main m = new Main();
    }

    C c = new C();
    static int[] ints = new int[10];
    static{
        System.out.println("initializing the int array");
        for (int j = 0; j < ints.length; j++) {
            ints[j] = j *10;
        }
    }
    boolean[] booleans = new boolean[10];
    {
        System.out.println("initializing the boolean array");
        for (int j = 0; j < booleans.length; j++) {
            booleans[j] = true;
            
        }
    }

    public static final D d = new D();

}
class A{
    public A() {
        System.out.println("in A()");
    }
    C c = new C();
}
class B{
    public B() {
        System.out.println("in B()");

    }
    public void f(){
        System.out.println("in f()");
    }
}

class C{
    static B b = new B();

    public C() {
        System.out.println("in C()");
    }
    static void g(){
        System.out.println("in g()");
    }

}
class D{
    static int i;

    static {
        i = 65;
        System.out.println("i : " + i);
    }

    public D() {
        System.out.println("in D()");
    }
}
