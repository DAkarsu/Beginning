package PassByValue;

public class PassByValue {
    int value = 8;


    public static void main(String[] args) {

        PassByValue aa = new PassByValue();

        int i = 8;

        aa.getValue(i);
        System.out.println("i : " + i);

        System.out.println("************");

        aa.getReference(aa);
        System.out.println("referance : " + aa.value);
    }

    public void getValue(int j) {
        j++;
    }

    public void getReference(PassByValue pass) {
        pass.value++;
    }
}
