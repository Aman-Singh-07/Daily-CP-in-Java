// https://www.geeksforgeeks.org/problems/power-of-k-in-n-where-k-may-be-non-prime4206/1

class Solution {
    public int maxKPower(int n, int k) {
        int result=Integer.MAX_VALUE;
        for(int i=2;i*i<=k;i++){
            int countK=0;
            while(k%i==0){
                countK++;
                k/=i;
            }
            if(countK>0){
                int countFact=0;
                int temp=n;
                while(temp>0){
                    countFact+=temp/i;
                    temp/=i;
                }
                result=Math.min(result,countFact/countK);
            }
        }
        if(k>1){
            int countFact=0;
            int temp=n;
            while(temp>0){
                countFact+=temp/k;
                temp/=k;
            }
            result=Math.min(result,countFact);
        }
        return result;
    }
}
