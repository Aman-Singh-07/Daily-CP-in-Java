// https://www.geeksforgeeks.org/problems/count-pairs-in-array-divisible-by-k/1 

class Solution {
    public int countKdivPairs(int[] arr, int k) {
        // code here
        int[] res=new int[k];
        int count=0;
        for(int i:arr){
            count+=res[i%k];
            res[(-i%k+k)%k]++;
        }
        return count;
    }
}
