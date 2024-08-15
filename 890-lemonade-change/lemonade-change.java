class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCent = 0; 
        int tenCent=0; 
        for(int i=0; i <bills.length; i++){
            if(bills[i]==5){
                fiveCent++;
                continue;
            }
            if(bills[i]==10){
                if(fiveCent<1) return false;
                fiveCent--;
                tenCent++;
                continue;
            }
            if(bills[i]==20){
                if(fiveCent<1) return false;
                if(tenCent==0 && fiveCent<3) return false;
                if(tenCent>0){
                    tenCent--;
                    fiveCent--;
                    continue;
                }
                fiveCent=fiveCent-3;
            }
        }
        return true;
    }
}