// https://leetcode.com/problems/maximum-odd-binary-number/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb=new StringBuilder();
        int count1=0;
        int count0=0;
        for(char ch:s.toCharArray()){
            if(ch=='1') count1++;
            else count0++;
        }
        int first=count1-1;
        while(first>0){
            sb.append('1');
            first--;
        }
        while(count0>0){
            sb.append('0');
            count0--;
        }
        sb.append('1');
        return sb.toString();

        
    }
}
