class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i=num1; i<=num2; i++){
            int j = i;
            while(j>100){
                if(wave(j)) ans++;
                j = j / 10;
            }
        }
        return ans;
    }
    public boolean wave(int num){
        int z = num % 10;
        num = num / 10;
        int y = num % 10;
        num = num / 10;
        int x = num % 10; 
        if(z>y && x>y) return true;
        if(z<y && x<y) {
            return true;}
        return false;
    }
}