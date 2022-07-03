package UseThis.Example1;

public class Customer {
    public String name;
    public int id;

    public CreditCard cc;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setCc(CreditCard cc) {
        this.cc = cc;
    }
}
