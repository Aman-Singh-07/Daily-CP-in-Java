// https://www.geeksforgeeks.org/problems/count-subarray-with-k-odds/1

class Solution {
    public int countSubarrays(int[] arr, int k) {
        // code here
        int count=0;
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:arr){
            if(num%2!=0) count++;
            res+=map.getOrDefault(count-k,0);
            map.put(count,map.getOrDefault(count,0)+1);
        }
        return res;
    }
}
