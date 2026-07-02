// https://www.geeksforgeeks.org/problems/subset-with-sum-divisible-by-m2546/1

class Solution {
    public boolean divisibleByK(int[] arr, int k) {
        // code here
        boolean[] dp=new boolean[k];
        dp[0]=false;
        for(int num:arr){
            boolean[] newdp=dp.clone();
            for(int j=0;j<k;j++){
                if(dp[j]){
                    newdp[(j+num)%k]=true;
                }
            }
            newdp[num%k]=true;
            dp=newdp;
        }
        return dp[0];
    }
}
