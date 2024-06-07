// print  days with  time
public class loops_1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { // sunday and saturday off

            // printing days

            System.out.println("DAY " + i);
            System.out.println("\n");
            
            for (int j = 1; j <= 9; j++) { // working hours
                System.out.println("  " + (j + 8) + " - " + (j + 9));
            }
            System.out.println("\n");

        }
    }
}
