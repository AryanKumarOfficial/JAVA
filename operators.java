class operators {

    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int substraction(int x, int y) {
        int diff = x - y;
        return diff;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static void main(String arg[]) {
        int a = 10;
        int b = 12;
        // arithmetic operations
        // additon

        int sum = sum(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        // substraction

        int diff = substraction(a, b);
        System.out.println("The difference of " + a + " and " + b + " is: " + diff);

        // multiplication

        int product = multiplication(a, b);
        System.out.println("The product of " + a + " and " + b + " is: " + product);

        // divion

        int quotient = division(a, b);
        System.out.println("The quotient of " + a + " and " + b + " is: " + quotient);

        // incremting with two

        // a = a + 2;

        // assignment operators

        // a += 2;
        // a -= 2;
        // a *= 2;
        // a /= 2;

        // increment % decrement operators

        // post incremntation and decremetation

        // first fetch the value then increment
        // first fetch the value then increment

        a++;
        a--;

        // pre incremntation and decremetation
        // first increment then value then fetch the value

        --a;
        ++a;

        System.out.println(a);
    }
}