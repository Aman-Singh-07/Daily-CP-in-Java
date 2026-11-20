// https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/

class Solution {
    public int minimumSum(int num) {
        int [] arr = new int [4];
        int cur = 0;
        while(num > 0){
            int digit = num % 10;
            arr[cur++] = digit;
            num /= 10;
        }
        Arrays.sort(arr);
        int num1 = arr[0] * 10 + arr[2];
        int num2 = arr[1] * 10 + arr[3];
        return num1 + num2;
    }
}
