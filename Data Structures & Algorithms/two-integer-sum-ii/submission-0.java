class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {

            int sum = numbers[start] + numbers[end];

            // If sum is greater than target,
            // move the right pointer left to reduce the sum
            if (sum > target) {
                end--;
            }

            // If sum is smaller than target,
            // move the left pointer right to increase the sum
            else if (sum < target) {
                start++;
            }

            // If sum equals target,
            // return 1-based indices
            else {
                return new int[] { start + 1, end + 1 };
            }
        }

        // No valid pair found
        return new int[0];
    }
}