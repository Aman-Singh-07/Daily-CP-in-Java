// https://www.geeksforgeeks.org/problems/strong-numbers4336/1

class Solution {
    public boolean isStrong(int n) {
        // code here
        int sum=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            int fact=1;
            for(int i=2;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            if(sum>n) return false;
            temp/=10;
        }
        return n==sum;
    }
}
