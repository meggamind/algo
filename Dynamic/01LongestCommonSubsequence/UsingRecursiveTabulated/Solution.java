import java.util.*;


public class Solution {
	static int[][] L;
	static Set<Character> charSet;	


	static int getLcs(char[] charArr1, char[] charArr2, int n1, int n2) {
		L = new int[n1 + 1][n2 + 1];
		charSet = new HashSet<>();

		for (int i = 0; i <= n1; i++) {
			for (int j = 0; j <= n2; j++) {
				if (i == 0 || j == 0) 
					L[i][j] = 0;
				else if (charArr1[i - 1] == charArr2[j - 1]) {
					charSet.add(charArr1[i - 1]);
					L[i][j] = L[i - 1][j - 1] + 1;
				}
				else {
					L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
				}
			}
		}
		return L[n1][n2];
	}

	public static void main(String[] args) {
		String str1 = "AGGTAB";
		String str2 = "GXTXAYB";
		int n1 = str1.length();
		int n2 = str2.length();

		System.out.println(getLcs(str1.toCharArray(), str2.toCharArray(), n1, n2));
		System.out.println(charSet.toString());
	}

}