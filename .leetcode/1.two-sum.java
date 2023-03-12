import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (tracker.containsKey(target - nums[i])) {
                return new int[] {tracker.get(target - nums[i]), i };
            }
            tracker.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
// @lc code=end

