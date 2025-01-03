class Solution {
    public int[] constructRectangle(int area) {
        int w = sqrt(area);
        int [] ans = new int[2];
        while(w>0){
            if(area%w!=0){ 
                w--;
                continue;
            }
            ans[0]=area/w;
            ans[1]=w;
            break;
        }
        return ans;
    }
    public int sqrt(int num){
        int ans=0;
        for(int i=0; i*i<=num;i++){
            ans = i;
        }
        return ans;
    }
    
}