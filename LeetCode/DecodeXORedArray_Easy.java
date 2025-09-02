// https://leetcode.com/problems/decode-xored-array/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] arr=new int[encoded.length+1];
        arr[0]=first;
        for(int i=0;i<encoded.length;i++){
            arr[i+1]=arr[i]^encoded[i];
        }
        return arr;
        
    }
}
