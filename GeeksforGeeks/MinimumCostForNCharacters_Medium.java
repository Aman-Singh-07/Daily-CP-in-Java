// https://www.geeksforgeeks.org/problems/minimum-time1238/1

class Solution {
    public int minCost(int n, int i, int d, int c) {
        // code here
        long res=n*i;
        while(n>1){
            if (n%2==0){
                res=Math.min(res, c+minCost(n/2,i,d,c));
            } 
            else{
                res=Math.min(res,i+minCost(n-1,i,d,c));
                res=Math.min(res,d+minCost(n+1,i,d,c));
            }

            break;
        }
        return (int) res;
    }
}
