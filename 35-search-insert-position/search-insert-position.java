class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0,n=0;
        while(i<nums.length){
            if(nums[i]==target){
                return i;
            }
            else if(nums[i]>target){
                return i;
            }
            else if(i==nums.length-1){
                return i+1;
            }
            i++;
        }
        return 1;
    }
}