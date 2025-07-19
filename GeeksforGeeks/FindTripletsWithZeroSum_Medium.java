// https://www.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1?page=4&sortBy=submissions

/*Complete the function below*/

class Solution {
    // Function to find triplets with zero sum.
    public boolean findTriplets(int[] arr) {
        // code here.
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int left=i+1,right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0) return true;
                else if(sum<0) left++;
                else right--;
            }
        }
        return false;
    }
}
