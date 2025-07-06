class Solution {
    // public String removeKdigits(String nums, int k) {
    //     if(k==0) return nums;
    //     if(k==nums.length()){
    //         return new String("0");
    //     }

    //     StringBuilder num = new StringBuilder(nums);

    //     while(k!=0){
    //         boolean flag = false;
    //         for(int i=0; i<num.length()-1; i++){
    //             if(num.charAt(i)>num.charAt(i+1)){
    //                 num.deleteCharAt(i);
    //                 flag = true;
    //                 break;
    //             }
    //         }
    //         if(flag==false && num.length()>0) num.deleteCharAt(num.length()-1);
            
    //         if(num.length()>0 && num.charAt(0)=='0'){
    //             while(num.length()>0 && num.charAt(0)=='0') num.deleteCharAt(0);
    //             if(num.length()==0) return new String("0");
    //         }
    //         k--;
    //     }
    //     if(num.length() == 0) return "0";
    //     return num.toString();
    // }
    public String removeKdigits(String nums, int k) {
        if(k==0) return nums;
        if(k==nums.length() || nums.length()==0){
            return new String("0");
        }

        int temp = k;
        Stack <Character> st = new Stack<>();
        StringBuilder str = new StringBuilder(); 

        st.push(nums.charAt(0));
        for(int i=1; i<nums.length(); i++){
            if(k==0){
                st.push(nums.charAt(i));
                continue;
            }
            if(st.peek()>nums.charAt(i)){
                while(!st.isEmpty() && st.peek()>nums.charAt(i) && k>0){
                    st.pop();
                    k--;
                }
                st.push(nums.charAt(i));
                continue;
            }
            st.push(nums.charAt(i));
        }

        while(!st.isEmpty()){
            str.append(st.pop());
        }
        str.reverse();

        if(k!=0){
            while(str.length()>0 && k>0){
                str.deleteCharAt(str.length()-1);
                k--;
            }
        }
        while(str.length()>0 && str.charAt(0)=='0') str.deleteCharAt(0);
        if(str.length()==0) return "0";
        return str.toString();
    }
}