// https://leetcode.com/problems/count-days-spent-together/description/?envType=daily-question&envId=2026-10-24

class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] arr={0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] prefixSum=new int[13];
        prefixSum[0]=arr[0];
        for(int i=1;i<13;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        
        int maAlice=Integer.valueOf(arriveAlice.substring(0,2));
        int mlAlice=Integer.valueOf(leaveAlice.substring(0,2));
        int maBob=Integer.valueOf(arriveBob.substring(0,2));
        int mlBob=Integer.valueOf(leaveBob.substring(0,2));
        
        int daAlice=Integer.valueOf(arriveAlice.substring(3));
        int dlAlice=Integer.valueOf(leaveAlice.substring(3));
        int daBob=Integer.valueOf(arriveBob.substring(3));
        int dlBob=Integer.valueOf(leaveBob.substring(3));

        if (mlAlice < maBob || (mlAlice == maBob && dlAlice < daBob)) return 0;

        if (mlBob < maAlice || (mlBob == maAlice && dlBob < daAlice)) return 0;

        if(maAlice>maBob){
            if(mlAlice<mlBob){
                return (prefixSum[mlAlice-1]+dlAlice)-(prefixSum[maAlice-1]+daAlice) + 1;
            }else if(mlAlice>mlBob){
                return (prefixSum[mlBob-1]+dlBob)-(prefixSum[maAlice-1]+daAlice) + 1;
            }else{
                return (prefixSum[mlBob-1]+Math.min(dlBob,dlAlice))-(prefixSum[maAlice-1]+daAlice) + 1;
            }
        }
        else if(maAlice<maBob){
            if(mlAlice<mlBob){
                return (prefixSum[mlAlice-1]+dlAlice)-(prefixSum[maBob-1]+daBob) + 1;
            }else if(mlAlice>mlBob){
                return (prefixSum[mlBob-1]+dlBob)-(prefixSum[maBob-1]+daBob) + 1;
            }else{
                return (prefixSum[mlBob-1]+Math.min(dlBob,dlAlice))-(prefixSum[maBob-1]+daBob) + 1;
            }
        }else{
            if(mlAlice<mlBob){
                return (prefixSum[mlAlice-1]+dlAlice)-(prefixSum[maBob-1]+Math.max(daBob,daAlice)) + 1;
            }else if(mlAlice>mlBob){
                return (prefixSum[mlBob-1]+dlBob)-(prefixSum[maBob-1]+Math.max(daBob,daAlice)) + 1;
            }else{
                return (prefixSum[mlBob-1]+Math.min(dlBob,dlAlice))-(prefixSum[maBob-1]+Math.max(daBob,daAlice)) + 1;
            }
        }
    }
}
