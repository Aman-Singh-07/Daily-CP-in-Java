// https://www.geeksforgeeks.org/problems/smallest-divisor/1
 
class Solution {
    int smallestDivisor(int[] arr, int k) {
        // Code here
        int n=arr.length;
        Arrays.sort(arr);
        int left=1;
        int right=arr[n-1];
        int res=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int count=0;
            for(int j=0;j<n;j++){
                count+=(arr[j] + mid - 1)/mid;
            }
            if(count<=k){
                res=mid;
                right=mid-1;
            }
            else left=mid+1;
        }
        return res;
    }
}
