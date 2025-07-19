// https://www.geeksforgeeks.org/problems/koko-eating-bananas/1

class Solution {
    public int kokoEat(int[] a, int k) {
        int left=1,right=0;
        for(int num:a) right=Math.max(right,num);
        int res=right;
        while (left<=right){
            int mid=left+(right-left)/2;
            int hrs=0;
            for(int num:a){
                hrs+=(num+mid-1)/mid;
                if(hrs>k) break;
            }
            if(hrs<=k){
                res=mid;
                right=mid-1;
            }else left=mid+1;
        }
        return res;
    }
}
