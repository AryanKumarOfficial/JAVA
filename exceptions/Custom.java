package exceptions;

class MyException extends Exception {
    public MyException(String s) {
        super(s);

    }
}

public class Custom {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 12 / i;
            if (j == 0) {
                throw new MyException("This is not possible");
            }
        } catch (MyException e) {
            j = 1;
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(j);
    }
}

/*
 * custom exception is created by extending the Exception class
 * and then using the throw keyword to throw the exception
 * and then catch the exception using the catch block
 *   - the catch block should be in the order of the exception
 *    from the most specific to the most general
 * */