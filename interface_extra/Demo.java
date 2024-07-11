package interface_extra;

interface A {
    int n = 10; //final and static
    String name = "asdf";

    void show();

    void config();
}

class B implements A {
    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.n);
        System.out.println(A.name);
    }
}

/*
 *  variables in interface are by default public, static and final
 * methods in interface are by default public and abstract
 * we can't create object of interface, but we can create reference of interface
 * we can't create object of interface, but we can create object of class which implements interface.
 *
 * */