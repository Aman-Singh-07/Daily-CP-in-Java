// https://leetcode.com/problems/check-digitorial-permutation/

class Solution {
    public boolean isDigitorialPermutation(int n) {
        long sum=0;
        int temp=n;
        int[] freq=new int[10];
        while(temp>0){
            int r=temp%10;
            freq[r]++;
            sum+=fact(r);
            temp/=10;
        }
        while(sum>0){
            int r=(int) sum%10;
            freq[r]--;
            sum/=10;
        }
        for(int i=0;i<10;i++){
            if(freq[i]!=0) return false;
        }
        return true;
        
        
    }
    public static long fact(int num){
        if(num==0 || num==1) return 1;
        long f=1;
        for(int i=1;i<=num;i++){
            f*=i;
        }
        return f;
    }
    
}
