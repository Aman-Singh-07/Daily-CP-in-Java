// https://leetcode.com/problems/count-indices-with-opposite-parity/description/

class Solution {
    public int[] countOppositeParity(int[] nums) {
        int countOdd=0;
        int countEven=0;
        int n=nums.length;
        int[] res=new int[n];
        for(int num:nums){
            if(num%2==0) countEven++;
            else countOdd++;
        }
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                res[i]=countOdd;
                countEven--;
            }else{
                res[i]=countEven;
                countOdd--;
            }
        }
        return res;
    }
}
