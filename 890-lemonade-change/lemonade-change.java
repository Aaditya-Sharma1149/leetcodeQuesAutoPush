class Solution {
    public boolean lemonadeChange(int[] bills) {
        int [] notes = new int[2]; 
        for(int i=0; i <bills.length; i++){
            if(bills[i]==5){
                notes[0]++;
                continue;
            }
            if(bills[i]==10){
                if(notes[0]==0) return false;
                notes[0]--;
                notes[1]++;
                continue;
            }
            if(bills[i]==20){
                if(notes[0]==0) return false;
                if(notes[1]==0 && notes[0]<3) return false;
                if(notes[1]>0){
                    notes[1]--;
                    notes[0]--;
                    continue;
                }
                if(notes[1]==0){
                    notes[0]=notes[0]-3;
                }
            }
        }
        return true;
    }
}