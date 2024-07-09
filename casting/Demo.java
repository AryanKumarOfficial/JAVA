package casting;

class A {
    public void show1() {
        System.out.println("A");
    }
}

class B extends A {
    public void show2() {
        System.out.println("B");
    }
}

public class Demo {
    public static void main(String[] args) {
        double d = 7.8965;
        System.out.println(d);
        int n = (int) d;
        System.out.println(n);
        A a = (A) new B(); // upcasting
        a.show1();
        B b = (B) a; // down casting
        b.show2();

    }
}

/*
 * type casting is a way to convert a variable from one data type to another data type.
 * In Java, there are two types of casting:
 * 1. Widening Casting (automatically) - converting a smaller type to a larger type size. ex: byte -> short -> char -> int -> long -> float -> double
 * 2. Narrowing Casting (manually) - converting a larger type to a smaller size type ex: double -> float -> long -> int -> char -> short -> byte
 *
 * */