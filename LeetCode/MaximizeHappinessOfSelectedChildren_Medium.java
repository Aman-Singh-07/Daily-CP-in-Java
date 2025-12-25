// https://leetcode.com/problems/maximize-happiness-of-selected-children/?envType=daily-question&envId=2025-12-25

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long sum=0;
        Arrays.sort(happiness);
        int i=happiness.length-1;
        int j=0;
        while(k>0){
            if(happiness[i]-j>0) sum+=happiness[i]-j;
            i--;
            j++;
            k--;
        }
        return sum;
    }
}
