import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();

        for (int i=0; i<s.length(); i++){
           Character ch = s.charAt(i);
            if( ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else if( ch==')'){
                if( !st.isEmpty() && st.peek()=='('){
                    st.pop();
                }else{
                    return false;
                }
            }
            else if( ch=='}'){
                if( !st.isEmpty() && st.peek()=='{'){
                    st.pop();
                }else{
                    return false;
                }
            }
            else if( ch==']'){
                if( !st.isEmpty() && st.peek()=='['){
                    st.pop();
                }else{
                    return false;
                }
            }

        }
        if (st.size()>0) return false;
        return true;
    }
}