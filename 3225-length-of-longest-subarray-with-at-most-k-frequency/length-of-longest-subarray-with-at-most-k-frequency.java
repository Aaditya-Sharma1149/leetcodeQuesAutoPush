class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        int ans=0; int l=0; int r=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        while(r<nums.length){
            if(map.containsKey(nums[r])){
                map.put(nums[r],map.get(nums[r])+1);
                if(map.get(nums[r]) > k){
                    ans = Math.max(ans,r-l);
                    while(map.get(nums[r])>k){
                        map.put(nums[l],map.get(nums[l])-1);
                        l++;
                    }
                }
            }
            else{
                map.put(nums[r],1);
            }
            r++;
        }
        ans = Math.max(ans,r-l);
        return ans;
    }
}