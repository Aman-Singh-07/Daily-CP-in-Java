// https://leetcode.com/problems/furthest-point-from-origin/description/

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL=0;
        int countR=0;
        int count_=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L') countL++;
            if(ch=='R') countR++;
            if(ch=='_') count_++;
        }
        return Math.abs(countL-countR)+count_;
    }
}
