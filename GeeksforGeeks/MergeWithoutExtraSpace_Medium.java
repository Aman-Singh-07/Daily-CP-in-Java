// https://www.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1

class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n=a.length;
        int m=b.length;
        int gap=nextGap(n+m);
        while(gap>0){
            int i,j;
            for(i=0;i+gap<n;i++){
                if(a[i]>a[i+gap]){
                    swap(a,i,i+gap);
                }
            }
            for(j=gap>n?gap-n:0;i<n && j<m;i++,j++){
                if(a[i]>b[j]){
                    int temp=a[i];
                    a[i]=b[j];
                    b[j]=temp;
                }
            }
            if(j<m){
                for(j=0;j+gap<m;j++){
                    if(b[j]>b[j+gap]) swap(b,j,j+gap);
                }
            }
            gap=nextGap(gap);
        }
        
    }
    
    public static int nextGap(int gap){
        if(gap<=1) return 0;
        return (gap/2)+(gap%2);
    }
    public static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
