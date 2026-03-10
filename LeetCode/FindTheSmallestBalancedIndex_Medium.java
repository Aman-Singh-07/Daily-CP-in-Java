// https://leetcode.com/problems/find-the-smallest-balanced-index/

class Solution {
    public int smallestBalancedIndex(int[] nums) {
        long l=0,r=1;
        int j=nums.length-1;
        for(int i=0;i<nums.length;i++){
            while(j>i && l>=r && (l/r)+1>=nums[j]){
                r*=nums[j--];
            }
            if(j==i && l==r) return i;
            l+=nums[i];
        }
        return -1;
    }
}
