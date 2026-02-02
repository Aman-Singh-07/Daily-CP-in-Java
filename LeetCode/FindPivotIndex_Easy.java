// https://leetcode.com/problems/find-pivot-index/

class Solution {
    public int pivotIndex(int[] nums) {
        int res=0;
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        int num=0;
        for(int i=0;i<nums.length;i++){
            num+=nums[i];
            prefix[i]=num;
        }
        num=0;
        for(int i=nums.length-1;i>=0;i--){
            num+=nums[i];
            suffix[i]=num;
        }
        for(int i=0;i<nums.length;i++){
            if(prefix[i]==suffix[i]) return i;
        }
        return -1;
    }
}
