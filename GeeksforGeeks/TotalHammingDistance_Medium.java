// https://www.geeksforgeeks.org/problems/total-hamming-distance/1

class Solution {
    int totHammingDist(int arr[]) {
        // code here
        
        int count=0;
        for(int i=31;i>=0;i--){
            int c=0;
            for(int num:arr){
                if(((num>>i)&1)==1) c++;
            }
            count+=(c)*(arr.length-c);
        }
        return count;
    }
}
