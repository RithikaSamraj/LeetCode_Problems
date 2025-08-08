class Solution {
    public int romanToInt(String s) {
        int a=0,num=0,n=s.length();
        for(int i=n-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I':
                num = 1; break;
                case 'V': 
                num = 5; break;
                case 'X':
                num = 10; break;
                case 'L':
                num = 50; break;
                case 'C':
                num = 100; break;
                case 'D':
                num = 500; break;
                case 'M':
                num = 1000; break;
            }
            if(4*num<a){
                a-=num;
            }
            else{
                a+=num;
            }
        }
            return a;
        
    }
}