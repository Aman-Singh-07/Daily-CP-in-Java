// https://leetcode.com/problems/count-square-sum-triples/description/?envType=daily-question&envId=2025-12-08

class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<=n;++i){
            for(int j=1;j<=n;++j){
                
                int num=i*i+j*j;
                int sqrt=(int) Math.sqrt(num);
                if(sqrt*sqrt==num && sqrt<=n) count++;
            

            }
        }
        return count;
    }
}
