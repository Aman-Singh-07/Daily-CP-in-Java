// https://www.geeksforgeeks.org/problems/palindrome0746/1?page=4&difficulty=Easy&status=unsolved&sortBy=submissions

class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int rev=0;
        int temp=n;
        while(temp>0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        return rev==n;
    }
}
