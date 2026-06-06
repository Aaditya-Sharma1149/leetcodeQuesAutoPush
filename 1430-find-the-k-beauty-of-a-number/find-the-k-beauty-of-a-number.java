class Solution {
    public int divisorSubstrings(int num, int k) {
      String s = String.valueOf(num);
      String str = "";
      int r = 0;
      int div = 0;
      int count = 0;
      while(r<k){
        str = str + s.charAt(r);
        r++;
      }
      while(r<s.length()){
        div = Integer.parseInt(str);
        System.out.println(div);
        if(div==0){

        }else if( num%div==0 ) count++;
        str = str + s.charAt(r);
        str = str.substring(1);
        r++;
      }
      div = Integer.parseInt(str);
      if(div==0){
        
      }else if( num%div==0 ) count++;
      return count;
    }
}