import java.util.*;

public class Solution {
	
	static int getEditDistance(char[] arr1, char[] arr2, int n1, int n2) {
		int dp[][] = new int[n1 + 1][n2 + 1];
		
		for (int i = 0; i <= n1; i++) {
			for (int j = 0; j <= n2; j++) {
				if (i == 0) dp[i][j] = j;
				else if (j == 0) dp[i][j] = i; 
				else if (arr1[i - 1] == arr2[j - 1]) dp[i][j] =  dp[i - 1][j - 1];
				else {
					dp[i][j] = 1 + Math.min(dp[i - 1][j], 
							Math.min(
							dp[i][j - 1], 
							dp[i - 1][j - 1])
						);
				}
			}
		}
		return dp[n1][n2];
	}
	
	public static void main(String[] args) {
		String str1 = "geek";
		String str2 = "gesek";
		int n1 = str1.length();
		int n2 = str2.length();
		System.out.println(getEditDistance(str1.toCharArray(), str2.toCharArray(), n1, n2));

		str1 = "sunday";
		str2 = "saturday";
		n1 = str1.length();
		n2 = str2.length();
		System.out.println(getEditDistance(str1.toCharArray(), str2.toCharArray(), n1, n2));
	}
}