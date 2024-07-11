package enums;

enum Laptop {
    DELL(2000), HP, LENOVO(2100), ASUS(2999), ACER(30000);
    private int price;

    Laptop() {
        price = 1000;
    }

    Laptop(int price) {
        this.price = price;
        System.out.println("in laptop : " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enums {
    public static void main(String[] args) {
//        Laptop lap = Laptop.ACER;
//        System.out.println("Price of " + lap + " is " + lap.getPrice());
        for (Laptop lap : Laptop.values()) {
            System.out.println("Price of " + lap + " is " + lap.getPrice());
        }
    }
}

/*
 * Enums are used to create a group of constants with a common name.
 * It is a list of named constants.
 * Enums are used when we know all possible values at compile time.
 * Enums are used to create our own data type like classes.
 * Enums have their own methods, constructors, and fields.
 * Enums can implement many interfaces but cannot extend any class because it internally extends Enum class.
 * Enums can be declared as their own or inside a class.
 * Enums are implicitly static and final.
 * Enums can be used in switch statements.
 * Enums can have fields, constructors, and methods.
 * Enums can be used as a data type for variables.
 * Enums can have abstract methods.
 * Enums can override methods.
 *
 * */