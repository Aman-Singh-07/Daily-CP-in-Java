// https://www.geeksforgeeks.org/problems/game-of-xor1541/1

class Solution {
    public int subarrayXor(int[] arr) {
        // code here
        if(arr.length%2==0) return 0;
        int res=0;
        for(int i=0;i<arr.length;i+=2){
            res^=arr[i];
        }
        return res;
    }
}
