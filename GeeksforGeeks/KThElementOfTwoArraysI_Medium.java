// https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i=0;
        int j=0;
        int res=a[0];
        while(k>0 && i<a.length && j<b.length){
            if(a[i]<b[j]){
                res=a[i];
                i++;
                k--;
            }else{
                res=b[j];
                j++;
                k--;
            }
        }
        while(i<a.length && k>0){
            res=a[i++];
            k--;
        }
        while(j<b.length && k>0){
            res=b[j++];
            k--;
        }
        return (k>0)?0:res;
    }
}
