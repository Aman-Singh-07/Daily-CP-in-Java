// https://leetcode.com/problems/maximum-capacity-within-budget/

class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int max=0;
        int[][] arr=new int[costs.length][2];
        for(int i=0;i<costs.length;i++){
            arr[i][0]=costs[i];
            arr[i][1]=capacity[i];
        }
        sortArray(arr);
        int[] prefix=new int[costs.length];
        prefix[0]=arr[0][1];
        for(int i=1;i<costs.length;i++){
            prefix[i]=Math.max(arr[i][1],prefix[i-1]);
        }
        for(int i=0;i<costs.length;i++){
            int find=budget-arr[i][0];
            int left=0;
            int right=i-1;
            int index=-1;
            while(left<=right){
                int mid=(left+right)/2;
                if(arr[mid][0]<find){
                    index=mid;
                    left=mid+1;
                }else right=mid-1;
            }
            if(index!=-1) max=Math.max(max,arr[i][1]+prefix[index]);
            
        }
        for(int i=0;i<costs.length;i++){
            if(costs[i]<budget) max=Math.max(capacity[i],max);
        }
        return max;
    }

    public static void sortArray(int[][] arr){
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
    }
}
