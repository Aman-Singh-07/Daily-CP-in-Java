// https://leetcode.com/problems/number-complement/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int findComplement(int num) {
        int res=1;
        while(res<num){
            res=(res<<1)|1;
        }
        return res^num;
    }
}
