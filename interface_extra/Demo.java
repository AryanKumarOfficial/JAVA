package interface_extra;

interface A {

    void show();

    void config();
}

interface X {
    void run();
}

interface Y extends A, X {
    void display();
}

class B implements A, Y {
    @Override
    public void display() {
        System.out.println("displaying...");
    }

    @Override
    public void show() {
        System.out.println("in show");
    }

    public void run() {
        System.out.println("running...");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }
}

public class Demo {
    public static void main(String[] args) {
        Y obj;
        obj = new B();
        obj.show();
        obj.config();
        obj.run();
    }
}

/*
 *  variables in interface are by default public, static and final
 * methods in interface are by default public and abstract
 * we can't create object of interface, but we can create reference of interface
 * we can't create object of interface, but we can create object of class which implements interface.
 *
 * interface can extend multiple interfaces
 * class can implement multiple interfaces
 * when a class implements multiple interfaces, it has to provide implementation of all methods of all interfaces
 * to extend an interface, use extends keyword
 * to implement an interface, use implements keyword
 * interface can extend multiple interfaces
 *
 * */