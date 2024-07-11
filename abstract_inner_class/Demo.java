package abstract_inner_class;

abstract class A {
    public abstract void show();
}

public class Demo {
    public static void main(String[] args) {
        A obj;
        obj = new A() {
            public void show() {
                System.out.println("abstract inner class");
            }
        };
        obj.show();
    }
}

/*
 * abstract inner class is a class that is declared as abstract and is defined within another class.
 * It is used to provide the implementation of the interface.
 *
 * */