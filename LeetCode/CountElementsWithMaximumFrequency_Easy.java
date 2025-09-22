// https://leetcode.com/problems/count-elements-with-maximum-frequency/description/?envType=daily-question&envId=2025-09-22

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int max=0;
        for(int num:freq){
            if(num>max) max=num;
        }
        int count=0;
        for(int num:freq){
            if(num==max){
                count+=num;
            }
        }
        return count;
        
    }
}
