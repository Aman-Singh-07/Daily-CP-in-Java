// https://www.geeksforgeeks.org/problems/type-of-array4605/1?page=1&status=unsolved&sortBy=difficulty

// User function Template for Java

class Solution {
    int maxNtype(int arr[]) {
        // code here
        int count1=1;
        int count2=1;
        int count3=1;
        int count4=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                count1++;
                count4++;
            }
            if(arr[i]>arr[i+1]){
                count2++;
                count3++;
            }
            
        }
        if(count1==arr.length) return 1;
        if(count2==arr.length) return 2;
        if(count3>2) return 3;
        else return 4;
    }
}
