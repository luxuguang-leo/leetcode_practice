/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{left_bound(nums, target), right_bound(nums, target)};
    
    }

    public int left_bound(int[] nums, int target){
        int l = 0, r = nums.length-1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] < target) {
                l = m + 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else if (nums[m] == target) {
                r = m - 1;
            }
        }
        if (l >= nums.length || nums[l] != target)
            return -1;
        return l;

    }
    public int right_bound(int[] nums, int target){
        int l= 0, r = nums.length-1;
        while(l<=r){
            int m = l + (r-l)/2;
            if(nums[m] < target){
                l = m + 1;
            } else if(nums[m] > target){
                r = m -1;
            } else if(nums[m] == target)
            {
                l = m + 1;
            }
            
        }
        if(r < 0 || nums[r] != target)
            return -1;
        return r;

    }
}
// @lc code=end

