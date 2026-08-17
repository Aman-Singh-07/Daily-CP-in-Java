// https://leetcode.com/problems/permutation-difference-between-two-strings/description/

class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] idx1=new int[26];
        int[] idx2=new int[26];
        for(int i=0;i<s.length();i++){
            idx1[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<t.length();i++){
            idx2[t.charAt(i)-'a']=i;
        }
        int res=0;
        for(int i=0;i<26;i++){
            res+=Math.abs(idx1[i]-idx2[i]);
        }
        return res;
    }
}
