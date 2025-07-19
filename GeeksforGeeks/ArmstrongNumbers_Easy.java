// https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1?page=1&category=Mathematical,Bit%20Magic&status=unsolved&sortBy=submissions

// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum=0;
        int temp=n;
        while(temp!=0){
            int rem=temp%10;
            sum+=rem*rem*rem;
            temp/=10;
        }
        return n==sum;
    }
}
