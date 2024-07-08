package access_modifiers;


import Temp.A;

/**
 * private members can only be accessed within class itself
 * protected can be accessed in same package subclass,same package non-sub class and different package subclass but can't access by different package non-sub class.
 * public can be accessed everywhere.
 * default can be used in same package only.
 */

public class Entry {
    public static void main(String[] args) {
        A a = new A();
//        System.out.println(a.marks);
        a.show();
        B b = new B();
    }
}
