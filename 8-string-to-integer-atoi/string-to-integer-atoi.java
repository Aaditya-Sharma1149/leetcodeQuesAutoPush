class Solution {
    public int myAtoi(String s) {

        int i=0;
        boolean neg = false;
        int num=0;

        while(i<s.length() && s.charAt(i) == ' ' ){
            i++;
        }

        if( (i<s.length()) && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)== '-' ){
                neg = true;
            }
            i++;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            if( num >= Integer.MAX_VALUE/10){

                if(num == Integer.MAX_VALUE/10 && s.charAt(i)-'0'<=7 && i==s.length()-1){
                    num = num*10 + (s.charAt(i)-'0');

                    if(neg) return num*-1;
                    return num;
                }
                if(neg){
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
            num = num*10 + (s.charAt(i)-'0'); 
            i++;
        }

        if(neg){
            return -1*num;
        }

        return num;

    }
}