// https://leetcode.com/problems/binary-number-with-alternating-bits/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public boolean hasAlternatingBits(int n) {
        String binary=Integer.toBinaryString(n);
        for(int i=0;i<binary.length()-1;i++){
            if(binary.charAt(i)==binary.charAt(i+1)){
                return false;
            }
        }
        return true;
        
    }
}
