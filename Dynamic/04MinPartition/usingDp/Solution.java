import java.util.*;


public class Solution {
	static int[][] dp;
	
	static int getMinRec(int[] arr, int n, int currSum, int totalSum) {
		for (int i = 0; i < n; i++) {
			if (i == 0) sum[i][currSum] = Math.abs( (totalSum - currSum) - currSum);
			else {
				dp[i][currSum] = Math.min(
					dp(i + 1, currSum + arr[i + 1]),
					dp(i + 1, currSum)
				);
			}
		}
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < sum.length; i++) {
			min = Math.min(min, sum[i]);
		}
		return min;
	}

	static int getMinDiff(int[] arr, int n) {
		int totalSum = 0;
		
		for (int i = 0; i < n; i++) totalSum += arr[i];

		return getMinRec(arr, n, 0, totalSum);
	}
		

	public static void main(String[] args) {
		int[] arr = {3, 1, 4, 2, 2, 1};
		int n = arr.length;
		sum = new int[n];
		System.out.println(getMinDiff(arr, n));		
	}
}