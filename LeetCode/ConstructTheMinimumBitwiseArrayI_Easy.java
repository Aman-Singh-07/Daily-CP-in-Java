// https://leetcode.com/problems/construct-the-minimum-bitwise-array-i/?envType=daily-question&envId=2026-01-20

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] res=new int[nums.size()];
        int j=0;
        for(int num:nums){
            int x=0;
            while((x | x+1)!=num && x<num){
                x++;
            }
            if((x | x+1)==num) res[j++]=x;
            else res[j++]=-1;
        }
        return res;
    }
}
