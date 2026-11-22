// https://www.geeksforgeeks.org/problems/longest-subarray-with-sum-divisible-by-k1259/1

class Solution {
    public int longestSubarrayDivK(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixSum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            prefixSum+=arr[i];
            int rem=((prefixSum%k)+k)%k;
            if(rem==0) max=i+1;
            if(map.containsKey(rem)) max=Math.max(max,i-map.get(rem));
            else map.put(rem,i);
        }
        return max;
    }
}
