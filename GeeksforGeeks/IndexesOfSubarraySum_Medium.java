//  https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&category=Arrays&status=unsolved&sortBy=submissions

import java.util.*;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result=new ArrayList<>();
        int n=arr.length;
        int index=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            while(sum>target && index<i){
                sum-=arr[index];
                index++;
            }
            if(sum==target){
                result.add(index+1);
                result.add(i+1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}
