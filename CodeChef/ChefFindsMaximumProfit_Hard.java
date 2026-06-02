// https://www.codechef.com/problems/LXYQY01?tab=statement

class Solution {
    public static class Job{
        int start;
        int end;
        int profit;
        Job(int start,int end,int profit){
            this.start=start;
            this.end=end;
            this.profit=profit;
        }
    }
    public static long calculateMaxProfit(
            int[] jobStartTimes,
            int[] jobEndTimes,
            int[] jobProfits) {
        int n=jobStartTimes.length;
        if(n==0) return 0;
        Job[] arr=new Job[n];
        fill(jobStartTimes,jobEndTimes,jobProfits,n,arr);
        Arrays.sort(arr,(a, b)->Integer.compare(a.end,b.end));
        long[] dp=new long[n];
        dp[0]=arr[0].profit;
        for(int i=1;i<n;i++){
            long temp=arr[i].profit;
            int num=-1;
            int left=0;
            int right=i-1;
            num=getNum(left,right,arr,i,num);
            if(num!=-1) temp=temp+dp[num];
            long temp2=dp[i-1];
            dp[i]=Math.max(temp,temp2);
        }
        return dp[n-1];
    }

    public static void fill(int[] jobStartTimes,int[] jobEndTimes,int[] jobProfits,int n,Job[] arr){
        for(int i=0;i<n;i++){
            arr[i]=new Job(jobStartTimes[i],jobEndTimes[i],jobProfits[i]);
        }
    }

    public static int getNum(int left,int right,Job[] arr,int i,int num){
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid].end<=arr[i].start){
                num=mid;
                left=mid+1;
            }else right=mid-1;
        }
        return num;
    }
}
