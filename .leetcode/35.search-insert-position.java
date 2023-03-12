/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while(l <= r){
            int m = l + (r-l)/2;
            if(nums[m] == target){
                return m;
            } else if(nums[m] > target){
                r = m -1;
            } else{
                l = m +1;
            }
        }
        return l;
    }
}
// @lc code=end

