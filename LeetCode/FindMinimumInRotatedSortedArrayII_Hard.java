// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description

class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int res=Integer.MAX_VALUE;
        while(l<r){
            if(nums[l]!=nums[r]){
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[r]){
                l=mid+1;
            }
            else r=mid;
            }
            else{
                res=Math.min(nums[l],res);
                l++;
                r--;
            }
        }
        return Math.min(res,nums[l]);
    }
}
