import java.util.*;


public class Solution {

	static int getEditDistance(String str1, String str2) {
		List<Character> list1 = new LinkedList();
		List<Character> list2 = new LinkedList();

		for (int i = 0; i < str1.length(); i++) list1.add(str1.charAt(i));
		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			if (list1.contains(ch)) {
				list1.remove(new Character(ch));
			} else list2.add(ch);
		}

		return Math.max(list1.size(), list2.size());
	}

	public static void main(String[] args) {
		System.out.println(getEditDistance("geek", "gesek"));	
		System.out.println(getEditDistance("cat", "cut"));	
		System.out.println(getEditDistance("sunday", "saturday"));	
	}
}