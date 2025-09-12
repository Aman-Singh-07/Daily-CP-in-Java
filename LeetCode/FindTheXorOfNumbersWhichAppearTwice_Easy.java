// https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] freq=new int[51];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int xor=0;
        for(int i=0;i<51;i++){
            if(freq[i]==2){
                xor^=i;
            }
        }
        return xor;
    }
}
