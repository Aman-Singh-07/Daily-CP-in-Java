// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int currSum=0;
            for(int j=i;j<n;j++){
                currSum+=arr[j];
                if((j-i+1)%2!=0){
                    sum+=currSum;
                }
            }
        }
        return sum;
    }
}
