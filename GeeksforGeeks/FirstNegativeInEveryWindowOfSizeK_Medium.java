// https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1?page=1&category=Arrays&status=unsolved&sortBy=submissions

import java.util.*;

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> list=new ArrayList<>();
        int n=arr.length;
        int index=0;
        for(int i=k-1;i<n;i++){
            while(index<i && (index<=i-k || arr[index]>=0)){
                index++;
            }
            if(index<n && arr[index]<0){
                list.add(arr[index]);
            }else{
                list.add(0);
            }
        }
        return list;
    }
}
