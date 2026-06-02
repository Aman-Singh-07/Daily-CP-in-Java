// https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-i/description/?envType=daily-question&envId=2026-06-02

class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int num=landStartTime[i]+landDuration[i];
                int max=Math.max(num,waterStartTime[j])+waterDuration[j];
                min=Math.min(min,max);

            }
        }
        for(int i=0;i<waterStartTime.length;i++){
            for(int j=0;j<landStartTime.length;j++){
                int num=waterStartTime[i]+waterDuration[i];
                int max=Math.max(num,landStartTime[j])+landDuration[j];
                min=Math.min(min,max);

            }
        }
        return min;
    }
}
