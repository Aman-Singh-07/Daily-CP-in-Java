// https://leetcode.com/problems/count-the-digits-that-divide-a-number/
class Solution {
    public int countDigits(int num) {
        int resCount=0;
        int temp=num;
        while(temp>0){
            int rem=temp%10;
            if(num%rem==0) resCount++;
            temp/=10;
        }
        return resCount;
    }
}
