class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int l = landStartTime.length;
        int w = waterStartTime.length;
        int time = Integer.MAX_VALUE; 
        for(int i=0; i<l; i++){
            int landTime = landStartTime[i] + landDuration[i];
            for(int j=0; j<w; j++){
                time = Math.min(time,Math.max(landTime,waterStartTime[j]) + waterDuration[j]);
            }
        }
        for(int i=0; i<w; i++){
            int waterTime = waterStartTime[i] + waterDuration[i];
            for(int j=0; j<l; j++){
                time = Math.min(time,Math.max(waterTime,landStartTime[j]) + landDuration[j]);
            }
        }
        return time;

    }
}