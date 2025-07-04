// https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/?envType=daily-question&envId=2025-06-16

class Solution {
    public int maximumDifference(int[] arr) {
        int maxdiffer=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]>maxdiffer) maxdiffer=arr[j]-arr[i];
            }
        }
        return maxdiffer==0?-1:maxdiffer;
    }
}
