class Solution {
    public String decodeString(String s) {
        String str = new String();
        Stack <Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);
            if(ch==']'){

                String ans = new String();

                while(st.peek()!='[')   ans =  st.pop() + ans ;

                st.pop();
                int num=0;
                int multiplier = 1;
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    int digit = st.pop() - '0';
                    digit = digit * multiplier;
                    num = digit + num;
                    multiplier = multiplier*10;
                }
                ans = ans.repeat(num);

                for(int j=0; j<ans.length(); j++){
                    st.push(ans.charAt(j));
                }
                continue;
            }
            st.push(ch);
        }
        while(!st.isEmpty()){
            str=  st.pop() + str;
        }
        return str;
    }
}
