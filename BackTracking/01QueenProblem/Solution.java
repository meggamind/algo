import java.util.*;

class Solution {
    private static final int N = 4;

    static private boolean isSafe(int[][] matrix, int row, int col) {
        for (int i = 0; i < col; i++) {
            if (matrix[row][i] == 1) return false;
        }

        // upper diag
        for (int i = row, j = col; i>=0 && j>=0; i--, j--) {
            if (matrix[i][j] == 1) return false;
        }

        // lower diag
        for (int i = row, j = col; i<N && j>=0; i++, j--) {
            if (matrix[i][j] == 1) return false;
        }

        return true;
    }

    static private boolean findOneQueenSolution(int[][] queen, int col) {
        if (col >= N) return true;

        for (int i = 0; i < N; i++) {
            if (isSafe(queen, i, col)) {
                System.out.println("safe: " + i + ", " + col);
                queen[i][col] = 1;

                if (findOneQueenSolution(queen, col + 1)) return true;
                queen[i][col] = 0;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        // int[][] queen = new int[N][N];
        int[][] queen =
                {   {0, 0, 0, 0},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0}
                };

        if (findOneQueenSolution(queen, 0)) {
            System.out.println(queen);
        }
        for (int[] arr: queen) {
            System.out.println(Arrays.toString(arr));
        }

    }
}
