class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return ;
       int [] ans = new int[m+n];
       int index=0;
       int i=0;
       int j=0;
       while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                ans[index]=nums1[i];
                i++;
            }
            else{
                ans[index]=nums2[j];
                j++;
            }
            index++;
       }
       if(i<m){
            while(i<m){
                ans[index]=nums1[i];
                index++;
                i++;
            }
       }
       else if(j<n){
            while(j<n){
                ans[index]=nums2[j];
                index++;
                j++;
            }
       }
        for (int p = 0; p < m + n; p++) {
            nums1[p] = ans[p];
        }
    }
}