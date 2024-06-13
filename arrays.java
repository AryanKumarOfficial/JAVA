public class arrays {
    public static void main(String[] args) {
        int nums[] = { 5, 6, 7, 8 };
        nums[0] = 10;
        // nums[4] = 11; // can't do this
        System.out.println(nums[3]);

        int num2[] = new int[5]; // all the elements are 0 by default
        num2[0] = 7;
        num2[1] = 4;
        num2[2] = 1;
        num2[3] = 8;
        num2[4] = 12;
        // System.out.println(num2[0]);

        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
    }
}
