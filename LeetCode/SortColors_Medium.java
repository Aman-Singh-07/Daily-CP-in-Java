// https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        int i=-1;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]==1){
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
    }
}
