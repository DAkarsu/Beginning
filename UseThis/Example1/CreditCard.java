package UseThis.Example1;

public class CreditCard {
    public String no ;
    public double balance;

    public Customer c;

    public CreditCard(String no, double balance, Customer c) {
        this.no = no;
        this.balance = balance;
        this.c = c;
        c.setCc(this);
    }
}
