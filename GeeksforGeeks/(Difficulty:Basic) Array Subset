// https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1?page=3&sortBy=submissions

class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                i++;
            }else if(a[i]==b[j]){
                i++;
                j++;
            } else{
                return false;
            }
        }
        return j==b.length;
    }
}
