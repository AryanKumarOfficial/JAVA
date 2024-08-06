package input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
//        int num = System.in.read();
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader reader = new BufferedReader(in);
//        int num = Integer.parseInt(reader.readLine());
//        System.out.println(num);
//        reader.close();

        Scanner scanner;
        scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);


        /*
         * println() is a method of printStream class
         * System.in.read() gives an integer format of aASCII value as 65 for A.
         * It also read one character at a time.
         * We can use BufferReader to get absolute integer value, but it takes an object of InputStreamReader which itself takes the System.in object as its input
         * We need to close the reader as it takes resource, and it needs to be closed.
         *
         * Alternatively we can use Scanner class to take the input from the user and it takes input as System.in at creation of its class.
         * */
    }
}
