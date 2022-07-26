package ForwardReference;

public class Main {
    // forward reference for secondNumber
    //double average = (firstNumber + secondNumber) / 2;
    static int firstNumber = 5;
    int secondNumber = 15;

    static {

        x = 4;
        y = 4;

    }

    static int x;
    static int y;

    static {
        w=4;
        //v = w;


    }

    static int v;
    static int w;

    // not forward reference
    int i = 3;
    double average2 = (i + j) / 2;
    static int j = 8;

    // not forward reference
    // but error because y = 0 : default value
    int xx = getY();
    int yy = 10;

    int getY() {
        return y;  // y = 0;
    }
}
