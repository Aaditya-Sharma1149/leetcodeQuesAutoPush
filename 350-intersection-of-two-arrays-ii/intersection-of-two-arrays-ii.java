class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int count=0;
        int i=0;
        int j=0;
        int len=0;
        if(nums1.length>nums2.length) len=nums1.length; 
        else len=nums2.length;
        int [] nums = new int[len];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                nums[count]=nums1[i];
                count++;
                i++;
                j++;
                continue;
            }
            if(nums1[i]<nums2[j]){
                i++;
                continue;
            }
            j++;
        }
        int [] ans = new int[count];
        for(int index=0; index<count;index++){
            ans[index]=nums[index];
        }
        return ans;
    }
}
// a&b = a + b - a|b
// a|b=+a+b-a&b