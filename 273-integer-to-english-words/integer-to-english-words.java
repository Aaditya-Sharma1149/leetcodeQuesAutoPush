class Solution {
    public String numberToWords(int num) {
        if( num==0){
            return "Zero";
        }
        int rem1 = num%1000;
        num = num/1000;
        int rem2 = num%1000;
        num = num/1000;
        int rem3 = num%1000;
        num = num/1000;
        int rem4 = num%1000;


        StringBuilder result = new StringBuilder();
            if(rem4 > 0){
                result.append(word(rem4)).append(" Billion ");
            }
            if(rem3> 0) {
                result.append(word(rem3)).append(" Million ");
            }
            if(rem2>0) {
                result.append(word(rem2)).append(" Thousand ");
            }
            if(rem1>0) {
                result.append(word(rem1));
            }
            return result.toString().trim();
    }
    public String word(int n){
        String st;
        int rem1 = n%10; 
        n = n/10;
        int rem2 = n%10;
        n=n/10;
        int rem3=n%10;

        String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                    "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        StringBuilder result = new StringBuilder();

        if(rem3>0){
            result.append(ones[rem3]).append(" Hundred ");
        }
        if(rem2==1){
            result.append(ones[10+rem1]);
            return result.toString();
        }
        if(rem2>1){
            result.append(tens[rem2]+" ");
        }
        if(rem1>0){
            result.append(ones[rem1]);
        }
        return result.toString().trim();
    }
    
}