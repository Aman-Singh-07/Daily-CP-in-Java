// https://leetcode.com/problems/find-lucky-integer-in-an-array/

class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        int[] res=new int[501];
        for(int i=0;i<n;i++){
            res[arr[i]]++;
        }
        for(int i=500;i>0;i--){
            if(res[i]==i) return i;
        }
        return -1;
    }
}
