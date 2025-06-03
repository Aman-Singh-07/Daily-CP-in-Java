// https://leetcode.com/problems/stone-removal-game/

class Solution {
    public boolean canAliceWin(int n) {
        int turn=0;
        int lastMove=10;
        while(n>=lastMove){
            n-=lastMove;
            turn^=1; 
            lastMove--; 
        }
        return turn==1;
    }
}
