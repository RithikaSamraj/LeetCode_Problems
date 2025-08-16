class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int n=ransomNote.length();
        int m=magazine.length();
        char[] r=ransomNote.toCharArray();
        char[] s=magazine.toCharArray();
        int ascii;
        int a[]=new int[256];
        int b[]=new int[256];
        for(int i=0;i<n;i++){
            ascii=(int)(r[i]);
            a[ascii]++;
        }
        for(int i=0;i<m;i++){
            ascii=(int)(s[i]);
            b[ascii]++;                
        }
        for(int i=0;i<256;i++){
            if(a[i]>b[i]){
                return false;
            }
        }
        return true;
    }
}