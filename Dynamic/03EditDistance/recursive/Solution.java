import java.util.*;

public class Solution {
	
	static int getEditDistance(char[] arr1, char[] arr2, int n1, int n2) {
		if (n1 == 0) return n2;
		if (n2 == 0) return n1;
		
		if (arr1[n1 - 1] == arr2[n2 - 1]) {
			return getEditDistance(arr1, arr2, n1 - 1, n2 - 1);
		} else {
			return 1 + Math.min(
				getEditDistance(arr1, arr2, n1, n2 - 1),
				Math.min(
					getEditDistance(arr1, arr2, n1 - 1, n2),
					getEditDistance(arr1, arr2, n1 - 1, n2 - 1)
				)
			);
		}
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