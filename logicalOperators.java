/**
 * logicalOperators
 */
class logicalOperators {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Logical Operators");

        // used to combine expressions

        // AND - both true results true , false if any is false
        // OR - any one is true gets true
        // NOT - reverse the output, from false to true or true to false

        int a = 5;
        int b = 6;
        int x = 10;
        int y = 9;

        boolean result;
        result = a < b && x < y;
        System.out.println(result);
        result = a < b || x > y;
        System.err.println(result);
        result = !result;
        System.err.println(result);
    }
}