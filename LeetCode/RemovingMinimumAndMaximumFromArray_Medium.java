// https://leetcode.com/problems/removing-minimum-and-maximum-from-array/?envType=daily-question&envId=2026-08-30

class Solution {
    public int minimumDeletions(int[] nums) {
        int idx1=-1;
        int idx2=-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                idx1=i;
            }
            if(nums[i]>max){
                max=nums[i];
                idx2=i;
            }
        }
        int a=Math.min(idx1+1,nums.length-idx1);
        int b=Math.min(idx2+1,nums.length-idx2);
        int res=a+b;
        int c=Integer.MAX_VALUE;
        if(idx1<=idx2){
            c=Math.min(idx2+1,c);
            c=Math.min(nums.length-idx1,c);
        }else{
            c=Math.min(idx1+1,c);
            c=Math.min(nums.length-idx2,c);
        }
        return Math.min(res,c);
    }
}
