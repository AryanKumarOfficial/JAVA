
//  every method will have its own stack in memory for varaibles
/*
 * while we create a object it is stored in the heap memory and the instance variable is stored in the heap
 * the address to the object will be stored in the variable for this example we have calc which stores the address of the object not the object itself
 */
package vars;

class Calculator {

    int x = 7; // instance variable

    public int add(int a, int b) {

        // a & b are local variable
        // System.out.println(x);
        return a + b;

    }
}

public class variables {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Calculator calc2 = new Calculator();
        calc.x = 10;
        // int r = calc.add(4, 5);
        // System.out.println(r);
        System.out.println(calc.x);
        System.out.println(calc2.x);
    }
}
