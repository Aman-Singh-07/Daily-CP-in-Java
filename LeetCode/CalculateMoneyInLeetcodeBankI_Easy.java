// https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/?envType=daily-question&envId=2025-10-25

class Solution {
    public int totalMoney(int n) {
        int temp=1;
        int x=1;
        int count=0;
        int res=0;
        while(n!=0){
            res+=x;
            x++;
            count++;
            if(count==7){
                temp++;
                x=temp;
                count=0;
            }
            n--;
        }
        return res;
        
    }
}
