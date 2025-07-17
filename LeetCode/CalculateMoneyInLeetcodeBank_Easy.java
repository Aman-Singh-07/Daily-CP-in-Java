// https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/

class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int fullWeeks=n/7;
        int remainingDays=n%7;
        for(int i=1;i<=fullWeeks;i++){
            sum+=Sum(i,7);
        }
        if(remainingDays>0){
            sum+=Sum(fullWeeks+1,remainingDays);
        }
        return sum;
    }
    public int Sum(int dayStart, int count) {
        int sum=0;
        for (int i=0;i<count;i++){
            sum+=dayStart+i;
        }
        return sum;
    }
}
