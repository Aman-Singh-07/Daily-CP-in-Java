//  https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1?page=2&sortBy=submissions

// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int max=1;
        int plateform=1;
        int n=arr.length;
        int i=1,j=0;
        while(i<n &&  j<n){
            if(arr[i]<=dep[j]){
                plateform++;
                i++;
            }
            else{
                plateform--;
                j++;
            }
            max=Math.max(plateform,max);
        }
        return max;
    }
}
