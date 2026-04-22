// https://leetcode.com/problems/truncate-sentence/description/

class Solution {
    public String truncateSentence(String s, int k) {
        String[] st=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k-1;i++) sb.append(st[i]+" ");
        sb.append(st[k-1]);
        return sb.toString();
    }
}
