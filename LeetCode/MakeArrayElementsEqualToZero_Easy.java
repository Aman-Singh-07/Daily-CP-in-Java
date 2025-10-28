// https://leetcode.com/problems/make-array-elements-equal-to-zero/description/?envType=daily-question&envId=2025-10-28

class Solution {
    public int countValidSelections(int[] nums) {
        int prefix=0;
        int count=0;
        int sum=0;
        for(int num:nums) sum+=num;
        for(int x:nums){
            prefix+=x;
            if(x==0){
                int num=Math.max(2-Math.abs(2*prefix-sum),0);
                count+=num;
            }
        }
        return count;
    }
}
