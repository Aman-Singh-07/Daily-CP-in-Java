// https://www.geeksforgeeks.org/problems/minimum-indexed-character-1587115620/1

class Solution {
    public static int minIndexChar(String s1, String s2) {
        // code here
        HashSet<Character> set=new HashSet<>();
        for(char ch:s2.toCharArray()){
            set.add(ch);
        }
        int index=Integer.MAX_VALUE;
        for(char ch:set){
            if(s1.indexOf(ch)!=-1){
                index=Math.min(index,s1.indexOf(ch));
            }
        }
        return index==Integer.MAX_VALUE?-1:index;
    }
}
