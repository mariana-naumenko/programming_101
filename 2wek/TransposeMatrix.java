
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int rows = A.length;
        int cols = A[0].length;
        int[][] T = new int[cols][rows];

        // Transpose logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0;  j < cols;  j++) {
            T[j][i] = A[i][j];

            }}
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }

    }
