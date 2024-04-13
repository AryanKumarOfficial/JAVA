public class literals {

    public static void main(String[] args) {
        int num1 = 0b101; // Binary literal
        int num2 = 0x7E; // Hexadecimal literal

        int num3 = 1_00_00_00_000; // Underscore in literals

        double num4 = 56; // Implicit casting from int to double
        double num5 = 12e10; // Scientific notation

        char letter = 'a'; // Character literal
        letter++; // Incrementing character

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(letter);
    }
}