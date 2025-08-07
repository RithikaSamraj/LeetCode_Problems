class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int k=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];  
                k++;  
            }
        }
        return k;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int p:nums){
            System.out.print(p+" ");
        }
    }
}