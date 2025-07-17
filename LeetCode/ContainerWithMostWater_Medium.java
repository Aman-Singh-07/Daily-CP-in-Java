// https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int maxArea=0;
        while(l<r){
            int h=Math.min(arr[l],arr[r]);
            int w=r-l;
            maxArea=Math.max(maxArea,h*w);
            if(arr[l]<arr[r]){
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
