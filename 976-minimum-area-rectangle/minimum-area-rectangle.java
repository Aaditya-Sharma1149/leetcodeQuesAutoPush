class Solution {
    public int minAreaRect(int[][] points) {
        Set <String> set = new HashSet<>();
        int ans = Integer.MAX_VALUE;
        int count=0;
        for(int i=0; i<points.length; i++){
            set.add(points[i][0] + ":" + points[i][1]);
        }
        for(int i=0; i<points.length; i++){
            for(int j=i+1; j<points.length; j++){
                int x1 = points[i][0];
                int y1 = points[j][1];
                int x2 = points[j][0];
                int y2 = points[i][1];
                if(x1==x2 || y1==y2) continue;
                if(set.contains(x1 + ":" + y1) && set.contains(x2 + ":" + y2)){
                    ans = Math.min(ans,Math.abs((x2-x1)*(y2-y1)));
                    count++;
                
                }
            }
        }
        if(count==0) return 0;
        return ans;
    }
}