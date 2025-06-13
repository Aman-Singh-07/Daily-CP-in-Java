// https://leetcode.com/problems/a-number-after-a-double-reversal/description/

class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp1=num;
        int reversed1=0;
        while(temp1>0){
            int rem1=temp1%10;
            reversed1=reversed1*10+rem1;
            temp1/=10;
        }
        int temp2=reversed1;
        int reversed2=0;
        while(temp2>0){
            int rem2=temp2%10;
            reversed2=reversed2*10+rem2;
            temp2/=10;
        }
        return num==reversed2;
        
    }
}
