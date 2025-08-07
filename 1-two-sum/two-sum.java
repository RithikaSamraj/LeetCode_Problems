import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String args[]){
        Solution sc=new Solution();
        int nums[]={2,7,11,15};
        int target=9;
        int result[]=sc.twoSum(nums,target);
        System.out.print(Arrays.toString(result));
    }
}