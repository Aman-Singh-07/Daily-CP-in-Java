// https://www.geeksforgeeks.org/problems/maximum-product-subset-of-an-array/1

class Solution {
    public int findMaxProduct(int[] arr) {
        // code here
        long res=1;
        int MOD=1000000007;
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            if(num!=0){
                res=(res*num)%MOD;
                count++;
            }
            if(num<0) max=Math.max(max,num);
            
        }
        if(arr.length==1) return arr[0];
        else if(arr.length==2){
            int product=(arr[0]*arr[1])%MOD;
            if(product>0) return product;
            if(product<0){
                if(arr[0]>0) return arr[0];
                else return arr[1];
            }
            if(product==0){
                if(arr[0]==0){
                    if(arr[1]<0) return 0;
                    else return arr[1];
                }
                if(arr[1]==0){
                    if(arr[0]<0) return 0;
                    else return arr[0];
                }
            }
        }
        if(count==0) return 0;
        if(count==1 && res<0) return 0;
        return ((int) res>0)?(int) res:(int) ((res)/max);
    }
}
