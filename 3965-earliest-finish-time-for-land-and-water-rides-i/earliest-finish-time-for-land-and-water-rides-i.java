class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int time = Integer.MAX_VALUE;
        int [] landTime = new int [n];
        int [] waterTime = new int[m];

        for(int i=0; i<n; i++){
            landTime[i] = landStartTime[i] + landDuration[i];
        }
        int minLandTime = landTime[0];
        for(int i=0;i<n;i++){
            minLandTime=Math.min(minLandTime,landTime[i]);
        }

        for(int i=0; i<m; i++){
            waterTime[i] = waterStartTime[i] + waterDuration[i];
        }
        int minWaterTime =waterTime[0];
        for(int i=0;i<m;i++){
            minWaterTime=Math.min(minWaterTime,waterTime[i]);
        }
        
        for(int i=0; i<m; i++){
            time = Math.min(time,Math.max(minLandTime,waterStartTime[i]) + waterDuration[i]);
        }
        for(int i=0; i<n; i++){
            time = Math.min(time,Math.max(minWaterTime,landStartTime[i]) + landDuration[i]);
        }
        return time;
        

    }
}