/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
import java.util.Arrays;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backTracking(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }
    void backTracking(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int target, int start){
        if(target < 0){
            return;
        } else if(target == 0){
            result.add(new ArrayList<>(tempList));
        } else{
            for(int i = start; i < candidates.length; i++){
                if( i > start && candidates[i] == candidates[i-1]){
                    continue;
                }
                tempList.add(candidates[i]);
                backTracking(result, tempList, candidates, target-candidates[i], i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }

}
// @lc code=end

