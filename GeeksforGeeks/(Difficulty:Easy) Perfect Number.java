// https://www.geeksforgeeks.org/problems/perfect-numbers3207/1?page=6&status=unsolved&sortBy=submissions

class Solution {
    static boolean isPerfect(int n) {
        // code here
        if(n<=1) return false;
        int sum=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                sum+=i;
                if((n/i)!=i) sum+=(n/i);
            }
        }
        return sum==n;
    }
};
