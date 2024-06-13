public class arrays_3D {
    public static void main(String[] args) {
        int num[][][] = new int[3][][];

        for (int i = 0; i < num.length; i++) {
            // defining the length of 2nd layer of the 3d array
            num[i] = new int[(int) (Math.random() * 10)][];
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = new int[(int) (Math.random() * 10)];
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                for (int k = 0; k < num[i][j].length; k++) {
                    num[i][j][k] = (int) (Math.random() * 100);
                }
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                for (int k = 0; k < num[i][j].length; k++) {
                    System.out.print(num[i][j][k] + " ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
