class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0) return false;
        HashSet <Integer> set = new HashSet<>();
        int len = nums.length;
        int i=0;
        while(i<k && i<len){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            i++;
        }
        while(i<len){
            if(set.contains(nums[i])){
                return true;
            }
            set.remove(nums[i-k]);
            set.add(nums[i]);
            i++;
        }
        return false;
    }
}