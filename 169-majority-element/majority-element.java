class Solution {
    public int majorityElement(int[] nums) {
        int c,max=0,v=0;
        for(int i=0;i<nums.length;i++){
            c=1;
           
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c>max){
                max=c;
                v=nums[i];
            }
        }
        return v;
    }
}