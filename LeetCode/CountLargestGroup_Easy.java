// https://leetcode.com/problems/count-largest-group/description/?envType=daily-question&envId=2025-04-23

class Solution {
    public int countLargestGroup(int n) {
        int[] arr=new int[50];
        int  max=0;
        for(int j=1;j<=n;j++){
            int sum=0;
            int i=j;
            while(i>0){
                int r=i%10;
                sum+=r;
                i/=10;
            }
            arr[sum]++;
            max=Math.max(arr[sum],max);
        }
        int resSum=0;
        for(int i:arr){
            if(i==max) resSum++;
        }
        return resSum;
    }
}
