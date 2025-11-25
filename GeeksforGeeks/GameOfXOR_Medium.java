// https://www.geeksforgeeks.org/problems/game-of-xor1541/1

class Solution {
    public int subarrayXor(int[] arr) {
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            int d=(n-i)*(i+1); 
            if(d%2!=0){         
                res^=arr[i];
            }
        }
        return res;
    }
}
