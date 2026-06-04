class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = 0;
        int [] prefix = new int[nums.length];
        prefix[0]=nums[0];
        
        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(prefix[i]-goal)){
                ans = ans + map.get(prefix[i]-goal);
            }
            if(map.containsKey(prefix[i])){
                map.put( prefix[i], map.get(prefix[i]) + 1 );
            }
            else{
                map.put(prefix[i],1);
            }
        }
        return ans;
    }
}