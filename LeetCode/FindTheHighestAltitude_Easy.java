// https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
    public int largestAltitude(int[] gain) {
        int i=0,max=0;
        for(int g:gain){
            i+=g;
            if(i>max) max=i;
        }
        return max;
    }
}
