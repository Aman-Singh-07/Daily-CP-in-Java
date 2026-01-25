// https://leetcode.com/problems/rotate-non-negative-elements/

class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int count=0;
        for(int num:nums) if(num>=0) count++;
        int[] index=new int[count];
        int[] arr=new int[count];
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                arr[l]=nums[i];
                index[l]=i;
                l++;
            }
        }
        if(count==0) return nums;
        k=k%count;
        int[] res=new int[count];
        for(int i=0;i<arr.length;i++){
            res[i]=arr[(i+k)%count];
        }
        for(int i=0;i<count;i++){
            nums[index[i]]=res[i];
        }
        return nums;
        
    }
}
