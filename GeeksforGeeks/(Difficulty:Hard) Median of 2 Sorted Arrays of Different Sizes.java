// https://www.geeksforgeeks.org/problems/median-of-2-sorted-arrays-of-different-sizes/1?page=1&difficulty=Hard&status=unsolved&sortBy=submissions

// User function Template for Java

class Solution {
    public double medianOf2(int a[], int b[]) {
        // Your Code Here
        int i=0,j=0;
        int index=0;
        int[] c=new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[index++]=a[i++];
            }
            else{
                c[index++]=b[j++];
            }
        }
        while(i<a.length){
            c[index++]=a[i++];
        }
        while(j<b.length){
            c[index++]=b[j++];
        }
        if(c.length%2==0){
            return (c[(c.length/2)]+c[(c.length/2)-1])/2.0;
        }
        else return (c[((c.length)/2)]);
    }
}
