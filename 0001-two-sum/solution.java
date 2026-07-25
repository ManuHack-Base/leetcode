}
        // In case there is no solution, return an empty array
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        for (int i = 0; i < nums.length; i++) {
        }
            map.put(nums[i], i);
        for (int i = 0; i < nums.length; i++) {
        Map<Integer, Integer> map = new HashMap<>();
class Solution {
    public int[] twoSum(int[] nums, int target) {