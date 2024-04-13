public class typeConversion {

    public static void main(String[] args) {
        int speed = 25;
        byte ping = (byte) speed; // Explicit type casting
        System.out.println("Ping: " + ping);
        System.out.println("Speed: " + speed);
    }
}