class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = 0;
        int [] prefix = new int[nums.length];
        prefix[0]=nums[0];
        
        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        for(int n:prefix){
            System.out.print(n);
        }

        for(int i=nums.length-1; i>=0; i--){
            if(prefix[i]==goal) ans++;
            for(int j=i-1; j>=0; j--){
                if(prefix[i]-prefix[j]==goal) ans++;
            }
        }
        return ans;
    }
}