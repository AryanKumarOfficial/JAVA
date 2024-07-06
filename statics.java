class Mobile {
    String brand;
    int price;
    static String name; // it makes the member of Class not of object

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class statics {
    public static void main(String a[]) {

        Mobile m1 = new Mobile();
        m1.brand = "oppo";
        m1.price = 299;
        Mobile.name = "phone";
        m1.show();

        Mobile m2 = new Mobile();
        m2.brand = "Vivo";
        m2.price = 249;
        m2.show();
    }
}