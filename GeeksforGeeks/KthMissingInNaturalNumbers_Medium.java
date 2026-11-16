// https://www.geeksforgeeks.org/problems/k-th-missing-element-in-natural-numbers/1

class Solution {
    public int findKthSmall(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        for(int num:arr){
            if(num<=k) k++;
            else break;
        }
        return k;
        
    }
}
