import java.util.*;

class Solution {
    static boolean pathIsValid(int[][] matrix, int row, int col) {
        return row >= 0 && row < 4 && col >= 0 && col < 4 && matrix[row][col] == 1;
    }

    // first self attempt

    // static boolean findPath(int[][] matrix, int row, int col) {
    //     if (row == col && col == 3) {
    //         matrix[row][col] = 2;
    //         return true;
    //     }
    //
    //     if (pathIsValid(matrix, row + 1, col)) {
    //         matrix[row][col] = 2;
    //         System.out.println("1.1");
    //         print(matrix);
    //         if (findPath(matrix, row + 1, col)) return true;
    //         matrix[row][col] = 1;
    //     }
    //     System.out.println("1");
    //     print(matrix);
    //
    //     if (pathIsValid(matrix, row, col + 1)) {
    //         matrix[row][col] = 2;
    //         System.out.println("2.1");
    //         print(matrix);
    //         if (findPath(matrix, row, col + 1)) return true;
    //         matrix[row][col] = 1;
    //     }
    //
    //     System.out.println("2");
    //     print(matrix);
    //
    //     return false;
    // }

    static boolean findPath(int[][] matrix, int row, int col) {
        if (row == col && col == 3) {
            matrix[row][col] = 2;
            return true;
        }

        if (pathIsValid(matrix, row, col)) {
            matrix[row][col] = 2;
            print(matrix);
            if (findPath(matrix, row + 1, col)) return true;
            if (findPath(matrix, row, col + 1)) return true;
            matrix[row][col] = 1;
            return false;
        }
        return false;
    }

    static void print(int[][] matrix) {
        for (int[] arr: matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[][] rat = {
            {1, 0, 0, 0},
            {1, 1, 0, 0},
            {0, 1, 0, 0},
            {0, 1, 1, 1}
        };
        if (findPath(rat, 0, 0)) {
            System.out.println("Solution: ");
            print(rat);
        }
    }
}
