class Solution {
    public char findTheDifference(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();  
        int sum1=0;
        int sum2=0;      
        for(int i=0;i<s1.length;i++){
            sum1+=(int)(s1[i]);
        }
        for(int i=0;i<t1.length;i++){
            sum2+=(int)(t1[i]);
        }
        int res=sum1-sum2;
        if(res<0){
            res=res*(-1);
        }
        return (char)res;
        
    }
}