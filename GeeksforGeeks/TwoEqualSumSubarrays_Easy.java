// https://www.geeksforgeeks.org/problems/split-an-array-into-two-equal-sum-subarrays/1

class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int sum=0;
        int prefix=0;
        for(int num:arr) sum+=num;
        for(int num:arr){
            prefix+=num;
            if(prefix*2==sum) return true;
        }
        return false;
    }
}
