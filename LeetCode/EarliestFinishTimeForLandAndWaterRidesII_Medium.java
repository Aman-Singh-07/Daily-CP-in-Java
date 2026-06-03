// https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-ii/?envType=daily-question&envId=2026-06-03

class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landFirst = getBestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);
        int waterFirst = getBestFinishTime(waterStartTime, waterDuration, landStartTime, landDuration);
        
        return Math.min(landFirst, waterFirst);
    }

    private int getBestFinishTime(int[] start1, int[] dur1, int[] start2, int[] dur2) {
        int minEnd1 = Integer.MAX_VALUE;
        for (int i = 0; i < start1.length; i++) {
            minEnd1 = Math.min(minEnd1, start1[i] + dur1[i]);
        }
        
        int bestFinish = Integer.MAX_VALUE;
        for (int j = 0; j < start2.length; j++) {
            int finishTime = Math.max(minEnd1, start2[j]) + dur2[j];
            bestFinish = Math.min(bestFinish, finishTime);
        }
        
        return bestFinish;
    }
}
