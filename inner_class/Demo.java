package inner_class;

class A {
    private int age;

    public void show() {
    }

    static class B {
        public void config() {
            System.out.println("in config");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = new A.B();
        obj1.config();
    }
}

/*
 * inner class: class inside a class
 * 1. Member class
 * 2. Static class
 * 3. Anonymous class
 * 4. Local class
 * to create the object of inner class, we need to create the object of outer
 * class first,
 * and we can create the object of inner class using the object of outer class
 * also we can make the inner class static, so that we can create the object of
 * inner class without creating the object of outer class
 * only inner classes can be static. outer class can't be static
 */