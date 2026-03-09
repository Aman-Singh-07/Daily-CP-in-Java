// https://leetcode.com/problems/minimum-capacity-box/description/

class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int minNum=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize){
                if(minNum>capacity[i]){
                    minNum=capacity[i];
                    index=i;
                }
            }
        }
        return index;
    }
}
