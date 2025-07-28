// https://leetcode.com/problems/binary-prefix-divisible-by-5/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> l=new ArrayList<>();
        int res=0;
        for(int num:nums){
            res=(res<<1 | num)%5;
            l.add(res==0);
            
        }
        return l;
    }
}
