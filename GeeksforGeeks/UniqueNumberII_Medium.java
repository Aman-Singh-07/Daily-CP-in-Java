// https://www.geeksforgeeks.org/problems/finding-the-numbers0215/1?page=1&category=Mathematical,Bit%20Magic&status=unsolved&sortBy=submissions

class Solution {
    public int[] singleNum(int[] arr) {
        // Code here
        int[] res=new int[2];
        Arrays.sort(arr);
        int j=0;
        int i=0;
        while(i<arr.length){
            if(i==arr.length-1 || arr[i]!=arr[i+1]){
                res[j++]=arr[i];
                i++;
            }
            else i+=2;
            if(j==2) break;
        }
        return res;
    }
}
