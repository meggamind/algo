import java.util.*;


public class Solution {
	
	static int getMinRec(int[] arr, int n, int currSum, int totalSum) {
		if (n == 0) return Math.abs((totalSum - currSum) - currSum);
		
		return Math.min(
			getMinRec(arr, n - 1, currSum + arr[n - 1], totalSum),
			getMinRec(arr, n - 1, currSum, totalSum)
			);
	}
	
	static int getMinPartition(int[] arr, int n) {
		int totalSum = 0;
		for (int i = 0; i < n; i++) totalSum += arr[i];
		
		return getMinRec(arr, n, 0, totalSum);
	}	

	public static void main(String[] args) {
		int[] arr = {1, 6, 11, 5};
		System.out.println(getMinPartition(arr, arr.length));
	}
}