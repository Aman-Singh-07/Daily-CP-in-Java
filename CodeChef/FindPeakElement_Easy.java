// https://www.codechef.com/problems/FINDPEAK?tab=statement

class Solution {
    public int findPeakElement(int[] nums) {
        // write your code herer
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid]>nums[mid+1]) r=mid;
            else l=mid+1;
        }
        return 0;
        
    }
}
