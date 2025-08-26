// https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/description/?envType=daily-question&envId=2025-08-26

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal=0;
        int maxArea=0;

        for(int[] rect:dimensions){
            int length=rect[0];
            int width=rect[1];
            int diagonal=length*length + width*width;
            int area=length*width;

            if(diagonal>maxDiagonal || (diagonal==maxDiagonal && area>maxArea)){
                maxDiagonal=diagonal;
                maxArea=area;
            }
        }

        return maxArea;
    }
}
