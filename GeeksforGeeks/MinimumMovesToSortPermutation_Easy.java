// https://www.geeksforgeeks.org/problems/morning-assembly3038/1

class Solution {
    public int minMoves(int[] arr) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int curr=map.getOrDefault(num-1,0)+1;
            map.put(num,curr);
            maxLen=Math.max(maxLen,curr);
        }
        return arr.length-maxLen;
    }
}
