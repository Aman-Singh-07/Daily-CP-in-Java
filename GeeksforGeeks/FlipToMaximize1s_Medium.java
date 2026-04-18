// https://www.geeksforgeeks.org/problems/flip-bits0240/1

class Solution {
    int maxOnes(int[] arr) {
        int totalOnes=0;
        int currentGain=0;
        int maxGain=0;
        for(int num:arr){
            if(num==1){
                totalOnes++;
            }
            int gain=(num==0)?1:-1;
            
            currentGain=Math.max(gain,currentGain+gain);
            maxGain = Math.max(maxGain,currentGain);
        }
        return totalOnes+maxGain;
    }
}
