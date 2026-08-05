class Solution {
    public int findPeakElement(int[] nums) {
        double max = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = (double)nums[i];
                index = i;
            }
        }
        return index;
    }
}