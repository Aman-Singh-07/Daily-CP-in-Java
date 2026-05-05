// https://www.geeksforgeeks.org/problems/sum-of-xor-of-all-pairs0723/1

class Solution {
    public long sumXOR(int[] arr) {
        long sum=0;
        int n=arr.length;
        for(int i=0;i<32;i++){
            long countOnes=0;
            for(int j=0;j<n;j++){
                if((arr[j]&(1<<i))!=0){
                    countOnes++;
                }
            }
            long countZeroes=n-countOnes;
            long pairs = countOnes * countZeroes;
            sum += pairs * (1L << i);
        }
        
        return sum;
    }
}
