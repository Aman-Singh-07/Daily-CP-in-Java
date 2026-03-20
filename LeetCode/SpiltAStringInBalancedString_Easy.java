// https://leetcode.com/problems/split-a-string-in-balanced-strings/

class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int balanced=0;
        for(char ch:s.toCharArray()){
            if(ch=='L') balanced--;
            else balanced++;
            if(balanced==0) count++;
        }
        return count;
    }
}
