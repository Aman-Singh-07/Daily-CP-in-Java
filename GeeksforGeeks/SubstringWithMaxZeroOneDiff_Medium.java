// https://www.geeksforgeeks.org/problems/maximum-difference-of-zeros-and-ones-in-binary-string4111/1

class Solution {
    int maxSubstring(String s) {
        // code here
        if(!s.contains("0")) return -1;
        int sum=0;
        int max=0;
        for(char ch:s.toCharArray()){
            if(ch=='0'){
                sum++;
            }
            else sum--;
            if(sum<0) sum=0;
            max=Math.max(max,sum);
        }
        return max;
    }
}
