//  https://leetcode.com/problems/bitwise-and-of-numbers-range/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
       int shift=0;
       while(left<right){
        left>>=1;
        right>>=1;
        shift++;
       }
       return left<<shift;
        
    }
}
