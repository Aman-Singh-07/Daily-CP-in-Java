// https://leetcode.com/problems/unique-length-3-palindromic-subsequences/description/?envType=daily-question&envId=2025-11-21

class Solution {
    public int countPalindromicSubsequence(String s) {
        int n=s.length();
        int count=0;
        for(char c='a';c<='z';c++){
            int first=s.indexOf(c);
            int last=s.lastIndexOf(c);
            if(first!=-1 && last!=-1 && first<last){
                HashSet<Character> middleChars=new HashSet<>();
                for(int i=first+1;i<last;i++){
                    middleChars.add(s.charAt(i));
                }
                count+=middleChars.size();
            }
        }

        return count;
    }
}
