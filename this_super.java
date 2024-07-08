class A {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in parameterized const of A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("in B");
    }

    public B(int n) {
        this();
        System.out.println("in Parameterized const of B");
    }
}

public class this_super {
    public static void main(String[] args) {
//        B b = new B(10);
        B b = new B(10);
    }
}

/*
 * super() is by default present in the every constructor.
 * it means that call the constructor of the super class of default const.
 * to call the parameterized constructor we have to pass the parameter to super().
 * every class in java extends the class Object.
 * this() executes the constructor of the same class.
 * */
