class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        if (n == 1) {
            return 0;
        }
        long [] suffix = new long [n];
        long [] prefix = new long [n];

        suffix[n-1] = grid[0][n-1];
        prefix[0]   = grid[1][0];
        
        for(int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1] + grid[0][i];
        }

        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + grid[1][i];
        }

        int i=minIndex(prefix,suffix);
        // for(long j:suffix){
        //     System.out.print(j +" ");
        // }
        // System.out.println();
        // for(long j:prefix){
        //     System.out.print(j +" ");
        // }
        // System.out.println();
        // System.out.println(i);

        if (i == 0) {
            return suffix[1];
        } else if (i == n - 1) {
            return prefix[n - 2];
        }
        return Math.max(prefix[i - 1], suffix[i + 1]);

    }

    public int minIndex(long [] prefix , long [] suffix){
        
        int index=0;
        int n = prefix.length;
        long ans=Long.MAX_VALUE;
        if (n == 1) return 0; // Only one column.

        if (n > 1) {
            ans = suffix[1]; // Robot 2 can only go down on the top row.
            index = 0;
        }

        // Check for the last index (i == n - 1)
        if (n > 1 && prefix[n - 2] < ans) {
            ans = prefix[n - 2]; // Robot 2 can only go up on the bottom row.
            index = n - 1;
        }
        for(int i=1; i<n-1; i++){
            if(Math.max(prefix[i-1],suffix[i+1])<ans){
                ans=Math.max(prefix[i-1],suffix[i+1]);
                index=i;
            }
        }

        return index;
    }
}