// https://leetcode.com/problems/minimum-deletion-cost-to-make-all-characters-equal/description/

class Solution {
    public long minCost(String s, int[] cost) {
        long[] res=new long[26];
        for(int i=0;i<s.length();i++){
            res[s.charAt(i)-'a']+=cost[i];
        }
        Arrays.sort(res);
        long r=0;
        for(int i=0;i<res.length-1;i++){
            r+=res[i];
        }
        return r;
    }
}
