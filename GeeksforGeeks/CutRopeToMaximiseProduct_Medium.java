// https://www.geeksforgeeks.org/problems/max-rope-cutting1312/1

class Solution {
    public int maxProduct(int n) {
        // code here
        if(n==2) return 1;
        if(n==3) return 2;
        int num=n/3;
        if(n%3==2){
            return power(3,num)*2;
        }
        if(n%3==1){
            return power(3,num-1)*4;
        }
        return power(3,num);
    }
    
    public static int power(int base,int exp){
        int res=1;
        while(exp>0){
            if(exp%2!=0) res=res*base;
            base=base*base;
            exp/=2;
        }
        return res;
    }
}
