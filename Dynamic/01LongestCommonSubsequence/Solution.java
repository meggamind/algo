import java.util.*;

public class Solution {
	
	static String getLongestSubSequence(String str1, String str2) {
		List<Character> list = new LinkedList();

		for (int i = 0; i < str1.length(); i++) {
			list.add(str1.charAt(i));	
		}
		
		String res = "";
		
		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			
			if (list.contains(ch)) {
				res += ch;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(getLongestSubSequence("ABCDGH", "AEDFHR"));
	}
}