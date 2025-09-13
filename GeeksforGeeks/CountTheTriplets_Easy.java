// https://www.geeksforgeeks.org/problems/count-the-triplets4615/1?page=1&difficulty=Easy&status=unsolved&sortBy=submissions

import java.util.*;

class Solution {
    int countTriplet(int arr[]) {
        Arrays.sort(arr);
        int n=arr.length;
        int count=0;
        for(int k=n-1;k>=0;k--){
            int i=0,j=k-1;
            while(i<j){
                int sum=arr[i]+arr[j];
                if(sum==arr[k]){
                    count++;
                    i++;
                    j--;
                }else if (sum<arr[k]){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return count;
    }
}
