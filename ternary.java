/**
 * ternary
 */
public class ternary {

    public static void main(String[] args) {
        System.out.println("Ternary operator");
        int n = 4;
        int result = 0;
        // short hand for if else in single line

        // if (n % 2 == 0)
        // result = 10;
        // else
        // result = 20;

        // (condition)?True:false -----syntax

        result = n % 2 == 0 ? 10 : 20;
        System.out.println(result);
    }
}