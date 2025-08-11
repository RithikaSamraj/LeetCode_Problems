class Solution {
    public int reverse(int x) {
        int s=0;
        while(x!=0){
            int n=x%10;
            x=x/10;
            if (s > Integer.MAX_VALUE / 10 || (s == Integer.MAX_VALUE / 10 && x > 7)) {
                return 0;
            }
            if (s < Integer.MIN_VALUE / 10 || (s == Integer.MIN_VALUE / 10 && x < -8)) {
                return 0;
            }
            s=s*10+n;
        }
        
        return s;
    }
}