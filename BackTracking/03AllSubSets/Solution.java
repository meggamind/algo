import java.util.*;

// https://leetcode.com/problems/permutations/discuss/18239/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partioning)
public class Solution {

    static void findAllSubsets(int[] arr, List<List<Integer>> res, List<Integer> tempList, int start) {
        res.add(new ArrayList<>(tempList));

        for (int i = start; i < arr.length; i++) {
            tempList.add(arr[i]);
            findAllSubsets(arr, res, tempList, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1};

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        findAllSubsets(arr, res, tempList, 0);

        for(List<Integer> list: res) {
            System.out.println(list);
        }
    }
}
