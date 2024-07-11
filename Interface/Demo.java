package Interface;

interface Computer {
    void code();

}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run : faster");
    }
}

class Developer {
    public void devApp(Computer comp) {
        comp.code();
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer aryan = new Developer();
        aryan.devApp(lap);
    }
}

/*
 *  interface is a blueprint of a class
 * it has static constants and abstract methods
 * it can have default methods, static methods, and private methods
 * it is used to achieve abstraction and multiple inheritance
 * it can be used to achieve loose coupling
 *
 * */