import java.util.*;

public class Solution {
	
	static int optimalStrategy(int[] arr, int start, int end) {
		if (start == end) return arr[start];
		if (start + 1 == end) return Math.max(arr[start], arr[end]);
		if (start - 2 <= 0) return arr[start - 2];
		if (end - 2 <= 0) return arr[end - 2]; 

		return Math.max( 
			arr[start] + Math.min(optimalStrategy(arr, start + 2, end), optimalStrategy(arr, start + 1, end - 1) ), 
			arr[end] + Math.min(optimalStrategy(arr, start, end - 2), optimalStrategy(arr, start + 1, end - 1))
		);
  	}

	public static void main(String[] args) {
		int[] arr = {};
		int n = arr.length;
		System.out.println("" + optimalStrategy(arr, 0, n - 1));
	}
}