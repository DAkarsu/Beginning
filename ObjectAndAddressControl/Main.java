package ObjectAndAddressControl;

public class Main {
    public int i;

    public Main() {
        this.i = 15;
    }

    public static void main(String[] args) {

        Main m = new Main();
        m.printInfo();

        Main copyM = m.copy();
        copyM.printInfo();


        if (m == copyM) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }

        System.out.println("----------");
        Main growMain = m.grow();
        growMain.printInfo();

        if (m == growMain) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }

    }

    public Main copy() {
        Main newM = new Main();
        return newM;
    }


    public Main grow() {
        i++;
        return this;
    }


    public void printInfo() {
        System.out.println("i : " + i);
    }

}
