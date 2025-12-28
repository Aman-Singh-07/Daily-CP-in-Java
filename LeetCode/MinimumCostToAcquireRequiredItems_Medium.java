// https://leetcode.com/problems/minimum-cost-to-acquire-required-items/description/

class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long n1=(long) need1* (long) cost1;
        long n2=(long) need2* (long) cost2;
        long n3=(long) Math.min(need1,need2)* (long)costBoth;
        if(need1<need2){
            n3+=(long) (need2-need1)* (long)cost2;
        }else{
            n3+=(long) (need1-need2)* (long)cost1;
        }
        long n4= (long) Math.max(need1,need2)* (long) costBoth;
        return Math.min(n3,Math.min(n4,n1+n2));
    }
}
