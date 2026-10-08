// https://www.geeksforgeeks.org/problems/maximum-frequency-1662528911/1

class Solution {
    public int maxFrequency(int[] arr, int k) {
        // code here
        int j=0;
        long sum=0;
        int max=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while((long)arr[i]*(i-j+1)-sum>k){
                sum-=arr[j];
                j++;
            }
            max=Math.max(max,i-j+1);
            
        }
        return max;
        
    }
}
