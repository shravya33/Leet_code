class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int res = Integer.MAX_VALUE;

        for(int i=0; i<landStartTime.length; i++){
            for(int j=0; j<waterStartTime.length; j++){

                int landfinish = landStartTime[i]+landDuration[i];
                int finished1 = Math.max(landfinish, waterStartTime[j]) + waterDuration[j];

                int waterfinish = waterStartTime[j]+waterDuration[j];
                int finished2 = Math.max(waterfinish, landStartTime[i]) + landDuration[i];

                res = Math.min(res, Math.min(finished1, finished2)); 
            }
        }

        return res;
    }
}