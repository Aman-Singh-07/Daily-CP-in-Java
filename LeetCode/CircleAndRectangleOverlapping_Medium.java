// https://leetcode.com/problems/circle-and-rectangle-overlapping/description/?envType=daily-question&envId=2026-09-19

class Solution {
    public boolean checkOverlap(int r, int xC, int yC, int x1, int y1, int x2, int y2) {
        x1-=xC;
        x2-=xC;
        y1-=yC;
        y2-=yC;
        int D=0;
        D+=(x1>0)?x1*x1:0;
        D+=(x2<0)?x2*x2:0;
        D+=(y1>0)?y1*y1:0;
        D+=(y2<0)?y2*y2:0;
        return r*r>=D;
    }
}
