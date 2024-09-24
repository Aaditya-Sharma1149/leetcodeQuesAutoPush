import java.util.*;
class Solution {
    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder(s);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='A' && s.charAt(i) <= 'Z' ){//out of range causes error (without &&) leaves blank
                char lc = (char) ('a' + s.charAt(i) - 'A');
                str.setCharAt(i,lc);
            }
        }
        return str.toString();
    }
}