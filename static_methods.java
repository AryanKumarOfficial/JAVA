class Phones {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Phones object) {
        System.out.println(object.brand + " : " + object.price + " : " + name);
    }
}

public class static_methods {
    public static void main(String a[]) {
        Phones p1 = new Phones();
        p1.brand = "Oppo";
        p1.price = 1299;
        Phones.name = "smartPhone";
        p1.show();

        Phones p2 = new Phones();
        p2.brand = "Apple";
        p2.price = 2199;
        Phones.name = "smartPhone";
        p2.show();
        Phones.show1(p1);
    }
}

/*
 * we can use static variables in static method but can't use non-static variables in static method.
 * we can call static method just by class name but can't call non-static methods using class name. - unable to determine which object to refer.
 * but we can do that by using passing an object
 *
 * */