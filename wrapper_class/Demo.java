package wrapper_class;

public class Demo {
    public static void main(String[] args) {
        int num = 7;
        //   Integer num1 = new Integer(num); //boxing
        Integer num1 = num; //autoboxing
        // int num2 = num1.intValue(); // unboxing
        int num2 = num1; // auto unboxing
        System.out.println(num2);

        String str = "123";
        Integer strNum = Integer.parseInt(str);
        System.out.println(strNum * 2);
    }
}

/*
 * boxing: converting primitive data type to object
 * unboxing: converting object to primitive data type
 * autoboxing: automatic conversion of primitive data type to object
 * auto unboxing: automatic conversion of object to primitive data type
 * wrapper class: It is a class which wraps the primitive data type and provides utility methods
 * for the primitive data type.
 * */