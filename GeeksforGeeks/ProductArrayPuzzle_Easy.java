// https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1?page=6&sortBy=submissions

// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int[] res=new int[arr.length];
        long multiply=1;
        int count=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0) multiply=multiply*arr[j]; 
            else count++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && count==0){
                res[i]=(int) multiply/arr[i];
            }
            else if(arr[i]!=0 && count==1){
                res[i]=0;
            }
            else if(arr[i]!=0 || count>1){
                res[i]=0;
            }
            else res[i]=(int) multiply;
        }
        return res;
    }
}
