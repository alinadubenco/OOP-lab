import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object(8);
        Object object3 = new Object(4, 5, 6);

        System.out.println("Volume for the first object: "+ object1.getBoxVolume());
        System.out.println("Volume for the second object: " + object2.getBoxVolume());
        System.out.println("Volume for the third object:  " + object3.getBoxVolume());
        System.out.println("Area for the third object: " + object3.getBoxArea());

    }
}
