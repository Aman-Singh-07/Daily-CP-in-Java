// https://www.geeksforgeeks.org/problems/consecutive-numbers-for-sum3132/1

class Solution {
    public boolean isSumOfConsecutive(int n) {
        // code here
        if(n<=2) return false;
        return (n&(n-1))!=0;
    }
}
