// http://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res=new int[2];
        res[0]=1;
        res[1]=n-1;
        while(isZero(res[0]) || isZero(res[1])){
            res[0]++;
            res[1]--;
        }
        return res;
        
    }

    public boolean isZero(int num){
        while(num>0){
            if(num%10==0) return true;
            num/=10;
        }
        return false;
    }
}
