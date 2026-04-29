// https://www.geeksforgeeks.org/problems/minimum-swaps-required-to-group-all-1s-together2451/1

class Solution {
    public int minSwaps(int[] arr) {
        // code here
        int count=0;
        for(int num:arr){
            if(num==1) count++;
        }
        if(count==0) return -1;
        int rep1=0;
        for(int i=0;i<count;i++){
            if(arr[i]!=0) rep1++;
        }
        int max=rep1;
        for(int i=count;i<arr.length;i++){
            rep1-=arr[i-count];
            rep1+=arr[i];
            max=Math.max(rep1,max);
        }
        return count-max;
        
        
    }
}
