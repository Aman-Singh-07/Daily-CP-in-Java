// https://leetcode.com/contest/weekly-contest-461/problems/trionic-array-i/description/

class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                if(isStrictlyIncreasing(nums,0,i) && isStrictlyDecreasing(nums,i,j) && isStrictlyIncreasing(nums,j,n-1)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isStrictlyIncreasing(int[] arr,int p, int q){
        for(int i=p+1;i<=q;i++){
            if(arr[i]<=arr[i-1]) return false;
        }
        return true;
    }

    public boolean isStrictlyDecreasing(int[] arr,int p,int q){
        for(int i=p+ 1;i<=q;i++){
            if(arr[i]>=arr[i-1]) return false;
        }
        return true;
    }
}
