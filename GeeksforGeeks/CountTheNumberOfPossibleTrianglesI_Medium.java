// https://www.geeksforgeeks.org/problems/count-possible-triangles-1587115620--094125/1?page=2&difficulty=Medium&status=unsolved&sortBy=accuracy

import java.util.Arrays;

class Solution {
    static int findNumberOfTriangles(int arr[]) {
        Arrays.sort(arr);
        int n=arr.length;
        int count=0;
        for(int k=n-1;k>=2;k--){
            int i=0,j=k-1;
            while(i<j){
                if(arr[i]+arr[j]>arr[k]){
                    count+=(j-i); 
                    j--;
                }else{
                    i++;
                }
            }
        }
        return count;
    }
}
