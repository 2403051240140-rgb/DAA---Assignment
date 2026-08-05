class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        for(int i=0; i<nums.length; i++){
            int m = (right + left) / 2; 
            if(nums[m] == target){
                return m;
            }else if(nums[m] < target){
                left = m + 1;
            }else{
                right = m - 1;
            }
        }
        return -1;
    }
}