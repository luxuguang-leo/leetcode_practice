import java.util.List;

/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start
import java.util.Arrays;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backTracking(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }
    void backTracking(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int target, int start){
        if(target < 0){
            return;
        } else if(target == 0){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = start; i < candidates.length; i++){
                tempList.add(candidates[i]);
                backTracking(list, tempList, candidates, target-candidates[i], i);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
// @lc code=end

