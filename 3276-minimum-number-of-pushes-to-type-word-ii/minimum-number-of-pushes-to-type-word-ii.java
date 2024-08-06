import java.util.HashMap;

class Solution {
    public int minimumPushes(String word) {
        int [] freq = new int[26];
        char ch;
        int cost=0;
        int count = 1;
        int index =-1;
        int max = -1;
        for (int i=0; i < word.length(); i++){
            ch = word.charAt(i);
            freq[ch-'a']++;
        }
        while ( count <=26 ){
            max = freq[maxIndex(freq)];
            index = maxIndex(freq) ;
            if(max==0) break;
            if(count <=8 ){
                cost += max;
            }
            else if(count > 8 && count <=16){
                cost = cost + 2*max;
            }
            else if(count > 16 && count <=24){
                cost = cost + 3*max;
            }
            else{
                cost = cost + 4*max;
            }
            freq[index]=0;
            count++;
        }
        return cost;
        
    }public int maxIndex(int [] freq){
        
        int index = 0;
        int max = 0;
        for (int i=0; i < freq.length; i++){
            if ( freq[i] > max){ 
                max = freq[i];
                index = i;
                }
        }
        return index;
    }
}