class Mobile {
    String brand;
    int price;
    static String name; // it makes the member of Class not of object

    static {
        name = "phone";
        System.out.println("in static block");
    }

    public Mobile() {
        brand = "";
        price = 199;
        System.out.println("in constructor block");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class statics {
    public static void main(String a[]) throws ClassNotFoundException {

        Class.forName("Mobile");

//        Mobile m1 = new Mobile();
//        m1.brand = "oppo";
//        m1.price = 299;
//        Mobile.name = "phone";
//        m1.show();
//
//        Mobile m2 = new Mobile();
//        m2.brand = "Vivo";
//        m2.price = 249;
//        m2.show();
    }
}