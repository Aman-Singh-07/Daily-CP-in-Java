// https://www.geeksforgeeks.org/problems/count-digits5716/1?page=2&sortBy=submissions

// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count=0;
        int num=n;
        while(n>0){
            int rem=n%10;
            if(rem!=0){
                if(num%rem==0) count++;
            }
            n/=10;
        }
        return count;
    }
}
