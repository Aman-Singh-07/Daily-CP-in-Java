// https://leetcode.com/problems/trapping-rain-water/description/

class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] minHeight=new int[n];
        int[] maxHeight=new int[n];
        int maxLeft=height[0];
        int maxRight=height[n-1];
        for(int i=0;i<n;i++){
            minHeight[i]=Math.max(maxLeft,height[i]);
            if(height[i]>maxLeft) maxLeft=height[i];
        }
        for(int i=n-1;i>=0;i--){
            maxHeight[i]=Math.max(maxRight,height[i]);
            if(height[i]>maxRight) maxRight=height[i];
        }
        
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(minHeight[i],maxHeight[i])-height[i];
        }
        return sum;
    }
}
