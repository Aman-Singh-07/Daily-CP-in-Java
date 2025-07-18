// https://leetcode.com/problems/find-closest-person/

class Solution {
    public int findClosest(int x, int y, int z) {
        int a=x-z;
        int b=y-z;
        if(x<z) a=z-x;
        if(y<z) b=z-y;
        return (a>b?2:b>a?1:0);
        
    }
}
