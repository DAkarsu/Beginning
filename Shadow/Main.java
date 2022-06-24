package Shadow;

public class Main {

    private int myValue = 0;

    public static void main(String[] args) {

        new Main().shadowMethod();

    }

    public void shadowMethod() {
        /*
         *  tanimlanan yerel degisken yukaridaki nesne degiskeni ile
         *  ayni isme sahip oldugu icin nesne degiskenini golgeler
         */
        int myValue = 5;
        /*
         *  Basitçe 'myIntVar'a ulasirsak,
         *  aynı ada sahip  nesne degiskenini gölgeler
         */
        System.out.println("Local Variable : " + myValue);
        /*
         * golgelenmis olan nesne degiskenine ulasmak istersek
         * this key word ile ulasmaliyiz.
         */
        System.out.println("Instance Variable : " + this.myValue);


    }


}
