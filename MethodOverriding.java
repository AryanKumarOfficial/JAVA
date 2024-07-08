/**
 * we can override the method of parent by providing the same name in the child
 */
class A {
    public void show() {
        System.out.println("in A show");
    }

    public void config() {
        System.out.println("in A config");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.config();
    }
}
