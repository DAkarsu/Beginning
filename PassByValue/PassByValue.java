package PassByValue;

public class PassByValue {
    int value = 8;


    public static void main(String[] args) {

        PassByValue value = new PassByValue();

        int i = 8;

        value.getValue(i);
        System.out.println("i : " + i);

        System.out.println("************");

        value.getReference(value);
        System.out.println("referance : " + value.value);
    }

    public void getValue(int j) {
        j++;
    }

    public void getReference(PassByValue pass) {
        pass.value++;
    }
}
