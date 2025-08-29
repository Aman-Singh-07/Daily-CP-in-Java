//  https://leetcode.com/problems/alice-and-bob-playing-flower-game/description/?envType=daily-question&envId=2025-08-29

class Solution {
    public long flowerGame(int n, int m) {
        long oddN=n/2+n%2;
        long evenN=n/2;
        long oddM=m/2+m%2;
        long evenM=m/2;
        return oddN*evenM + evenN*oddM;

    }
}
