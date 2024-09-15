package Practice;
public class p3 {
    public static void main(String[] args) {
        // Creating two matrices
        int[][] a = { {1, 3}, {2, 4} };
        int[][] b = { {1, 3}, {2, 4} };

        // Creating another matrix to store the sum of two matrices
        int[][] c = new int[2][2];

        // Adding matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Printing the addition result
        System.out.println("Sum of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}