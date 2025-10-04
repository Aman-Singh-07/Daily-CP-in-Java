// https://leetcode.com/problems/container-with-most-water/description/?envType=daily-question&envId=2025-10-04

class Solution {
    public int maxArea(int[] arr){
        int left=0;
        int right=arr.length-1;
        int max=0;
        while(left<right){
            int h=Math.min(arr[left],arr[right]);
            int w=right-left;
            max=Math.max(max,h*w);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
