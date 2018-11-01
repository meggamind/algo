import java.util.*;

public class Solution {
	
	static boolean checkSubsetForSum(int[] set, int i, int sumRemaining) {
		if (sumRemaining == 0) return true;
		if (i == 0 && sumRemaining != 0) return false;

		if (set[i - 1] > sumRemaining)
			return checkSubsetForSum(set, i - 1, sumRemaining);

		return checkSubsetForSum(set, i - 1, sumRemaining)
			|| checkSubsetForSum(set, i - 1, sumRemaining - set[i - 1]);

	}

	public static void main(String[] args) {
		int[] set = {3, 34, 4, 12, 5, 2};

		System.out.println("subset exists: " + checkSubsetForSum(set, set.length, 16));
	}
}
