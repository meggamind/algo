import java.util.*;

public class Solution {
	
	static int dp[][];
	static int n1;
	static int n2;
	static int max = 0;

	static int getLongestPathFor(int i, int j, int[][] matrix) {
		if (i < 0 || j < 0 || i >= n1 || j >= n2) return 0;
		
		if (dp[i][j] != 0) return dp[i][j];
		
		if (i + 1 < n1 && (matrix[i][j] + 1 == matrix[i + 1][j]))
			return dp[i][j] = 1 + getLongestPathFor(i + 1, j, matrix);
		
		if (j + 1 < n2 && (matrix[i][j] + 1 == matrix[i][j + 1]))
			return dp[i][j] = 1 + getLongestPathFor(i, j + 1, matrix);

		if (i > 0 && (matrix[i][j] + 1 == matrix[i - 1][j]))
			return dp[i][j] = 1 + getLongestPathFor(i - 1, j, matrix);
		
		if (j > 0 && (matrix[i][j] + 1 == matrix[i][j - 1]))
			return dp[i][j] = 1 + getLongestPathFor(i, j - 1, matrix);

		return dp[i][j] = 1;
	}

	static int maxPath() {
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				max = Math.max(dp[i][j], max);
			}
		}
		return max;
	}


	public static void main(String[] args) {
		int[][] matrix = {	{1, 2, 9},
				{5, 3, 8},
				{4, 6, 7}
				};
		n1 = matrix.length;
		n2 = matrix[0].length;
		
		dp = new int[n1][n2];
		
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				dp[i][j] = getLongestPathFor(i, j, matrix);
			}
		}
		
		System.out.println("maxPath: " + maxPath());
	}
}