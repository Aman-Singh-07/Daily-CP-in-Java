// https://leetcode.com/problems/number-of-digit-one/?envType=problem-list-v2&envId=maths-m7-bitmasking-for-setsstates

class Solution {
    public int countDigitOne(int n) {
        long res=0;
        long factor=1; 
        while(factor<=n){
            long lower=n%factor;
            long current=(n/factor)%10;
            long higher=n/(factor*10);
            if(current==0){
                res+=higher*factor;
            }else if(current==1){
                res+=higher*factor+(lower+1);
            }else{
                res+=(higher+1)*factor;
            }
            factor*=10;
        }
        return (int) res;
    }
}
