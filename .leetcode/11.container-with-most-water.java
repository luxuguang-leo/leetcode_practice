/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxArea = 0;
        while (l < r) {
            maxArea = Math.max(maxArea, (r - l) * Math.min(height[r], height[l]));
            if (height[l] < height[r]) {
                l += 1;
            } else {
                r -= 1;
            }
        }
        return maxArea;

    }
}
// @lc code=end

