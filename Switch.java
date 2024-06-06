/**
 * switch
 */
public class Switch {

    public static void main(String[] args) {
        System.out.println("Switch cases");

        // based on the values it executes the code
        // it matches only once
        int n = 1;

        switch (n) {
            case 1:
                System.out.println("Monday");
                break; // important to break the switch
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Sundday");
                break;
        }

    }
}