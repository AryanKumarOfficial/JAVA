package SAM;

@FunctionalInterface
interface A {

    void show(int i);
}

//class B implements A {
//    @Override
//    public void show() {
//        System.out.println("Hello");
//    }
//}

public class Demo {
    public static void main(String[] args) {

//        A obj = new A() {
//            @Override
//            public void show() {
//                System.out.println("in show");
//            }
//        };
        A obj = i -> System.out.println("using lambda expression " + i);
        obj.show(10);


    }
}

/*
 *   1. In Java 8, we can create an object of an interface using anonymous class.
 *  2. In Java 8, we can create an object of an interface using lambda expression.
 * 3. In Java 8, we can create an object of an interface using method reference.
 * 4. In Java 8, we can create an object of an interface using constructor reference.
 * 5. In Java 8, we can create an object of an interface using static method reference.
 * 6. In Java 8, we can create an object of an interface using default method reference.
 *
 * lambda expression is a feature of Java 8. It provides a clear and concise way to represent one method interface using an expression.
 * It is very useful in collection library. It helps to iterate, filter and extract data from collection.
 * The Lambda expression is used to provide the implementation of an interface which has functional interface.
 * It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation.
 * Here, we just write the implementation code.
 *
 * */