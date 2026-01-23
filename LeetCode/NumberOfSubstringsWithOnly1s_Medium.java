// https://leetcode.com/problems/number-of-substrings-with-only-1s/description/?envType=daily-question&envId=2026-01-23

class Solution {
    public int numSub(String s){
        long res=0;
        int count=0;
        int MOD=1000000007;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                count++;
                res+=count;
            }else{
                count=0;
            }
        }
        
        return (int)(res%MOD);
    }
}
