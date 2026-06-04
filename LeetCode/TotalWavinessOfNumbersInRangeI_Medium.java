// https://leetcode.com/problems/total-waviness-of-numbers-in-range-i/description/?envType=daily-question&envId=2026-06-04

class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            count+=find(i);
        }
        return count;
    }

    public static int find(int num){
        if(num<=100) return 0;
        int count=0;
        
        int rightDigit=num%10;
        num/=10;
        int middleDigit=num%10;
        num/=10;
        while(num>0){
            int leftDigit=num%10;
            if(middleDigit>rightDigit && middleDigit>leftDigit) {
                count++;
            } else if(middleDigit<rightDigit && middleDigit<leftDigit) {
                count++;
            }
            rightDigit=middleDigit;
            middleDigit=leftDigit;
            num/=10;
        }
        return count;
    }
}
