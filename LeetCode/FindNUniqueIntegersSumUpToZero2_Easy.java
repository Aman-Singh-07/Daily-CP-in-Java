// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/?envType=daily-question&envId=2025-09-07

class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        int i=1;
        for(int j=0;j<n-1;j+=2){
            arr[j]=i;
            arr[j+1]=(-1)*i;
            i++;

        }
        if(n%2!=0) arr[n-1]=0;
        return arr;
        
    }
}
