// https://leetcode.com/problems/maximum-number-of-operations-to-move-ones-to-the-end/description/?envType=daily-question&envId=2025-11-13

class Solution {
    public int maxOperations(String s) {
        int res=0;
        int count=s.charAt(0)-'0';
        for (int i=1;i<s.length();i++){
            int c=s.charAt(i)-'0';
            count+=c;
            res+=(c==0 && s.charAt(i-1)=='1')?count:0;
        }
        return res;
    }
}
