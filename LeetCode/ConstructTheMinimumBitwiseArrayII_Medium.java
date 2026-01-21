// https://leetcode.com/problems/construct-the-minimum-bitwise-array-ii/description/?envType=daily-question&envId=2026-01-21

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] arr=new int[nums.size()];
        int i=0;
        for(int num:nums){
            int x=num+1;
            if(num==2) arr[i++]=-1;
            else arr[i++]=num-((x)&(-x))/2;
        }
        return arr;
    }
}
