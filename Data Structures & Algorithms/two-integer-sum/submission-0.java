class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> Map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (Map.containsKey(diff)) {
                return new int[] { Map.get(diff), i };
            }

            Map.put(num, i);
        }

        return new int[] {};
    }
}
