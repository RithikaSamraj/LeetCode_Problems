class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        if(s.charAt(0) == ')' ||s.charAt(0) == '}'||s.charAt(0) == ']') return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' ||s.charAt(i) == '{'||s.charAt(i) == '[') st.push(s.charAt(i));
            else if (!st.isEmpty() && 
                ((st.peek() == '(' && s.charAt(i) == ')') ||
                (st.peek() == '{' && s.charAt(i) == '}') ||
                (st.peek() == '[' && s.charAt(i) == ']'))) {
                st.pop();
            }
            else
            {
                return false;
            }
                 
        }
        if(st.isEmpty()) return true;
        else return false;
    }
}