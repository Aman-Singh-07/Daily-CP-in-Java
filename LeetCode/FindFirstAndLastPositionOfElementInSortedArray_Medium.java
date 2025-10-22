// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/?envType=problem-list-v2&envId=array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        int left=0;
        int right=nums.length-1;
        boolean isLeft=false;
        boolean isRight=false;
        while(left<=right){
            if(nums[left]==target && !isLeft){
                arr[0]=left;
                isLeft=true;
            }
            if(nums[right]==target && !isRight){
                arr[1]=right;
                isRight=true;
            }
            if(!isRight) right--;
            if(!isLeft) left++;
            if(isLeft && isRight) break;
        }
        return arr;
        
    }
}
