// https://leetcode.com/problems/maximum-subarray-with-equal-products/?envType=daily-question&envId=2026-11-24

class Solution {
    public int maxLength(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            long prod=1;
            long gcd=0;
            long lcm=1;
            for(int j=i;j<nums.length;j++){
                prod*=nums[j];
                gcd=gcd(gcd,nums[j]);
                lcm=lcm/(gcd(lcm,nums[j]))*nums[j];
                if(prod==gcd*lcm){
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }

    public long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    public long lcm(long a,long b){
        return a*b/(gcd(a,b));
    }
    
}
