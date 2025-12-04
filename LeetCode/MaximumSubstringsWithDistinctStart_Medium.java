// https://leetcode.com/problems/maximum-substrings-with-distinct-start/

class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set=new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        return set.size();
    }
}
