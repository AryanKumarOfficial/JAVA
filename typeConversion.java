public class typeConversion {

    public static void main(String[] args) {
        int speed = 259;
        byte ping = (byte) speed; // Explicit type castingfrom int to byte

        float f = 10.5f;

        // int t = f; // Compile time error
        int t = (int) f; // Explicit type casting

        byte a = 10;
        byte b = 30;

        // type promotion in expression (a * b) is int so we need to type cast it to byte   
        int res = a * b;

        // System.out.println("Ping: " + ping);
        // System.out.println("Speed: " + speed);
        // System.out.println("Float: " + f);
        // System.out.println("Int: " + t);
        System.out.println("Result: " + res);
    }
}