// https://leetcode.com/contest/weekly-contest-451/problems/find-minimum-log-transportation-cost/

class Solution {
    public long minCuttingCost(int n, int m, int k) {
        long totalCost=0;
        if(n>k) totalCost+=(long)(n-k)*k;
        if(m>k) totalCost+=(long)(m-k)*k;
        return totalCost;
    }
}
