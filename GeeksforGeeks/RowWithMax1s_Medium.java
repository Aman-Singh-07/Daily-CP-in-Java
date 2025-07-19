// https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1?page=4&sortBy=submissions

// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int countMax1=0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            int count1=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1) count1++;
            }
            if(count1>countMax1){
                countMax1=count1;
                index=i;
            }
        }
        return index;
    }
}
