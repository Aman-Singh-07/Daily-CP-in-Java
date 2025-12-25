// https://www.geeksforgeeks.org/dsa/inversion-count-in-array-using-merge-sort/

class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        return countInversion(arr,0,arr.length-1);
    }
    public static int countInversion(int[] arr,int left,int right){
        int res=0;
        if(left<right){
            int mid=left+(right-left)/2;
            res+=countInversion(arr,left,mid);
            res+=countInversion(arr,mid+1,right);
            res+=merge(arr,left,mid,right);
        }
        return res;
    }
    public static int merge(int[] arr,int left,int mid,int right){
        int res=0;
        int n1=mid-left+1;
        int n2=right-mid;
        int[] l=new int[n1];
        int[] r=new int[n2];
        for(int i=0;i<n1;i++){
            l[i]=arr[i+left];
        }
        for(int i=0;i<n2;i++){
            r[i]=arr[i+mid+1];
        }
        int i=0;
        int j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(l[i]<=r[j]){
                arr[k++]=l[i++];
            }else{
                arr[k++]=r[j++];
                res+=(n1-i);
            }
        }
        while(i<n1) arr[k++]=l[i++];
        while(j<n2) arr[k++]=r[j++];
        
        return res;
        
        
    }
}
