// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=daily-question&envId=2025-04-30

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int count2=0;
            while(nums[i]>0){
                nums[i]/=10;
                count2++;
            }
            if(count2%2==0){
                count++;
            }
        }
        return count;
        
    }
}
