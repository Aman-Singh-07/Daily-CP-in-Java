// https://www.geeksforgeeks.org/problems/given-two-strings-find-if-first-string-is-a-subsequence-of-second/1

class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        int j=0;
        int count=0;
        for(int i=0;i<c2.length && j<c1.length;i++){
            if(c1[j]==c2[i]){
                count++;
                j++;
            }
        }
        return count==c1.length;
        
    }
};
