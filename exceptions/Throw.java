package exceptions;

public class Throw {
    public static void main(String[] args) {
        int i = 15;
        int j = 0;

        try {
            j = 10 / i;
            if (j == 0) {
                throw new ArithmeticException("don't print zero");
            }
        } catch (ArithmeticException e) {
            j = 10 / 1;
            System.out.println("default output " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println(j);
    }
}

/*
 * throw keyword is used to throw an exception explicitly.
 * It is used to throw an exception from a method or any block of code.
 * The throw keyword is mainly used to throw custom exceptions.
 *
 * */