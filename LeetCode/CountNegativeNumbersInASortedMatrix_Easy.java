// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/?envType=daily-question&envId=2026-01-07

class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int[] arr:grid){
            int left=0;
            int right=arr.length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(arr[mid]<0){
                    count+=(right-mid+1);
                    right=mid-1;
                }else left=mid+1;
            }
        }
        return count;
    }
}
