// https://leetcode.com/problems/longest-substring-without-repeating-characters/?envType=problem-list-v2&envId=wqama0x5

class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> set=new ArrayList<>();
        int res=0;
        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                res=Math.max(res,set.size());
                int idx=set.indexOf(ch);
                for(int i=0;i<=idx;i++){
                    set.remove(0);
                }
            }
            set.add(ch);
        }
        res=Math.max(res,set.size());
        return res;

    }
}
