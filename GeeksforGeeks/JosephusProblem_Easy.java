// https://www.geeksforgeeks.org/problems/josephus-problem/1

class Solution {
    public int josephus(int n, int k) {
        // code here
        if(n==1) return 1;
        return (josephus(n-1,k)+k-1)%n+1;
        
    }
}
