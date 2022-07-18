package HidingAndOverriding;

import PassByValue.PassByValue;

public class Main {
    public static int i=5;

    public static int calculate(){
        return i *2;
    }

    public void printInfo(){
        System.out.println(" i value in Main : " + Main.i);
        System.out.println(" calculate in Main : " + Main.calculate());

    }
}
class ChildClass extends Main{

    public static int calculate(){ // hiding ( same static  metod in Main)
        return i *5;
    }


    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        //c.printInfo();
        c.printInfoUsingSuper();
        Main m = new Main();


    }

    public void printInfo(){  // overriding ( same instance metod in Main )

        System.out.println(" i value in ChildClass : " + i);
        System.out.println(" calculate in ChildClass : " + calculate());
        System.out.println(" i value in Main : " + super.i);
        System.out.println(" calculate in Main : " + super.calculate());

    }

    // can overriding metod printInfo()
    // or
    // can call metod printInfo() in metod printInfoUsingSuper()

    public void printInfoUsingSuper(){
        super.printInfo();
        System.out.println(" i value in ChildClass : " + i);
        System.out.println(" calculate in ChildClass : " + calculate());

        // don't repeat yourself
    }

}
