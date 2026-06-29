// https://www.geeksforgeeks.org/problems/replace-with-xor-of-adjacent/1

class Solution {
    public void replaceElements(int[] arr) {
        // code here
        int prev=arr[0];
        arr[0]=arr[0]^arr[1];
        int i=1;
        int j=i+1;
        while(j<arr.length){
            int temp=arr[i];
            arr[i]=prev^arr[j];
            prev=temp;
            i++;
            j++;
        }
        arr[arr.length-1]=prev^arr[arr.length-1];
        
    }
}
