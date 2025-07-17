// https://leetcode.com/problems/xor-operation-in-an-array/

class Solution {
    public int xorOperation(int n, int start) {
        int xOR=0;
        for(int i=0;i<n;i++){
            xOR^=start;
            start+=2;
        }
        return xOR;
        
    }
}
