import java.util.*;
import javafx.util.Pair;

public class Solution {
	
	private static List<Pair<String, Integer>> mergeList(List<List<Pair<String, Integer>>> lists) {
		List<Pair<String, Integer>> res = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();	


		for (List<Pair<String, Integer>> list: lists) {
			for (Pair<String, Integer> pair: list) {
				String key = pair.getKey();
				if (map.contains(key)) {
					map.put(map.get(key) + (pair.getValue()));
				}
				res.add(pair);
			}
		}
		return res;
	}

	private static void printList(List<Pair<String, Integer>> list) {
		for (Pair<String, Integer> item: list) {
			System.out.print(item.getKey() + ":" + item.getValue() + ", ");
		}
	}
	
	public static void main(String[] args) {
		List<List<Pair<String, Integer>>> list = new ArrayList<>();
		List<Pair<String, Integer>> pairList1 = new ArrayList<>();
		List<Pair<String, Integer>> pairList2 = new ArrayList<>();
		List<Pair<String, Integer>> mergedList = new ArrayList<>();

		Pair<String, Integer> pair1 = new Pair<String, Integer>("StudentA", 45);
		Pair<String, Integer> pair2 = new Pair<String, Integer>("StudentB", 24);
		
		pairList1.add(pair1);
		pairList1.add(pair2);
ope
		Pair<String, Integer> pair3 = new Pair<String, Integer>("StudentC", 46);
		Pair<String, Integer> pair4 = new Pair<String, Integer>("StudentD", 74);
		Pair<String, Integer> pair5 = new Pair<String, Integer>("StudentA", 22);
		
		pairList2.add(pair3);
		pairList2.add(pair4);
		pairList2.add(pair5);

		list.add(pairList1);
		list.add(pairList2);
		
		mergedList = mergeList(list);
		printList(mergedList);
		
	}	
}