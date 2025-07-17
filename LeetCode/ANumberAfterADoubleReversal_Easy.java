// https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-ii/description/?envType=daily-question&envId=2025-07-17

class Solution {
    public int maximumLength(int[] nums, int k) {
        int n=nums.length;
        int res=1;
        int[][] arr=new int[n][k];
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int m=(nums[i]+nums[j])%k;
                arr[i][m]=Math.max(arr[i][m],arr[j][m]+1);
                res=Math.max(res,arr[i][m]);
            }
            for(int m=0;m<k;m++){
                if(arr[i][m]==0) arr[i][m]=1;
            }
        }
        return res;
    }
}
