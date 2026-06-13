// https://leetcode.com/problems/weighted-word-mapping/?envType=daily-question&envId=2026-06-13

class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(String s:words){
            int sum=0;
            for(char ch:s.toCharArray()){
                sum+=weights[ch-'a'];
            }
            sum%=26;
            sb.append((char)(25 - sum + 'a'));
        }
        return sb.toString();
    }
}
