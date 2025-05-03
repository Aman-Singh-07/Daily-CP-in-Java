// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/

class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        int k=1;
        for(int i=0;i<n/2;i++){
            arr[i]=k;
            arr[i+(n/2)]=-k;
            k++;
        }
        if(n%2!=0){
            arr[n-1]=0;
        }
        return arr;
        
    }
}
