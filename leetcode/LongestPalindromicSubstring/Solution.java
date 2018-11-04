import java.util.*;


class Solution {
	int[][]dp;

	getLongesPalindrome(String s) {
		int n = s.length();

		for (int i = 0; i < n; i++) {
			dp[i][i] = 1;
		}
		
		for (int l = 2; i <= n; l++) {
			for (int start = 0; start <= n - l; i++) {
				end = start + l - 1;

				if (s.charAt(start) == s.charAt(end) && l == 2) 
					dp[i][end] = 2;
				else if (s.charAt(start) == s.charAt(end)) 
					dp[i][end] = dp[i + 1][end - 1] + 2;
				else
					dp[i][end] = max(dp[i][end - 1], dp[i + 1][end]);
			}
			
		}
		return dp[0][n - 1];
	}


	public static void main(String[] args) {
		String s = "geeksforgeeks";
		int n = s.length();
		dp = new int[n][n];
	
		System.out.println("s: " + getLongesPalindrome(s));	
	}
}


