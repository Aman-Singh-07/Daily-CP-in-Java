// https://leetcode.com/problems/minimum-number-of-seconds-to-make-mountain-height-zero/?envType=daily-question&envId=2026-03-13

class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long low=1;
        long high=10000000000000000L;
        while(low<high){
            long mid=(low+high)>>1;
            long height=0;
            for(int wtime:workerTimes){
                if(height>=mountainHeight) break;
                long count=(long)(Math.sqrt((2.0*mid)/wtime+0.25)-0.5);
                height+=count;
            }
            if(height>=mountainHeight) high=mid;
            else low=mid+1;
        }
        return low;
    }
}
