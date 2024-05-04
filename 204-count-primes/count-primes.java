class Solution {
    public int countPrimes(int n) {
        int count=0;
        int [] arr = new int[n];
        
        for(int i=2; i*i<=n; i++){            //putting 1 for every composite visited in arr 
            if(arr[i]==1) continue;
            if( 1==checkprime(i) ){
               for(int j=2; i*j<n; j++){
                   arr[i*j]=1;
               }
           }
        }

        for(int j=2; j <= arr.length-1; j++){
            if(arr[j]==0) count++;
        }
        return count;
    }

     public int checkprime(int n){
        for(int j=2; j*j <=n; j++){
            if(n%j==0){
                return -1;
                }
            }
        return 1;
    }
}