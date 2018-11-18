import java.util.*;

class Solution {

    static void findAllNonRepeatingSubsets( int[] nums,
                                            List<List<Integer>> res,
                                            List<Integer> tempList,
                                            int start) {
        res.add(new ArrayList<>(tempList));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            tempList.add(nums[i]);
            findAllNonRepeatingSubsets(nums, res, tempList, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        findAllNonRepeatingSubsets(nums, res, tempList, 0);

        for (List<Integer> list: res) {
            System.out.println(list);
        }
    }
}
