// https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1?page=3&status=unsolved&sortBy=submissions

class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        Set<Integer> set=new HashSet<>();
        int prefixSum=0;
        for(int num:arr){
            prefixSum+=num;
            if(prefixSum==0 || set.contains(prefixSum) || num==0){
                return true;
            }
            set.add(prefixSum);
        }
        return false;
    }
}
