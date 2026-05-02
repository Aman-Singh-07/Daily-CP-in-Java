// https://www.geeksforgeeks.org/problems/find-position-of-set-bit3706/1

class Solution {
    public int findPosition(int n) {
        // code here
        if(n<=0 || (n&(n-1))!=0){
            return -1;
        }
        return Integer.numberOfTrailingZeros(n)+1;
    }
}
