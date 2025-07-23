// https://leetcode.com/problems/binary-gap/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int max=0;
        for(int i=0;i<s.length();i++){
            int count=0;
            if(s.charAt(i)=='1'){
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(j)=='1'){
                        count++;
                        max=Math.max(max,count);
                        break;
                    }
                    count++;
                }
            }
        }
        return max;
    }
}
