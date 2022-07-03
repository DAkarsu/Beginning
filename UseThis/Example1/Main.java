package UseThis.Example1;

public class Main {
    public static void main(String[] args) {
        Customer kemal = new Customer("kemal",1);
        CreditCard cc = new CreditCard("3",1000,kemal);


        System.out.println(kemal.cc.balance);
    }
}
