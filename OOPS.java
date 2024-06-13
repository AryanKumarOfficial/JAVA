/**
 * OOPS
 */

// creating class

class Claculator {

    // attributes

    int a;

    // methods

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class OOPS {

    public static void main(String[] args) {
        int x = 4;
        int y = 6;

        // creating object

        Claculator calc = new Claculator();
        calc.a = 1211821058;
        int result = calc.add(x, y);
        System.out.println(result);
        System.out.println(calc.a);
    }
}