class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int f = 0;  
        int start = 0; 
        for (int i = 0; i < s1.length; i++) {
            boolean found = false;
            for (int j = start; j < t1.length; j++) {
                if (s1[i] == t1[j]) {
                    f++;
                    start = j + 1; 
                    found = true;
                    break;
                }
            }
            if (!found) return false; 
        }

        return f == s1.length;
    }
}
