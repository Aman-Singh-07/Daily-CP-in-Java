// https://leetcode.com/problems/binary-prefix-divisible-by-5/description/?envType=daily-question&envId=2025-11-24

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list=new ArrayList<>();
        int num=0;
        for(int n:nums){
            num=(num*2+n)%5;
            list.add(num==0);
        }
        return list;
    }
}
