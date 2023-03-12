/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start

import java.util.Arrays;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            int l = i + 1;
            int r = nums.length-1;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            while(l < r){
                int val = nums[i] + nums[l] + nums[r];
                if(val == 0){
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l< r && nums[l] == nums[l+1]) l++;
                    while(l < r && nums[r] == nums[r-1]) r--;
                    l++;
                    r--;
                } else if(val < 0){
                    l++;
                } else{
                    r--;
                }
            }
        }
        return result;
    }

        
}
// @lc code=end

