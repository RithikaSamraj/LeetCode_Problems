class Solution {
    public int lengthOfLongestSubstring(String s) {
        char ch[]=s.toCharArray();
        Set<Character> set=new HashSet<Character>();
        int max=0;
        int j=0;
        for(int i=0;i<ch.length;i++){
            while(set.contains(ch[i])){
                set.remove(ch[j]);
                j++;
            }
            set.add(ch[i]);
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}