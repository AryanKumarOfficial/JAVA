package annoynmous_class;

class A {
    public void show() {
        System.out.println("in A");
    }

    public void display() {
        System.out.println("displaying...");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
        obj.display();
    }
}

/*
 * anonymous class is a class that is declared without a name.
 * An anonymous class is created by instantiating an existing class or interface.
 * Anonymous classes are used to override methods of a class or an interface.
 * Anonymous classes are defined and instantiated in a single statement.
 * Anonymous classes are used to perform a task where a class is not required.
 *
 * */