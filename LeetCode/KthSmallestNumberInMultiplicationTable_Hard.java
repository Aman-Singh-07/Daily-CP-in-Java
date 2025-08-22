// https://leetcode.com/problems/kth-smallest-number-in-multiplication-table/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low=1,high=m*n;
        while(low<high){
            int mid=low+(high-low)/2;
            int count=countLessEqual(mid,m,n);
            if(count<k){
                low=mid+1;
            }else{
                high=mid; 
            }
        }

        return low;
    }
    private int countLessEqual(int x, int m, int n) {
        int count=0;
        for(int i=1;i<=m;i++){
            count+=Math.min(x/i,n);
        }
        return count;
    }
}
