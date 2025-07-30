// https://leetcode.com/problems/complement-of-base-10-integer/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        String s=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='1') sb.append('0');
            else sb.append('1');
        }
        String res=sb.toString();
        return Integer.parseInt(res,2);
        
    }
}
