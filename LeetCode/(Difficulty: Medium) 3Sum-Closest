// https://leetcode.com/problems/3sum-closest/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=(nums[0]+nums[1]+nums[2]);
        for(int i=0;i<nums.length;i++){
           int left=i+1, right=nums.length-1;
           while(left<right){
            int sum3=nums[i]+nums[left]+nums[right];
            if(Math.abs(target-res)>Math.abs(target-sum3)){
                        res=sum3;
            }
            if(sum3<target) left++;
            else right--;
           }
        }
        return res;
    }
}
