// https://www.geeksforgeeks.org/problems/sort-the-half-sorted2157/1

class Solution {
    public void mergeTwoParts(int[] arr) {
        // code here
        int l=-1;
        int r=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                l=i-1;
                r=i;
                break;
                
            }
        }
        if(r==-1) return;
        int i=0;
        int k=0;
        int[] res=new int[arr.length];
        while(i<=l && r<arr.length){
            if(arr[i]<arr[r]){
                res[k]=arr[i];
                i++;
            }
            else{
                res[k]=arr[r];
                r++;
            }
            k++;
        }
        while(i<=l){
            res[k++]=arr[i++];
        }
        while(r<arr.length){
            res[k++]=arr[r++];
        }
        for(i=0;i<arr.length;i++) arr[i]=res[i];
        
    }
}
