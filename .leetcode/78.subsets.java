import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new ArrayList<>(), nums, 0);
        return result;
        
    }
    void dfs(List<List<Integer>> result , List<Integer> tempList, int[] nums,int start){
        result.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            dfs(result, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }

    }
}
// @lc code=end

