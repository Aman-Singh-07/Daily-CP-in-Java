// https://leetcode.com/problems/maximum-number-of-items-from-sale-i/

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;
        int[] arr=new int[n];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=1;
            for(int j=0;j<n;j++){
                if(isTrue(i,j,items)){
                    arr[i]++;
                }
            }
            if(items[i][1]<min){
                min=items[i][1];
            }
        }
        int[] dp=new int[budget+1];
        for(int i=0;i<n;i++){
            int a=items[i][1];
            int b=arr[i];
            for(int j=budget;j>=a;j--){
                dp[j]=find(j,a,b,dp);
            }
        }
        for(int j=min;j<=budget;j++){
            dp[j]=find(j,min,1,dp);
        }
        int max=0;
        for(int j=0;j<=budget;j++){
            max=Math.max(max,dp[j]);
        }
        return max;
    }

    public static boolean isTrue(int i,int j,int[][] items){
        return i!=j && items[j][0]%items[i][0]==0;
    }

    public static int find(int j,int a,int b,int[] dp){
        return Math.max(dp[j],dp[j-a]+b);
    }
}
