// https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/description/?envType=daily-question&envId=2026-02-23

class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<k) return false;
        HashSet<Long> set=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            set.add(Long.parseLong(s.substring(i,i+k),2));
        }
        return set.size()==(int) Math.pow(2,k);
    }
}
