// https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/description/?envType=daily-question&envId=2026-02-07

class Solution {
    public int minimumDeletions(String s) {
        int bCount=0;  
        int count=0; 
        for(char c:s.toCharArray()){
            if(c=='b'){
                bCount++; 
            }else{ 
                
                count=Math.min(count+1,bCount);
            }
        }
        return count;
    }
}
