//  https://leetcode.com/problems/domino-and-tromino-tiling/description/?envType=daily-question&envId=2025-05-05

class Solution {
    public int numTilings(int n) {
        long[] ways=new long[n+3];
        ways[0]=1;
        ways[1]=2;
        ways[2]=5;
        for (int i=3;i<n;i++){
            ways[i]=(ways[i-1]*2+ways[i-3])%1000000007;
        }
        return (int)ways[n-1];
    }
}
