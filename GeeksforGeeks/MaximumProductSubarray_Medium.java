// https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1?page=1&status=unsolved&sortBy=submissions

class Solution {
    int maxProduct(int[] arr) {
        int n=arr.length;
        int res=arr[0];
        int maxEnding=arr[0];
        int minEnding=arr[0];
        for(int i=1;i<n;i++){
            int num=arr[i];
            if (num<0){
                int temp=maxEnding;
                maxEnding=minEnding;
                minEnding=temp;
            }
            maxEnding=Math.max(num,maxEnding*num);
            minEnding=Math.min(num,minEnding*num);
            res=Math.max(res,maxEnding);
        }
        return res;
    }
}
