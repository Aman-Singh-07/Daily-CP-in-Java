// https://leetcode.com/problems/sum-of-gcd-of-formed-pairs/description/?envType=daily-question&envId=2026-07-16

class Solution {
    public long gcdSum(int[] nums) {
        int[] prefixGcd=new int[nums.length];
        int max=-1;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            prefixGcd[i]=gcd(max,nums[i]);
        }
        Arrays.sort(prefixGcd);

        long sum=0;
        int i=0, j=nums.length-1;
        while(i<j){
            sum+=gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }

        return sum;
    }

    public static int gcd(int a, int b) {
       if(b==0) return a;
       return gcd(b,a%b);
    }
}
