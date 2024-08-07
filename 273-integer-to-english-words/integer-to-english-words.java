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

        StringBuilder result = new StringBuilder();

        if(rem3>0){
            result.append(ones(rem3)).append(" Hundred ");
        }
        if(rem2==1){
            result.append(eleven(rem1));
            return result.toString();
        }
        if(rem2>1){
            result.append(tens(rem2)+" ");
        }
        if(rem1>0){
            result.append(ones(rem1));
        }
        return result.toString().trim();
    }

    public String ones(int rem){
        if( rem == 1){
            return "One";
        }
        if( rem == 2){
            return "Two";
        }
        if( rem == 3){
            return "Three";
        }
        if( rem == 4){
            return "Four";
        }
        if( rem == 5){
            return "Five";
        }
        if( rem == 6){
            return "Six";
        }
        if( rem == 7){
            return "Seven";
        }
        if( rem == 8){
            return "Eight";
        }
        if( rem == 9){
            return "Nine";
        }
        return "here2";
    }
    public String tens(int rem){
        if( rem==2){
            return "Twenty";
        }
        if( rem==3){
            return "Thirty";
        }
        if( rem==4){
            return "Forty";
        }
        if( rem==5){
            return "Fifty";
        }
        if( rem==6){
            return "Sixty";
        }
        if( rem==7){
            return "Seventy";
        }
        if( rem==8){
            return "Eighty";
        }
        if( rem==9){
            return "Ninety";
        }
        return "here";
    }
    public String eleven(int rem){
        if(rem==0){
            return "Ten";
        }
        if( rem == 1){
            return "Eleven";
        }
        if( rem == 2){
            return "Twelve";
        }
        if( rem == 3){
            return "Thirteen";
        }
        if( rem == 4){
            return "Fourteen";
        }
        if( rem == 5){
            return "Fifteen";
        }
        if( rem == 6){
            return "Sixteen";
        }
        if( rem == 7){
            return "Seventeen";
        }
        if( rem == 8){
            return "Eighteen";
        }
        if( rem == 9){
            return "Nineteen";
        }
        return null;
    }
}