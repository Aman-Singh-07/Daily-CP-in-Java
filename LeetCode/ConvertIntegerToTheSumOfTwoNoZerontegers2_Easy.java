// https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/description/?envType=daily-question&envId=2025-09-08

class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr=new int[2];
        int temp=n-1;
        while(isZero(temp)==false || isZero(n-temp)==false){
            temp=temp-1;
        }
        arr[0]=temp;
        arr[1]=n-temp;
        return arr;
        
    }

    public static boolean isZero(int num){
        while(num>0){
            if(num%10==0) return false;
            num/=10;
        }
        return true;
    }
}
