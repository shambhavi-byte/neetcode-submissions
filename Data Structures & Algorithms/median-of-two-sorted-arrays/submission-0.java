class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];

        // Copy nums1
        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }

        // Copy nums2
        for (int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i];
        }

        // Sort
        Arrays.sort(merged);

        int n = merged.length;

        // Odd
        if (n % 2 == 1) {
            return merged[n / 2];
        }

        // Even
        return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
    }
}