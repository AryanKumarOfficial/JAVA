package tryfinally;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
//        int i = 0, j = 0;
        int num;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) { // try with resources
//            j = 18 / i;
            num = Integer.parseInt(reader.readLine());
            System.out.println(num);
        }
        /*
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            reader.close();
            System.out.println("Bye");

        }
        */

    }
}


/*
 * In try catch block try is used to perform some critical task
 * and the catch block is executed when try block has any runtime error
 * finally block is executed irrespective of try and catch block
 * we can use only finally with try block.
 * In try with resources we don't even have to mention finally block
 * it automatically closes the resources once try block execution completed.
 * */