// https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/description/?envType=daily-question&envId=2026-03-05

class Solution {
    public int minOperations(String s) {
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)-'0'!=i%2){
                count++;
            }
        }
        return Math.min(count,n-count);
    }
}
