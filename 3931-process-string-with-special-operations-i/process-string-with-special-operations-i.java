class Solution {
    public String processStr(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                str.append(ch);
                continue;
            }
            if(ch == '*'){
                if( str.length()==0) continue;
                str.deleteCharAt(str.length()-1);
                continue;
            }
            if(ch == '#'){
                str.append(str.toString());
                continue;
            }
            if(ch == '%'){
                str.reverse();
            }
            
        }
        return str.toString();
    }
}