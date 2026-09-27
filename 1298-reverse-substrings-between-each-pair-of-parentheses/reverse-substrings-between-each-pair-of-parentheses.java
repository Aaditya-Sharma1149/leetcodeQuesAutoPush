class Solution {
    public String reverseParentheses(String s) {
        Stack <StringBuilder> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<s.length(); i++){

            if(s.charAt(i)=='('){
                st.push(new StringBuilder(sb));
                sb.setLength(0);
                st.push(new StringBuilder("("));
                continue;
            }
            if(s.charAt(i)==')'){
                st.push(new StringBuilder(sb));
                sb.setLength(0);
                StringBuilder pop = st.pop();
                StringBuilder str = new StringBuilder();
                while(!pop.toString().equals("(")){
                    str.insert(0,pop);
                    pop = st.pop();
                }
                st.push(new StringBuilder(str.reverse()));
                continue;
            }
            sb.append(s.charAt(i));
        }
        while(!st.isEmpty()) sb.insert(0,st.pop());
        return sb.toString();
    }
}