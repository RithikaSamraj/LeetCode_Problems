class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int max=0;
        int smax=0;
        while(s.length>max && smax<g.length){
            if(s[max]>=g[smax]){
                smax++;
            }
            max++;
        }
        return smax;
    }
}