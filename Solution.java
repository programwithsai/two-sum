import java.util.*

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int neededValue = target - nums[i];
            
            if (map.containsKey(neededValue)) {
                return new int[] {map.get(neededValue), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution for the input!");
    }
}