import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        if(s.length()==1){
            return s;
        }
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        int j = str.length()-1;
        
        while(i<j){
            char z = str.charAt(i);
            if (z=='a' || z=='e' || z=='i' || z=='o' || z=='u' || z=='A' || z=='E' || z=='I' || z=='O' || z=='U'){ 

               while( i<j ){
                    char y = str.charAt(j);

                    if (y=='a' || y=='e' || y=='i' || y=='o' || y=='u' || y=='A' || y=='E' || y=='I' || y=='O' || y=='U'){
                    char charAtI = str.charAt(i);
                    char charAtJ = str.charAt(j);
                    str.setCharAt(i, charAtJ); 
                    str.setCharAt(j, charAtI); 
                    j--;
                    break;
                    }

                    j--;
                }

            }
            i++;

            
        }
        return str.toString();
    }
}