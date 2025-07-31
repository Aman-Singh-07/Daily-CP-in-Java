// https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?page=2&status=unsolved&sortBy=submissions

class Solution {
    public int kthElement(int a[], int b[], int k) {
        int i=0,j=0,count=0;
        int result=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                result=a[i++];
            }else{
                result=b[j++];
            }
            count++;
            if (count==k) return result;
        }
        while(i<a.length){
            result=a[i++];
            count++;
            if (count==k) return result;
        }
        while(j<b.length){
            result=b[j++];
            count++;
            if(count==k) return result;
        }

        return -1; 
    }
}
