import java.util.*;


public class Solution {
	
	static Set<Character> res;

	static int getLcs(char[] charArr1, char[] charArr2, int n1, int n2) {
		if (n1 == 0 || n2 == 0) return 0;
		
		if (charArr1[n1 - 1] == charArr2[n2 - 1]) {
			res.add(charArr1[n1 - 1]);
			return 1 + getLcs(charArr1, charArr2, n1 - 1, n2 - 1);
		} else {	
			return Math.max(
				getLcs(charArr1, charArr2, n1 - 1, n2),
				getLcs(charArr1, charArr2, n1, n2 - 1)
				);
		}
		
	}


	public static void main(String[] args) {
		String str1 = "ABCDGH";
		String str2 = "AEDFHR";
		int n1 = str1.length();
		int n2 = str2.length();
		res = new HashSet();
		
		System.out.println(getLcs(str1.toCharArray(), str2.toCharArray(), n1, n2));
		System.out.println(Arrays.asList(res));

	}
}