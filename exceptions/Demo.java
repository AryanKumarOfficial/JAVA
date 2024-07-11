package exceptions;

public class Demo {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        int[] num = new int[6];
        String str = null;
        try {
            j = 18 / i;
            System.out.println(num[0]);
            System.out.println(num[5]);
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } catch (Exception e) {
            System.out.println("something went wrong");
        }
        System.out.println(j);
        System.out.println("bye");

    }
}

/*
 * Errors are exceptional conditions that are external to the application, and that the application usually cannot anticipate or recover from.
 *1.runtime errors: these are the errors that are detected while the program is running. These are also known as exceptions. These errors are caused by the environment in which the application is running. For example, if the application is trying to read a file that does not exist, then the application will throw a FileNotFoundException.
 * 2. compile-time errors: these are the errors that are detected by the compiler. These are also known as compile-time errors. These errors are caused by the syntax rules of the programming language.
 * 3. logical errors: these are the errors that are caused by the logic of the program. These errors are caused by the programmer's mistake. For example, if the programmer writes a program that is supposed to add two numbers, but instead subtracts them, then the program will produce incorrect results.
 *
 * Exception handling is a mechanism that allows the programmer to handle runtime errors gracefully. It allows the programmer to catch the exception and take appropriate action to recover from the error.
 * The try block is used to enclose the code that might throw an exception. The catch block is used to catch the exception and handle it. The final block is used to execute the code that should always be executed, regardless of whether an exception is thrown or not.
 * */