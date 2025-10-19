// https://www.codechef.com/problems/EXPSTP?tab=statement

class Solution {
    public static int compute(int n, int x, int y, int a, int b) {
        // write your code here 
        int first=Math.abs(x-a)+Math.abs(y-b);
        int second=Math.min(Math.min(a-1,b-1),Math.min(n-a,n-b));
        int third=Math.min(Math.min(x-1,y-1),Math.min(n-x,n-y));
        int fourth=second+third+2;
        return Math.min(first,fourth);
        
    }
}


