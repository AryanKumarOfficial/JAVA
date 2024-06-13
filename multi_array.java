/*
 * array of arrays - mulit dimensional array
 */

public class multi_array {
    public static void main(String[] args) {

        int nums[][] = new int[3][4]; // 3 internal arrays with 4 elements each

        // storing values

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);

            }
        }

        // printing values
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // advance loop
        System.out.println();

        for (int n[] : nums) {
            for (int x : n) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
