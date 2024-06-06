/**
 * compare3
 */
public class compare3 {

    public static void main(String[] args) {
        int x = 100;
        int y = 150;
        int z = 200;

        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > z) { // no need to compare between x and y because it is done in previous block
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}