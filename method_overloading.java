/**
 * methods_2
 * more on methods
 */

class Calculator {

    // method overloading

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double  add(double a, int b) {
        return a + b;
    }
}

public class method_overloading {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        System.out.println(result);
    }
}