//  https://www.geeksforgeeks.org/problems/ncr1019/1?page=4&sortBy=submissions

class Solution {
    public int nCr(int n, int r) {
        if(r>n) return 0;
        if(r==0 || r==n) return 1;
        r=Math.min(r,n-r);
        long res=1;
        for(int i=1;i<=r;i++){
            res=res*(n-i+1);
            res=res/i;
        }
        return (int) res;
    }
}
