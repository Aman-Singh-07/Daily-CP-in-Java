//  https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/?envType=problem-list-v2&envId=wqama0x5

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s:sentences){
            String[] str=s.split(" ");
            max=Math.max(str.length,max);
        }
        return max;
    }
}
