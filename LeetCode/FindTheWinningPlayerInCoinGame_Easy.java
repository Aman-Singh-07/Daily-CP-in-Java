// https://leetcode.com/problems/find-the-winning-player-in-coin-game/

class Solution {
    public String winningPlayer(int x, int y) {
        int count=Math.min(x,y/4);
        return count%2==1?"Alice":"Bob";
    }
}
