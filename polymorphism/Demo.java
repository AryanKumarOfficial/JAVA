package polymorphism;

class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

class C extends A {
    @Override
    public void show() {
        System.out.println("in C show");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
        obj = new C();
        obj.show();
    }
}

/*
 * An object can have the type of its parent and the object of its subclass.
 * Here we are getting different behaviour each time, this is runtime polymorphism.
 * it is known as dynamic method dispatch.
 * only works with inheritance
 * */