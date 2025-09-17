// https://leetcode.com/problems/smallest-number-with-all-set-bits/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
public int smallestNumber(int n) {
        String s=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append("1");
        }
        return Integer.parseInt(sb.toString(),2);
    }
};
