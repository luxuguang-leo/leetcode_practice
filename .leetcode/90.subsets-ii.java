/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        dfs(result, new ArrayList<>(), nums, 0);
        return result;
        
    }
    void dfs(List<List<Integer>> res, List<Integer>tempList, int[] nums, int start){
        res.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            tempList.add(nums[i]);
            dfs(res, tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
// @lc code=end

