// https://www.geeksforgeeks.org/problems/pairs-with-difference-less-than-k1348/1

class Solution {
    public static int countPairs(int arr[], int k) {
        // code here
        int count=0;
        Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]-arr[i]<k) count++;
        //         else break;
        //     }
        // }
        
        int i=0;
        int j=0;
        while(j<arr.length){
            while(j<arr.length && (arr[j]-arr[i])<k) j++;
            if(j<arr.length && (arr[j]-arr[i])>=k){
                count+=(arr.length-j);
                
            }
            i++;
        }
        int n=arr.length-1;
        int res=(n*(n+1))/2;
        return res-count;
    }
}
