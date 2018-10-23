import java.util.*;


public class Solution {

	static int getNumberOfWays(int n) {
		int[] steps = new int[n + 2];
		steps[0] = 1;
		steps[1] = 1;
		steps[2] = 2;
		for (int i = 3; i <= n; i++) {
			steps[i] = steps[i - 1] + steps[i - 2];
		}
		return steps[n];
	}
	

	public static void main(String[] args) {
		System.out.println(getNumberOfWays(4));
	}
}