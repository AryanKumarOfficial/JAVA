package abstract_keyword;

abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("play car music");
    }
}

abstract class BMW extends Car {

    public void drive() {
        System.out.println("Driving...");
    }

}

class NewBmW extends BMW { // concrete class
    @Override
    public void fly() {

    }
}

public class Demo {
    public static void main(String[] args) {
        Car obj = new NewBmW();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}

/*
 * abstract class can have abstract methods and non-abstract methods.
 * abstract methods must be implemented by the subclass.
 * abstract class can have a constructor.
 * abstract class can have a main method.
 * abstract class can have a static method.
 * abstract class can have a final method.
 * abstract class can have a static variable.
 * abstract class can have a final variable.
 * abstract class can have a static block.
 * abstract class can have a final block.
 *
 * we can't create an object of an abstract class.
 * we need to define the abstract method in the subclass.
 *   if we don't define the abstract method in the subclass, then the subclass will also become an abstract class.
 * it is important to implement all the abstract methods in the subclass.
 * only an abstract subclass can  avoid it.
 * can only create object of a concrete class.
 * */