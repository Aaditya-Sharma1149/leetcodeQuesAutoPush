class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int time = Integer.MAX_VALUE;

        int minLandTime = landStartTime[0] + landDuration[0];
        for(int i=0; i<n; i++){
            minLandTime = Math.min(minLandTime,landStartTime[i] + landDuration[i]);
        }
        int minWaterTime = waterStartTime[0]+waterDuration[0];
        for(int i=0; i<m; i++){
            minWaterTime =  Math.min(minWaterTime, waterStartTime[i] + waterDuration[i]);
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