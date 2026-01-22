// https://leetcode.com/problems/minimum-pair-removal-to-sort-array-i/description/?envType=daily-question&envId=2026-01-22

class Solution {
    public int minimumPairRemoval(int[] nums) {
        int res=0;
        int n=nums.length;
        while(!isSorted(nums,n)){
            res+=1;
            int min=Integer.MAX_VALUE;
            int idx=-1;
            for(int i=1;i<n;i++){
                int sum=nums[i-1]+nums[i];
                if(sum<min){
                    min=sum;
                    idx=i;
                }
            }
            nums[idx-1]=min;
            for(int i=idx;i<n-1;i++){
                nums[i]=nums[i+1];
            }
            n--;
        }
        return res;
    }

    public static boolean isSorted(int[] nums,int n){
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]) return false;
        }
        return true;
    }
}
