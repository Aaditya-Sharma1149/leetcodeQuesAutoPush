class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int total=0;
        int n= cardPoints.length;

        for(int i=0; i<n; i++){
            total=cardPoints[i]+total;
        }
        if(n==k) return total;

        for(int i=0; i<n-k; i++){
            sum = sum + cardPoints[i];
        }

        int ans=total-sum;

        for(int i=0; i<k; i++){
            sum = sum + cardPoints[n-k+i] - cardPoints[i];
            ans = Math.max(ans,total-sum);
        }
        return ans;
    }
}