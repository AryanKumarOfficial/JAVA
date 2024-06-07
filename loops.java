/**
 * loops
 */
public class loops {

    public static void main(String[] args) {
        // repeat this line 4 times
        // loops - while, do while ,for

        int i = 1;
        while (i <= 10) {
            System.out.println("Hi");
            int j = 1;
            while (j <= 3) {
                System.out.println("Hello");
                j++;
            }
            i++;
        }
    }
}