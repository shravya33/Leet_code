class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int res=Integer.MAX_VALUE;

        int fastestlandfinish = Integer.MAX_VALUE;
        for(int i=0; i<landStartTime.length; i++){
            fastestlandfinish = Math.min(fastestlandfinish, landStartTime[i]+landDuration[i]);
        }
        
        int landthenwater = Integer.MAX_VALUE;
        for(int i=0; i<waterStartTime.length; i++){
            landthenwater = Math.min(landthenwater, Math.max(fastestlandfinish, waterStartTime[i])+waterDuration[i]);
        }

        int fastestwaterfinish= Integer.MAX_VALUE;
        for(int i=0; i<waterStartTime.length; i++){
            fastestwaterfinish = Math.min(fastestwaterfinish, waterStartTime[i]+waterDuration[i]);
        }

        int waterthenland = Integer.MAX_VALUE;
        for(int i=0; i<landStartTime.length; i++){
            waterthenland = Math.min(waterthenland, Math.max(fastestwaterfinish, landStartTime[i])+landDuration[i]);
        }

        return Math.min(landthenwater, waterthenland);
    }
}