import java.util.*;

public class Solution {
	static int[] arr;
	static int max = 1;
	
	static int getLIS(int[] arr, int n1) {
		int[] lis = new int[n1];
		lis[0] = 1;
		
		for (int i = 1; i < n1; i++) {
			lis[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr [i] > arr[j] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
					max = Math.max(lis[i], max);
				}
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
		int n1 = arr.length;
		
		System.out.println(getLIS(arr, n1));
	}
}