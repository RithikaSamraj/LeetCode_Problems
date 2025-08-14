class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[]=s.split(" ");
        char[] ch=pattern.toCharArray();
        int n=ch.length;
        if(str.length!=ch.length) return false;
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for(int i = 0; i < n; i++ ) {
            String word = str[i];
            char cur = pattern.charAt(i);
            if(map1.containsKey(cur) && !map1.get(cur).equals(word)) return false;
            if(map2.containsKey(word) && !map2.get(word).equals(cur)) return false;
            map1.put(cur, word);
            map2.put(word, cur);
        }
        return true;
    }
}